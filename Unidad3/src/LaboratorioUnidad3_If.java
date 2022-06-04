
public class LaboratorioUnidad3_If {

	public static void main(String[] args) {
		
		/*
			RESULTADOS ESPERADOS:
			
			|		|	n1	|	n2	|	n3	|
			|	A	|	20	|	10	|	20	|
			|	B	|	20	|	10	|	0	|
			|	C	|	20	|	10	|	0	|
			|	D	|	20	|	10	|	20	|
		*/
		
		System.out.println("A");
		int n1 = 20;
		int n2 = 10;
		int n3 = (n1 > n2)? n1 : 0;
		System.out.println(n3);
		
		System.out.println("B");
		n1 = 20;
		n2 = 10;
		n3 = (n1 < n2)? n1 : 0;
		System.out.println(n3);
		
		System.out.println("C");
		n1 = 20;
		n2 = 10;
		n3 = (n1 == n2)? n1 : 0;
		System.out.println(n3);
		
		System.out.println("D");
		n1 = 20;
		n2 = 10;
		n3 = (n1 != n2)? n1 : 0;
		System.out.println(n3);

	}

}
