
public class LaboratorioUnidad1_Operadores_Ejercicio2 {

	public static void main(String[] args) {
		
		/*
			RESULTADOS ESPERADOS:
			
			|   |   x   |   y   |
			| A |   5   |   10  |
			| B |   15  |   25  |
			| C |  -10  |   35  |
			| D |  -350 | -12250|
			| E |   0   |   1   |
		*/
		
		System.out.println("A");
		
		int x = 5;
		int y = 10;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("B");
		
		x += y;
		y += x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("C");
		
		x -= y;
		y -= x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("D");
		
		x *= y;
		y *= x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("E");
		
		x /= y;
		y /= y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
