
public class DesafioUnidad5_Ejercicio2 {

	static float inflation[] = {0.8f, 0.1f, 0.3f, 0.4f, 0.3f, 0.6f, 0.5f, 0.3f, 0.7f, 0.3f, 0.2f, 0.9f};
	
	public static void main(String[] args) {
		
		System.out.print("1. INFLACION ANUAL -> ");
		System.out.println(totalInflation());
		
		System.out.print("\n2. INFLACION MAS BAJA -> ");
		minInflation();
		
		System.out.print("\n3. INFLACION MAS ALTA -> ");
		maxInflation();
		
		System.out.print("\n4. INFLACION PROMEDIO -> ");
		averageInflation();

	}
	
	public static float totalInflation() {
		
		float sum = 0;
		
		for (int i = 0; i < inflation.length; i++) {
			sum += inflation[i];
		}
		
		return sum;
	}
	
	public static void minInflation() {

		float min = inflation[0];
		byte mes = 0;
		
		for (int i = 0; i < inflation.length; i++) {
			if (inflation[i] < min) {
				mes = (byte) (i + 1);
				min = inflation[i];
			}
		}
		
		System.out.println("Mes " + mes + " = " + min);
	}
	
	public static void maxInflation() {

		float max = inflation[0];
		byte mes = 0;
		
		for (int i = 0; i < inflation.length; i++) {
			if (inflation[i] > max) {
				mes = (byte) (i + 1);
				max = inflation[i];
			}
		}
		
		System.out.println("Mes " + mes + " = " + max);
	}
	
	public static void averageInflation() {
		
		float average = 0;
		
		average = totalInflation() / inflation.length;
		
		System.out.println(String.format("%.2f", average));
		
	}

}
