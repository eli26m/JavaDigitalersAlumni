
public class LaboratiorioUnidad4_While_Ejercicio4 {

	public static void main(String[] args) {
		
		int numero = 0, suma = 0;
		
		while (numero < 10) {
			numero++;
			suma += numero;
			System.out.print(numero);
			
			// este if lo use solo para que el simbolo + no aparezca luego del 10:
			if (numero != 10) {
				System.out.print(" + ");
			}
		}
		
		System.out.print(" = " + suma);

	}

}
