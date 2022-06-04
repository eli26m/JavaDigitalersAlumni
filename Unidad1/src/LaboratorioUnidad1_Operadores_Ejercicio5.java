
public class LaboratorioUnidad1_Operadores_Ejercicio5 {

	public static void main(String[] args) {
		
		/*
			RESULTADOS ESPERADOS:
			
			|   |    n1    |    n2    |    n3    |
			| A |    20    |    2     |    0     |
			| B |    15    |    2     |    1     |
			| C |    3     |    20    |    2     |
			| D |    3     |    15    |    0     |
		 */
		
		System.out.println("A");
		
		int n1 = 20;
		int n2 = 2;
		int n3 = n1 % n2;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		
		System.out.println("B");
		
		n1 = 15;
		n2 = 2;
		n3 = n1 % n2;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
		System.out.println("C");
		
		n1 = 3;
		n2 = 20;
		n3 = n2 % n1;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
		System.out.println("D");
		
		n1 = 3;
		n2 = 15;
		n3 = n2 % n1;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

}
