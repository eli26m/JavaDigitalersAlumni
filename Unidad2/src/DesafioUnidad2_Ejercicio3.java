import java.util.Scanner;

public class DesafioUnidad2_Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una letra:");
		String unaLetra = entrada.nextLine();
		
		System.out.println("Ingrese otra letra:");
		String otraLetra = entrada.nextLine();
		
		entrada.close();
		
		System.out.println("\nLetra 1		->	" + unaLetra);
		char unaLetraUpper = unaLetra.toUpperCase().charAt(0); // convertir la letra ingresada, que es un String, en mayuscula, y también convertirlo en caracter
		System.out.print("ASCII de " + unaLetraUpper + "	->	" + (int) unaLetraUpper); // el caracter de la letra lo convertimos a int, asi nos devuelve su valor ASCII
		char unaLetraLower = unaLetra.toLowerCase().charAt(0);
		System.out.print("\nASCII de " + unaLetraLower + "	->	" + (int) unaLetraLower);

		System.out.println("\n\nLetra 2		->	" + otraLetra);
		char otraLetraUpper = otraLetra.toUpperCase().charAt(0);
		System.out.print("ASCII de " + otraLetraUpper + "	->	" + (int) otraLetraUpper);
		char otraLetraLower = otraLetra.toLowerCase().charAt(0);
		System.out.print("\nASCII de " + otraLetraLower + "	->	" + (int) otraLetraLower);
		
	}

}
