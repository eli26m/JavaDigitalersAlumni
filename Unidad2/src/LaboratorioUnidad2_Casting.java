import java.util.Scanner;

public class LaboratorioUnidad2_Casting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float num1, num2;
		
		System.out.println("Ingrese el numero 1:");
		num1 = scanner.nextFloat();
		
		System.out.println("Ingrese el numero 2:");
		num2 = scanner.nextFloat();
		
		scanner.close();
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float mult = num1 * num2;
		float div = num1 / num2;
		
		double sumaDouble = (double) suma;
		double restaDouble = (double) resta;
		double multDouble = (double) mult;
		double divDouble = (double) div;
		
		int sumaInt = (int) suma;
		int restaInt = (int) resta;
		int multInt = (int) mult;
		int divInt = (int) div;
		
		System.out.println("\nNumero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		
		System.out.println("\nSUMA:");
		System.out.println("\tFloat: " + suma);
		System.out.println("\tDouble: " + sumaDouble);
		System.out.println("\tInt: " + sumaInt);
		
		System.out.println("\nRESTA:");
		System.out.println("\tFloat: " + resta);
		System.out.println("\tDouble: " + restaDouble);
		System.out.println("\tInt: " + restaInt);
		
		System.out.println("\nMULTIPLICACION:");
		System.out.println("\tFloat: " + mult);
		System.out.println("\tDouble: " + multDouble);
		System.out.println("\tInt: " + multInt);
		
		System.out.println("\nDIVISION:");
		System.out.println("\tFloat: " + div);
		System.out.println("\tDouble: " + divDouble);
		System.out.println("\tInt: " + divInt);
	}
	
}
