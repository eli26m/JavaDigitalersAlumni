import java.util.Scanner;

public class DesafioUnidad2_Ejercicio2 {

	public static void main(String[] args) {
		
		// ingreso de numeros:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		double num1 = entrada.nextDouble();
		System.out.println("\nIngrese otro numero:");
		double num2 = entrada.nextDouble();
		
		System.out.println("\nNumero 1 = " + num1);
		System.out.println("Numero 2 = " + num2);
		
		
		// cantidad de decimales por mostrar:
		System.out.println("\nCuantos decimales desea ver?");
		int decimales = entrada.nextInt();
		
		String decimalesString= Integer.toString(decimales); // para convertir el int en String
		String decimalesFinal = "%." + decimalesString + "f";
		
		System.out.println("\nNumero 1 con " + decimales + " decimales = " + String.format(decimalesFinal, num1));
		System.out.println("Numero 2 con " + decimales + " decimales = " + String.format(decimalesFinal, num2));
		
		System.out.println("\n" + num1 + " elevado a " + num2 + " = " + String.format(decimalesFinal, Math.pow(num1, num2)));
		
		entrada.close();

	}

}
