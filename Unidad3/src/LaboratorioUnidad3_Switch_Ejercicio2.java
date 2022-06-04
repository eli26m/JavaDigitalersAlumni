import java.util.Scanner;

public class LaboratorioUnidad3_Switch_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		double n1 = entrada.nextDouble();
		System.out.println("Ingrese otro numero:");
		double n2 = entrada.nextDouble();
		
		boolean controlador;
		
		do {
			System.out.println("Que operacion desea hacer?\n\t+ - SUMA\n\t- - RESTA\n\t* - PRODUCTO\n\t/ - DIVISION");
			String operacion = entrada.next();
			
			switch (operacion) {
			case "+":
				System.out.println("\nn1 + n2 = " + (n1 + n2));
				controlador = false;
				break;
			case "-":
				System.out.println("\nn1 - n2 = " + (n1 - n2));
				controlador = false;
				break;
			case "*":
				System.out.println("\nn1 * n2 = " + (n1 * n2));
				controlador = false;
				break;
			case "/":
				System.out.println("\nn1 / n2 = " + (n1 / n2));
				controlador = false;
				break;
			default:
				System.out.println("OPCION NO VALIDA\n");
				controlador = true;
				break;
			}
			
		} while (controlador);
		
		entrada.close();

	}

}
