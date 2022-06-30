import java.util.Scanner;

public class DesafioUnidad3_Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el usuario:");
		String usuario = entrada.nextLine();
		System.out.println("Ingrese la clave:");
		String clave = entrada.nextLine();
		
		entrada.close();
		
		String usuarioCorrecto = "Pepito";
		String claveCorrecta = "1234";

		if (!(usuario.equalsIgnoreCase(usuarioCorrecto))) { // generalmente al escribir el usuario, es indistinto si estan en mayusculas o minusculas
			System.out.println("\nUsuario incorrecto");
		} else if (!(clave.equals(claveCorrecta))) { // en la contraseña si es importante si son mayusculas o minusculas
			System.out.println("\nClave incorrecta");
		} else {
			System.out.println("\nBienvenido " + usuario + "!");
		}
		
	}

}
