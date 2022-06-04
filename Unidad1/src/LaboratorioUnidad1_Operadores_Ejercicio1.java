
public class LaboratorioUnidad1_Operadores_Ejercicio1 {

	public static void main(String[] args) {
		
		int horas, semanas, dias, horasRestantes;
		
		horas = 1500;
		
		// calculamos las semanas dividiendo las horas por 24 * 7, que son 7 días de 24 horas.
		semanas = horas / (24 * 7);
		
		// vemos cuantas horas quedaron sobrando. Para eso calculamos cuántas horas tienen las semanas enteras resultantes, y restamos ese valor a las horas dadas al principio.
		horasRestantes = horas - (semanas * (24 * 7));
		
		// a esas horas excedentes, las dividimos por 24, para saber a cuántos días equivalen.
		dias = horasRestantes / 24;
		
		// ahora, sabiendo el numero de días, calculamos cuántas horas tienen esos días, y a las horasRestantes anteriores le restamos ese valor, obteniendo las horasRestantes finales.
		horasRestantes = horasRestantes - (dias * 24);
		
		// los resultados se van a redondear, ya que las variables son tipo int.
		
		System.out.println("Semanas: " + semanas);
		
		System.out.println("Dias: " + dias);
		
		System.out.println("Horas: " + horasRestantes);
		
		System.out.println("\n" + horas + " horas equivalen a " + semanas + " semanas, " + dias + " dias y " + horasRestantes + " horas.");

	}

}
