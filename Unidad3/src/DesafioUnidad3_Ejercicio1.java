import java.util.Scanner;

public class DesafioUnidad3_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese n1:");
		double n1 = entrada.nextDouble();
		System.out.println("Ingrese n2:");
		double n2 = entrada.nextDouble();
		System.out.println("Ingrese n3:");
		double n3 = entrada.nextDouble();
		
		entrada.close();
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("\nn1 es el mayor");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("\nn2 es el mayor");
		} else {
			System.out.println("\nn3 es el mayor");
		}

	}

}
