import java.util.Scanner;

public class LaboratorioUnidad3_IfElse_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese usuario:");
		String usuario = entrada.nextLine();
		System.out.println("Ingrese clave:");
		String clave = entrada.nextLine();
		
		entrada.close();
		
		String usuarioCorrecto = "persona";
		String claveCorrecta = "1234";
		
		if ((usuario.equals(usuarioCorrecto)) && (clave.equals(claveCorrecta))) {
			System.out.println("\nBIENVENIDO AL SISTEMA");
		} else {
			System.out.println("\nCREDENCIALES INCORRECTAS");
		}

	}

}
