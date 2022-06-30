import java.util.Scanner;

public class DesafioUnidad3_Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese n1:");
		double n1 = entrada.nextDouble();
		System.out.println("Ingrese n2:");
		double n2 = entrada.nextDouble();
		System.out.println("Ingrese n3:");
		double n3 = entrada.nextDouble();

		entrada.close();
		
		System.out.println("\nn1: " + n1 + "\nn2: " + n2 + "\nn3: " + n3);
		
		if ((n1 >= 0) && (n2 >= 0)) {
			System.out.println("\nn1 * n2 = " + (n1 * n2));
		} else if ((n1 >= 0) && (n3 >= 0)) {
			System.out.println("\nn1 * n3 = " + (n1 * n3));
		} else if ((n2 >= 0) && (n3 >= 0)) {
			System.out.println("\nn2 * n3 = " + (n2 * n3));
		}

	}

}
