import java.util.Scanner;

public class LaboratorioUnidad5_Funciones_Ejercicio4 {

	public static void main(String[] args) {
		
		// get name:
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		String name = entry.nextLine();
		
		entry.close();
		
		// print salute, using the name received as parameter:
		System.out.println(sayHello(name));

	}
	
	public static String sayHello(String name) {
		
		String salute = "\nHola " + name + "!";
		return salute;
	}

}
