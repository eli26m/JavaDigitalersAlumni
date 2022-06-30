
public class DesafioUnidad4_Ejercicio2 {

	public static void main(String[] args) {
		
		float inversion = 1000, interes = 0;
		
		for (int mes = 1; mes <= 12; mes++) {
			interes = (inversion * 2) / 100;
			inversion += interes;
			System.out.println("Mes " + mes + "	->	Intereses del mes: $" + String.format("%.2f", interes) + " 	Cantidad total del mes: $" + String.format("%.2f", inversion));
		}
		
		System.out.println("\nCANTIDAD FINAL AL CABO DE 12 MESES: $" + String.format("%.2f", inversion));

	}

}
