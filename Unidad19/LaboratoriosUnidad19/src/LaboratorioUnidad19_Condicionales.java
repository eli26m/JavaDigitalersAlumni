
public class LaboratorioUnidad19_Condicionales {

	public static void main(String[] args) {
		
		// Punto 1
		int var1 = 3, var2 = 5, var3 = 1, aux = var1;
		
		if (var1 < var2) {
			aux = var2;
			if (var2 < var3) {
				aux = var3;
				System.out.println("Mayor: var3 = " + aux);
			} else {
				System.out.println("Mayor: var2 = " + aux);
			}
		} else if (var1 < var3) {
			aux = var3;
			System.out.println("Mayor: var3 = " + aux);
		} else {
			System.out.println("Mayor: var1 = " + aux);
		}
		
		System.out.println("");

		
		// Punto 2
		int num1 = 20, num2 = 7, res, operacion = 1;
		
		if (operacion == 1) {
			res = num1 + num2;
			System.out.println("num1 + num2 = " + res);
		} else if (operacion == 2) {
			res = num1 - num2;
			System.out.println("num1 - num2 = " + res);
		} else if (operacion == 3) {
			res = num1 * num2;
			System.out.println("num1 * num2 = " + res);
		} else if (operacion == 4) {
			res = num1 / num2;
			System.out.println("num1 / num2 = " + res);
		}
		
		System.out.println("");
		
		// Punto 3:
		int num3 = 5, num4 = 3, res2;
		char operacion2 = 'm';
		
		switch (operacion2) {
		case 's':
			res2 = num3 + num4;
			System.out.println("num3 + num4 = " + res2);
			break;
		case 'r':
			res2 = num3 - num4;
			System.out.println("num3 - num4 = " + res2);
			break;
		case 'm':
			res2 = num3 * num4;
			System.out.println("num3 * num4 = " + res2);
			break;
		case 'd':
			res2 = num3 / num4;
			System.out.println("num3 / num4 = " + res2);
			break;
		default:
			break;
		}
		
	}

}
