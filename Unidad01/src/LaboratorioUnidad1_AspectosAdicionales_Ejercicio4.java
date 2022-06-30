
public class LaboratorioUnidad1_AspectosAdicionales_Ejercicio4 {

	public static void main(String[] args) {
		
		boolean n1 = true, n2 = false, n3 = true;
		
		boolean res1 = n1 ^ n2;
		
		boolean res2 = (n1 & !n2) | n3;
		
		boolean res3 = (n1 | n2) & !n3;
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		
		System.out.println("\nn1 ^ n2 = " + res1);
		System.out.println("(n1 & !n2) | n3 = " + res2);
		System.out.println("(n1 | n2) & !n3 = " + res3);

	}

}
