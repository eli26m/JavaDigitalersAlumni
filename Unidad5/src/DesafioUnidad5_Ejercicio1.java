import java.util.Arrays;

public class DesafioUnidad5_Ejercicio1 {

	static int numbers[] = {10, 20, 5, 15, 30, 20};
	
	public static void main(String[] args) {
		
		System.out.println("1. VALORES DEL ARRAY:");
		printArray();
		
		System.out.println("\n2. TOTAL DEL VECTOR:");
		addArray();
		
		System.out.println("\n3. POSICIONES IMPARES:");
		showOddNumbers();
		
		System.out.println("\n4. NUMERO MAXIMO:");
		findMaxNumber();
		
		System.out.println("\n5. CUANTAS VECES APARECE EL NUMERO 20:");
		findTwenty();

	}

	public static void printArray() {
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Indice: " + i + "	Valor: " + numbers[i]);
		}
		
	}
	
	public static void addArray() {
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (i != numbers.length - 1) {
				System.out.print(numbers[i] + " + ");
			} else {
				System.out.print(numbers[i] + " = ");
			}
			
			sum += numbers[i];
			
		}
		
		System.out.println(sum);
		
	}
	
	public static void showOddNumbers() {
		
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println("Indice: " + i + "	Valor: " + numbers[i]);
		}
		
	}
	
	public static void findMaxNumber() {
		
		int[] orderedNumbers = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(orderedNumbers);
		System.out.println(orderedNumbers[orderedNumbers.length - 1]);
	
	}
	
	public static void findTwenty() {
		
		int auxCounter = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 20) {
				auxCounter++;
			}
			
		}
		
		System.out.println("El numero 20 aparece " + auxCounter + " veces.");
	}
	
}
