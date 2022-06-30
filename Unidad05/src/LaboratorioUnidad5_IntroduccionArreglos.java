import java.util.Scanner;
import java.util.Arrays;

public class LaboratorioUnidad5_IntroduccionArreglos {

	public static void main(String[] args) {
		
		// INGRESAR UNA ORACION QUE NO ESTE VACIA:
		Scanner entrada = new Scanner(System.in);
		
		String oracion;
		do {
			System.out.println("Ingrese una oracion(no puede estar vacia):");
			oracion = entrada.nextLine();
		} while (oracion.isEmpty());
		
		entrada.close();
		
		
		
		// CONTAR LAS PALABRAS:
		String palabras[];
		
		// mi intencion es que la oracion pueda contener signos de puntuacion y aun asi me divida correctamente las palabras.
		// primero voy a "limpiar" los signos de puntuacion, y convertirlos en espacios:
		oracion = oracion.replace(",", " ");
		oracion = oracion.replace(";", " ");
		oracion = oracion.replace(".", " ");
		oracion = oracion.replace(":", " ");
		oracion = oracion.replace("¿", " ");
		oracion = oracion.replace("?", " ");
		oracion = oracion.replace("¡", " ");
		oracion = oracion.replace("!", " ");
		oracion = oracion.replace("(", " ");
		oracion = oracion.replace(")", " ");
		oracion = oracion.replace("-", " ");
		oracion = oracion.replace("\"", " ");
		oracion = oracion.replace("\'", " ");
		// si hay mas de un espacio consecutivo, lo volvemos un solo espacio:
		oracion = oracion.replaceAll(" +", " "); // replace funciona en el tipo de datos char pero replaceAll funciona en el tipo de datos string, lo cual nos permite pasarle el valor " +" que significa "mas de un espacio"
		// tambien quitamos los acentos:
		oracion = oracion.replace("á", "a");
		oracion = oracion.replace("é", "e");
		oracion = oracion.replace("í", "i");
		oracion = oracion.replace("ó", "o");
		oracion = oracion.replace("ú", "u");
		// convertir todo a minusculas, para evitar problemas cuando busquemos palabras repetidas:
		oracion = oracion.toLowerCase();
		// luego voy a dividir todas las palabras, que ahora estan separadas por espacios
		palabras = oracion.split(" ");
		System.out.println("\n1) NUMERO DE PALABRAS: " + palabras.length);
		
		
		
		// BUSCAR PALABRAS REPETIDAS:
		System.out.println("\n2) PALABRAS QUE SE REPITEN:\n");
		String palabraAuxiliar = palabras[0];
		String palabrasRepetidas = "";
		int contadorGlobal = 0;
		
		for (int i = 0; i < palabras.length; i++) {
			
			int contadorPalabraRepetida = 1;
			palabraAuxiliar = palabras[i];
			
			if ((!palabrasRepetidas.contains("\"" + palabras[i] + "\""))) { // para verificar si mi palabra ya se encuentra en palabrasRepetidas, la busco entre comillas, que fue como la concatené antes. Lo hice de este modo, porque si no surgía un error cuando analizaba ciertas palabras. Por ejemplo, si antes se habia repetido la palabra "mala", y ya estaba en palabrasRepetidas, cuando analizaba la palabra "la", se la salteaba, ya que consideraba que se encontraba en palabrasRepetidas, porque "la" es parte de "mala".
				
				for (int j = i + 1; j < palabras.length; j++) {
					if (palabras[j].equals(palabraAuxiliar)) {
						contadorPalabraRepetida++;
					}
				}
				
				if (contadorPalabraRepetida > 1) {
					System.out.println("La palabra \"" + palabras[i] + "\" se repite " + contadorPalabraRepetida + " veces.");
					palabrasRepetidas = palabrasRepetidas.concat("\"" + palabras[i] + "\"");
					contadorGlobal++;
				}
			}	
		}
		if (contadorGlobal != 0) {
			String palabrasRepetidasArray[] = palabrasRepetidas.split("\"\"");
			palabrasRepetidasArray[0] = String.format(palabrasRepetidasArray[0]).replace("\"", "");
			int indiceArray = palabrasRepetidasArray.length - 1;
			palabrasRepetidasArray[indiceArray] = String.format(palabrasRepetidasArray[indiceArray]).replace("\"", "");
			// cuando aplico el split a palabrasRepetidas, lo divido por las comillas dobles que quedan entre las palabras. Pero a la izquierda de la primer palabra me queda una sola comilla, al igual que a la derecha de la ultima palabra. Por eso modifique solo la primer palabra y la ultima, para quitarle esa comilla.
			System.out.println("\nHay " + contadorGlobal + " palabras que se repiten: " + Arrays.toString(palabrasRepetidasArray));
		} else {
			System.out.println("No hay palabras que se repitan.");
		}
		
		
		// ORDENAR LAS PALABRAS DE FORMA ASCENDENTE:
		Arrays.sort(palabras); // ordenar las palabras
		System.out.println("\n3) PALABRAS ORDENADAS DE FORMA ASCENDENTE:\n" + Arrays.toString(palabras));
		
		
		
		// ORDENAR LAS LETRAS:
		oracion = oracion.replace(" ", "");
		
		char letras[] = oracion.toCharArray(); // toCharArrays devuelve un arreglo de caracteres
		
		Arrays.sort(letras); // ordenar los caracteres
		
		System.out.println("\n4) LETRAS ORDENADAS:\n" + Arrays.toString(letras));
		
	}
	
	/* 
		Oracion de prueba:
		
		Había una vez un hombre invisible, que se cansó de que no lo vieran. No es que fuera de verdad invisible. Sino que la gente se había acostumbrado a no verlo. Y si nadie te ve, ¿se puede decir que estés ahí?
		El señor y la señora Dursley, que vivían en el número 4 de Privet Drive, estaban orgullosos de decir que eran muy normales, afortunadamente. Eran las últimas personas que se esperaría encontrar relacionadas con algo extraño o misterioso, porque no estaban para tales tonterías. 
	*/

}

