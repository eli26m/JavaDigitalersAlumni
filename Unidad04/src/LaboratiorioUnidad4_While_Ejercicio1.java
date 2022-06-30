import java.util.Scanner;

public class LaboratiorioUnidad4_While_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero = 1, suma = 0;
		
		while (numero != 0) {
			System.out.println("Ingrese 0 si desea salir. De lo contrario, ingrese un numero cualquiera:");
			numero = entrada.nextDouble();
			suma += numero;
		}
		
		entrada.close();
		
		System.out.println("Suma total: " + suma);

	}

}
