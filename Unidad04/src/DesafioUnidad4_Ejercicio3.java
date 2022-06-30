
public class DesafioUnidad4_Ejercicio3 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int i = 2; i <= 25; i += 2) {
			suma += i;
			System.out.println("Suma parcial = " + (suma - i) + "	+	i = " + i + "	->	" + suma);
		}
		
		System.out.println("\nSUMA DE LOS PRIMEROS 25 PARES:	" + suma);
		
	}

}
