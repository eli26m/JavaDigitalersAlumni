
public class LaboratiorioUnidad4_For_Ejercicio10 {

	public static void main(String[] args) {
		
		String acumulador = "@@@@", acumulador2 = "";
		
		for (int i = 1; i <= acumulador.length(); i++) {
			acumulador2 = acumulador.substring(0, i);
			System.out.println(acumulador2);
		}
	
		for (int j = acumulador.length() - 1; j >= 1; j--) {
			acumulador2 = acumulador.substring(0, j);
			System.out.println(acumulador2);
		}
	
	}

}
