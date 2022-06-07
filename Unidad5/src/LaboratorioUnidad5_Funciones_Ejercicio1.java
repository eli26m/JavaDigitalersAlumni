import java.util.Scanner;

public class LaboratorioUnidad5_Funciones_Ejercicio1 {

	// declaration of global variables:
	static String sentence, words[];
	static boolean isWord = false, isNumber = false, isPalindrome = false;
	
	public static void main(String[] args) {
		
		enterData();
		System.out.println();
		determineAndShowPalindrome();
		
	}

	// data entry and break in words:
	public static void enterData() {
		
		Scanner entry = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese una oracion (solo letras o numeros):");
			sentence = entry.nextLine().toLowerCase(); // convert all to lower case, to avoid errors when comparing
		} while (sentence.length() == 0);
			
		entry.close();
		
		words = sentence.split(" ");

	}
	
	// determine if it is a word or a number:
	public static void determineWordOrNumber(String wordOrNumber) {
		
			if (wordOrNumber.matches("[a-z]*") && !wordOrNumber.matches("[0-9]*")) {
				isWord = true;
				isNumber = false;
			} else if (!wordOrNumber.matches("[a-z]*") && wordOrNumber.matches("[0-9]*")) {
				isNumber = true;
				isWord = false;
			}
			
	}
	
	// determine if the word or number is a palindrome:
	public static void determineAndShowPalindrome() {
		
		for (int i = 0; i < words.length; i++) {
			
			StringBuffer auxWord = new StringBuffer(words[i]); // to use the method reverse(), we must create a variable StringBuffer
			String reverseWord = auxWord.reverse().toString(); // reverse() reverses the word, and toString converts it to a String again
			
			if (words[i].equals(reverseWord) && words[i].length() > 1) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
			
			determineWordOrNumber(words[i]);
			
			if (isWord && isPalindrome) {
				System.out.println("La palabra " + words[i] + " es un palindromo.");
			} else if (isWord) {
				System.out.println("La palabra " + words[i] + " no es un palindromo.");
			} else if (isNumber && isPalindrome) {
				System.out.println("El numero " + words[i] + " es capicua.");
			} else if (isNumber) {
				System.out.println("El numero " + words[i] + " no es un capicua.");
			}
			
		}
	}
	
}
