import java.util.Scanner;

public class LaboratorioUnidad5_Funciones_Ejercicio3 {

	public static void main(String[] args) {
		
		printMessage();

	}

	public static void printMessage() {

		Scanner entry = new Scanner(System.in);
		
		System.out.println("Ingrese un mensaje:");
		String message = entry.nextLine();
		System.out.println("Cuantas veces desea imprimirlo?");
		int times = entry.nextInt();
		
		entry.close();
		System.out.println();
		
		for (int i = 0; i < times; i++) {
			System.out.println(message);			
		}
		
	}
}
