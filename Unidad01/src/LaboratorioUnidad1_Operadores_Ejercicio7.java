
public class LaboratorioUnidad1_Operadores_Ejercicio7 {

	public static void main(String[] args) {
		
		int n1 = 10, n2 = 20, n3 = 30;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		
		int total = n1 + n2 + n3;
		
		double promedio = total / 3;
		
		int resto = n2 % n1;
		
		System.out.println("\nTotal: " + total);
		System.out.println("Promedio: " + promedio);
		System.out.println("Resto entre n2 y n1: " + resto);

	}

}
