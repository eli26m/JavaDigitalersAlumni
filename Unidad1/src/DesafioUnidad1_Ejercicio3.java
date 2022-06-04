
public class DesafioUnidad1_Ejercicio3 {

	public static void main(String[] args) {
		
		/*
			RESULTADOS ESPERADOS:
		
			|		|	x		|	y		|
			|	A	|	10		|	20		|
			|	B	|	30		|	50		|
			|	C	|	-20		|	70		|
			|	D	|	-1400	|	1960000	|
			|	E	|	-1400	|	0		|
		 */
	
		System.out.println("A");
		
		int x = 10;
		int y = 20;
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("B");
		
		x = x + y;
		y = y + x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("C");
		
		x = x - y;
		y = y - x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("D");
		
		x = x * y;
		y = x * x;
		
		System.out.println(x);
		System.out.println(y);
	
		
		System.out.println("E");
		
		x = y / x;
		y = x / y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
