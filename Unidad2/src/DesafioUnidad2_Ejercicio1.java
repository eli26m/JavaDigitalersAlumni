import java.util.Scanner;

public class DesafioUnidad2_Ejercicio1 {

	public static void main(String[] args) {
		
		// ingreso de nombre y apellido:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese nombre y apellido:");
		String nombreYApellido = entrada.nextLine();
		
		entrada.close();
		
		// dividir nombre y apellido:
		int espacio = nombreYApellido.indexOf(" ");
		
		String nombre = nombreYApellido.substring(0, espacio);
		String apellido = nombreYApellido.substring(espacio + 1);
		
		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellido: " + apellido);
	
		// mostrar iniciales en mayúsculas:
		String primerLetraNombre = nombre.substring(0, 1).toUpperCase();
		String restoDeLetrasNombre = nombre.substring(1).toLowerCase();
		System.out.println("\nPrimera letra del nombre en mayuscula: " + primerLetraNombre + restoDeLetrasNombre);
	
		String primerLetraApellido = apellido.substring(0, 1).toUpperCase();
		String restoDeLetrasApellido = apellido.substring(1).toLowerCase();
		System.out.println("Primera letra del apellido en mayuscula: " + primerLetraApellido + restoDeLetrasApellido);
		
	}

}
