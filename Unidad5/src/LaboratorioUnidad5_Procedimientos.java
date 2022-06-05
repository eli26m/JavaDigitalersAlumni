import java.util.Scanner;

public class LaboratorioUnidad5_Procedimientos {

	// declaracion de variables globales:
	static String operation;
	static float a, b, result;
	
	public static void main(String[] args) {
		
		dataEntry();
		operations();

	}

	public static void dataEntry() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero a:");
		a = input.nextFloat();
		
		System.out.println("\nIngrese un numero b:");
		b = input.nextFloat();
		
		input.nextLine(); // para que elimine el salto de linea que queda del nextFloat anterior
		
		do {
			System.out.println("\nIngrese la operacion que desea realizar:\n\t+ -> Suma\n\t- -> Resta\n\t* -> Multiplicacion\n\t/ -> Division\n\t% -> Resto");
			operation = input.nextLine();
		} while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("%"));
		
		input.close();

	}
	
	public static void operations() {
		
		switch (operation) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		case "%":
			result = a % b;
			break;
		default:
			break;	
		}
		
		System.out.println("\n" + a + " " + operation + " " + b + " = " + result);
		
	}

}
