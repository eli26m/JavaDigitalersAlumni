
public class LaboratorioUnidad1_AspectosAdicionales_Ejercicio1 {

	public static void main(String[] args) {
		
		/* 	
		 	En la primer expresión (variableA && variableB) || (variableA && variableC) = true, vemos que variableA si o si debe ser true, porque sino:
			
			variableA	&&	variableB
				F		&&	?(no importa)	=	F	(no importa el valor de la segunda variable, ya que como es un &&, si uno de los dos términos es false, el resultado si o si es false)
			
			variableA	&&	variableC
				F		&&	?(no importa)	=	F
				
			Entonces, ya sabemos que variableA = true.
			
			Como en (variableA && variableB) || (variableA && variableC) = true es un ||, para que sea true al menos uno de los dos miembros deben ser true. Entonces tenemos tres opciones:
			
			1) variableB = true y variableC = true:
			(variableA	&&	variableB)	||	(variableA	&&	variableC)
				V		&&    V			||		V		&&		V
						V				||				V				= true
			
			
			2) variableB = true y variableC = false:
			(variableA	&&	variableB)	||	(variableA	&&	variableC)
				V		&&    V			||		V		&&		F
						V				||				F				= true
			
			
			3) variableB = false y variableC = true:
			(variableA	&&	variableB)	||	(variableA	&&	variableC)
				V		&&    F			||		V		&&		V
						F				||				V				= true
						
			La opción de que variableB y variableC sean false NO es posible, ya que:
			(variableA	&&	variableB)	||	(variableA	&&	variableC)
				V		&&    F			||		V		&&		F
						F				||				F				= false
			
			
			Luego, viendo la segunda expresión !(variableA || variableB) && variableC = false, vemos que:
			
			(variableA	||		variableB)
			(	V		||	  ?(no importa))	=	V	(no importa el valor de la segunda variable, ya que como es un ||, si uno de los dos términos es V, el resultado si o si es true)
			
			Ahora, ya sabemos que !(variableA	||		variableB) = !V = F. Entonces:
			
			!(variableA || variableB)	&&	variableC
						F				&&	?(no importa)	= false	(no importa el valor de la segunda variable, ya que como es un &&, si uno de los dos términos es false, el resultado si o si es false)
			
			
			En conclusión, vemos que el valor de variableA debe ser si o si true. Y los valores de variableB y variableC, tienen tres posibles combinaciones:
			1) variableB = true y variableC = true
			2) variableB = true y variableC = false
			3) variableB = false y variableC = true
		*/
		
		boolean variableA, variableB, variableC;
		
		// Caso 1:
		variableA = true;
		variableB = true;
		variableC = true;
		
		boolean res1 =(variableA && variableB) || (variableA && variableC);
		boolean res2 = !(variableA || variableB) && variableC;
		
		System.out.println("CASO 1:");
		System.out.println("variableA = " + variableA);
		System.out.println("variableB = " + variableB);
		System.out.println("variableC = " + variableC);
		System.out.println("\n(variableA && variableB) || (variableA && variableC) = " + res1);
		System.out.println("!(variableA || variableB) && variableC = " + res2);
		
		
		// Caso 2:
		variableA = true;
		variableB = true;
		variableC = false;
		
		res1 =(variableA && variableB) || (variableA && variableC);
		res2 = !(variableA || variableB) && variableC;
		
		System.out.println("\n\nCASO 2:");
		System.out.println("variableA = " + variableA);
		System.out.println("variableB = " + variableB);
		System.out.println("variableC = " + variableC);
		System.out.println("\n(variableA && variableB) || (variableA && variableC) = " + res1);
		System.out.println("!(variableA || variableB) && variableC = " + res2);
		
		
		// Caso 3:
		variableA = true;
		variableB = false;
		variableC = true;
		
		res1 =(variableA && variableB) || (variableA && variableC);
		res2 = !(variableA || variableB) && variableC;
		
		System.out.println("\n\nCASO 3:");
		System.out.println("variableA = " + variableA);
		System.out.println("variableB = " + variableB);
		System.out.println("variableC = " + variableC);
		System.out.println("\n(variableA && variableB) || (variableA && variableC) = " + res1);
		System.out.println("!(variableA || variableB) && variableC = " + res2);
		
	}

}
