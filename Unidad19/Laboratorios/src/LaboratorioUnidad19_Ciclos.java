import java.util.Scanner;

public class LaboratorioUnidad19_Ciclos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Punto 1		
		int numeroUsuario, numeroRandom;
		
		numeroRandom = (int) (Math.random() * 10);
		
		System.out.println("Ingrese un numero del 0 al 10: ");
		numeroUsuario = entrada.nextInt();
		
		while (numeroUsuario != numeroRandom) {
			System.out.println("INCORRECTO!");
			System.out.println("\nIngrese un numero del 0 al 10: ");
			numeroUsuario = entrada.nextInt();
		}
		
		System.out.println("\nCORRECTO!");
		System.out.println("\n");
		
		
		// Punto 2
		String usuarioCorrecto = "eli", claveCorrecta = "clave123", usuarioIngresado, claveIngresada;
		
		System.out.println("Ingrese usuario: ");
		entrada.nextLine();
		usuarioIngresado = entrada.nextLine();
		
		System.out.println("Ingrese clave: ");
		claveIngresada = entrada.nextLine();
		
		int intentos = 1;
		while((!usuarioCorrecto.equals(usuarioIngresado) || !claveCorrecta.equals(claveIngresada)) && intentos < 3) {
			System.out.println("Datos incorrectos.\n");
			
			System.out.println("Ingrese usuario: ");
			usuarioIngresado = entrada.nextLine();
			
			System.out.println("Ingrese clave: ");
			claveIngresada = entrada.nextLine();
			
			intentos++;
		}
		
		if(usuarioCorrecto.equals(usuarioIngresado) && claveCorrecta.equals(claveIngresada)) {
			System.out.println("\nBIENVENIDO!");
		} else {
			System.out.println("\nDemasiados intentos.");
		}
		
		entrada.close();
	}

}
