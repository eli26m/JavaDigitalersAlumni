import java.util.Scanner;

public class DesafioUnidad19_Ejercicio2 {

	public static void main(String[] args) {
		
		// ingreso de datos:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique el numero a multiplicar: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Indique por cuanto multiplicar: ");
		int num2 = entrada.nextInt();
		
		entrada.close();
		
		
		
		// multiplicar:
		int resultado = 0;
		
		// ambos positivos:
		if ((num1 >= 0) && (num2 >= 0)) {
			for(int i = 0; i < num2; i++) {
				resultado += num1;
			}
		}
		
		// negativo x positivo:
		if ((num1 < 0) && (num2 >= 0)) {
			int num1Aux = -num1;
			
			for(int i = 0; i < num2; i++) {
				resultado += num1Aux;
			}
			
			resultado = - resultado;
		}
		
		// positivo x negativo:
		if ((num1 >= 0) && (num2 < 0)) {
			int num2Aux = -num2;
			
			for(int i = 0; i < num2Aux; i++) {
				resultado += num1;
			}
			
			resultado = - resultado;
		}
		
		// ambos negativos:
		if ((num1 < 0) && (num2 < 0)) {
			int num1Aux = -num1, num2Aux = -num2;
			
			for(int i = 0; i < num2Aux; i++) {
				resultado += num1Aux;
			}
		}
		
		
		System.out.println("\n" + num1 + " x " + num2 + " = " + resultado);

	}

}
