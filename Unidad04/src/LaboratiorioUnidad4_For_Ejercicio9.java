
public class LaboratiorioUnidad4_For_Ejercicio9 {

	public static void main(String[] args) {
		
		String acumulador = "@@@@@";
		
		for (int i = acumulador.length(); i >= 1; i--) {
			acumulador = acumulador.substring(0, i);
			System.out.println(acumulador);
		}

	}

}
