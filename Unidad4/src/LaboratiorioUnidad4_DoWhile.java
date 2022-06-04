import java.util.Scanner;

public class LaboratiorioUnidad4_DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, mayor = -2147483648, menor = 2147483647, suma = 0;
		// inicializamos el mayor con el numero menor posible en Java, y el menor con el numero mayor posible en Java.
		
		do {
			System.out.println("Ingrese 0 si desea salir. De lo contrario, ingrese un numero cualquiera:");
			numero = entrada.nextInt();
			suma += numero;
			
			/* 	es importante añadir la condicion de que numero no sea cero,
			 	porque sino cuando el usuario ingrese el cero para cerrar el programa,
			 	antes de salir del bucle se ejecutarán los dos if, y eso moficará
			 	el valor del mayor o del menor. 
			*/ 
			if ((numero > mayor) && (numero != 0)) {
				mayor = numero;
			}
			
			if ((numero < menor) && (numero != 0)) {
				menor = numero;
			}
		
		} while (numero != 0);
			
		entrada.close();
		
		System.out.println("Suma total: " + suma);
		System.out.println("Mayor numero: " + mayor);
		System.out.println("Menor numero: " + menor);

	}

}
