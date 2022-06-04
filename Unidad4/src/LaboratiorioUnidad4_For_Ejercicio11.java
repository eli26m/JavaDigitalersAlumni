
public class LaboratiorioUnidad4_For_Ejercicio11 {

	public static void main(String[] args) {
		
		String acumulador = "@@@@@", acumulador2 = "";
		
		for (int i = 5; i >= 1; i -= 2) {
			acumulador2 = acumulador.substring(0,i);
			System.out.println(acumulador2);
		}
	
		for (int j = 3; j <= 5; j += 2) {
			acumulador2 = acumulador.substring(0,j);
			System.out.println(acumulador2);
		}
		
	}

}
