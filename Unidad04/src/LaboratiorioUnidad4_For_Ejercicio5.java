
public class LaboratiorioUnidad4_For_Ejercicio5 {

	public static void main(String[] args) {
		
		int suma = 0, resta = 0, mult = 1; // la multiplicacion debe iniciar en 1, porque el cero volvería cero el resultado siempre.
		
		for (int i = 1; i <= 5; i++) {
			mult *= i;
			if (i == 5) {
				System.out.print(i + " = " + mult + "\n");
			} else {
				System.out.print(i + " * ");
			}
		}
		
		for (int i = 1; i <= 5; i++) {
			suma += i;
			if (i == 5) {
				System.out.print(i + " = " + suma + "\n");
			} else {
				System.out.print(i + " + ");
			}
		}
			
		resta = mult - suma;
		System.out.println("\n" + mult + " - " + suma + " = " + resta);

	}

}
