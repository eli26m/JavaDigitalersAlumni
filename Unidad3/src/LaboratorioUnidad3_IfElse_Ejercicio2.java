import java.util.Scanner;

public class LaboratorioUnidad3_IfElse_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura:");
		float temp = entrada.nextFloat();
		
		System.out.println("Ingrese tiempo:\n\t\t1 - Nieve\n\t\t2 - Lluvia\n\t\t3 - Soleado");
		byte tiempo = entrada.nextByte();
		
		entrada.close();
		
		if ((temp < 10) && (tiempo == 1)) {
			System.out.println("Esquiar");
		} else if ((temp < 10) && (tiempo == 2)) {
			System.out.println("Quedarse en casa o salir con paraguas y campera");
		} else if ((temp >= 10) && (temp <= 15) && (tiempo == 3)) {
			System.out.println("Caminar con campera");
		} else if ((temp > 15) && (temp <= 25) && (tiempo == 3)) {
			System.out.println("Caminar");
		} else if (temp > 25 && (tiempo == 3)) {
			System.out.println("Caminar y tomar sol");
		}

	}

}
