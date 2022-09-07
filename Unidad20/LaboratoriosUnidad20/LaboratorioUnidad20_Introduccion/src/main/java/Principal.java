import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Persona personas[];
		System.out.println("Cuantas personas ingresara?: ");
		int cantidadPersonas = entrada.nextInt();
		personas = new Persona[cantidadPersonas];
		
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona();
			System.out.println("\nIngrese Nombre de la persona " + (i + 1) + ": ");
			entrada.nextLine();
			personas[i].setNombre(entrada.nextLine());
			System.out.println("Ingrese Apellido de la persona " + (i + 1) + ": ");
			personas[i].setApellido(entrada.nextLine());
			System.out.println("Ingrese tipo de documento de la persona " + (i + 1) + ": ");
			personas[i].setTipoDocumento(entrada.nextLine());
			System.out.println("Ingrese numero de documento de la persona " + (i + 1) + ": ");
			personas[i].setNroDocumento(entrada.nextInt());
			System.out.println("Ingrese edad de la persona " + (i + 1) + ": ");
			personas[i].setEdad(entrada.nextInt());
		}
		
		entrada.close();
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("\n" + personas[i].mostrarDatos());
		}
	}

}
