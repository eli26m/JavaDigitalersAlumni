import java.util.Scanner;

public class LaboratorioUnidad5_Funciones_Ejercicio2 {

	static int num1;
	static double num2;
	
	public static void main(String[] args) {
		
		enterData();
		add(num1, num2);

	}
	
	public static void enterData() {
		
		String auxNum;
		boolean flag;
		
		Scanner entry = new Scanner(System.in);
	
		// verify that an integer is entered, otherwise, repeat:
		do {
			System.out.println("Ingrese un numero entero:");
			auxNum = entry.nextLine();
			
			if (auxNum.contains(",") || !auxNum.matches("[0-9]*")) {
				flag = true;
			} else {
				flag = false;
			}
			
		} while (flag);
		
		num1 = Integer.parseInt(auxNum);

		// verify that an decimal number is entered, otherwise, repeat:
		do {
			System.out.println("Ingrese un numero decimal:");
			auxNum = entry.nextLine();
			
			if (!auxNum.matches("[a-z]*")) {
				flag = false;
			} else {
				flag = true;
			}
		
		} while (flag);
		
		num2 = Double.parseDouble(auxNum);
		
		entry.close();
		
	}
	
	public static void add(int number1, double number2) {
		
		double sum = number1 + number2;
		
		System.out.println("\n" + number1 + " + " + number2 + " = " + sum);
		
	}

}
