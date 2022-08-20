import java.util.Scanner;

public class LaboratorioFinalUnidad19 {

	public static void main(String[] args) {
		
		//ingresar datos:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de notas que ingresara: ");
		int cantidad = entrada.nextInt();
		
		double notas[] = new double[cantidad];
		String nombres[] = new String[cantidad];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("\nIngrese nota del alumno " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
			System.out.println("Ingrese nombre del alumno " + (i + 1) + ": ");
			entrada.nextLine();
			nombres[i] = entrada.nextLine();
		}
		
		entrada.close();
		
		
		// calcular promedio, nota maxima, nota minima:
		int contador = 0;
		double acumulador = 0, promedio, max = notas[0], min = notas[0];
		String alumnoMax = "", alumnoMin = "";
		
		for(int i = 0; i < notas.length; i++) {
			acumulador += notas[i];
			contador++;
			
			if(max < notas[i]) {
				max = notas[i];
				alumnoMax = nombres[i];
			}
			
			if(min > notas[i]) {
				min = notas[i];
				alumnoMin = nombres[i];
			}
		}
		
		promedio = acumulador / contador;
		
		System.out.println("\nPromedio de las notas: " + promedio);
		System.out.println("Nota mayor: " + max + "\tAlumno: " + alumnoMax);
		System.out.println("Nota menor: " + min + "\tAlumno: " + alumnoMin);
		
		
		// ordenar arrays:
		double notasOrdenadas[] = new double[cantidad];
		String nombresOrdenados[] = new String[cantidad];
		
		double notaAux;
		String nombreAux = "";
		int posMax = 0;
	
		for (int i = 0; i < notas.length; i++) {
			notaAux = notas[i];
			nombreAux = nombres[i];
			posMax = i;
			
			notasOrdenadas[i] = notas[i];
			nombresOrdenados[i] = nombres[i];
			
			for (int j = i + 1; j < notas.length; j++) {
				if (notaAux < notas[j]) {
					notaAux = notas[j];
					nombreAux = nombres[j];
					posMax = j;
				}
			}
			
			notasOrdenadas[i] = notaAux;
			nombresOrdenados[i] = nombreAux;
			
			notas[posMax] = notas[i];
			nombres[posMax] = nombres[i];
		}
		
		System.out.println("\nNotas ordenadas:");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota: " + notasOrdenadas[i]);
			System.out.println("\tNombre: " + nombresOrdenados[i]);
		}
		
	}

}
