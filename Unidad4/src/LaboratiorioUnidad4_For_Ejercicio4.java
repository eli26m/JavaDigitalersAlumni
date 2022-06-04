
public class LaboratiorioUnidad4_For_Ejercicio4 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("suma parcial = " + suma + "	+	i = " + i + "	->	" + (suma + i));
			suma += i;
		}
		
		System.out.println("\nSUMA TOTAL: " + suma);

	}

}
