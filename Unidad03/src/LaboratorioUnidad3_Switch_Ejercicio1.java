import java.util.Scanner;

public class LaboratorioUnidad3_Switch_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Gracias por contactarte con nosotros!\nEn que podemos ayudarte?\n\nA) Documentacion\nB) Cotizacion\nC) Asistencia\nD) Siniestros\nE) Informacion de Pagos\nF) Otras Consultas\nG) Anulacion\n\nEscribe la letra de la opcion seleccionada.");
		char opcion = entrada.nextLine().charAt(0);
		
		entrada.close();
		
		switch (opcion) {
		case 'A':
		case 'a':
			System.out.println("\nHa seleccionado Documentacion");
			break;
		case 'B':
		case 'b':
			System.out.println("\nHa seleccionado Cotizacion");
			break;
		case 'C':
		case 'c':
			System.out.println("\nHa seleccionado Asistencia");
			break;
		case 'D':
		case 'd':
			System.out.println("\nHa seleccionado Siniestros");
			break;
		case 'E':
		case 'e':
			System.out.println("\nHa seleccionado Informacion de Pagos");
			break;
		case 'F':
		case 'f':
			System.out.println("\nHa seleccionado Otras consultas");
			break;
		case 'G':
		case 'g':
			System.out.println("\nHa seleccionado Anulacion");
			break;
		default:
			System.out.println("\nOpcion no valida");
			break;
		}

	}

}
