import java.util.Scanner;

public class LaboratorioUnidad2_Math_Ejercicio2 {

	public static void main(String[] args) {
		
		// ingreso de la palabra:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra:");
		String palabra = entrada.nextLine();
		
		entrada.close();
		
		
		// generar número aleatorio entre 97 y 122 y convertirlo a letra:
		
		// la formula para obtener un numero aleatorio entre dos numeros (maximo, minimo) es -> Math.random()*(maximo - minimo + 1) + minimo
		int numero = (int)(Math.random() * 26 + 97); // 122 - 97 + 1 = 26
		char numeroALetra = (char) numero;
		
		System.out.println("Numero Aleatorio: " + numero + "\nLetra que representa: " + numeroALetra);

		
		// comprobar si la letra generada está en la palabra ingresada:
		String letra = String.valueOf(numeroALetra); // convierte el caracter en un string, sino no podriamos utilizar contains
		System.out.println("La palabra " + palabra + " contiene la letra " + numeroALetra + "? -> " + palabra.contains(letra));
		
	}

}
