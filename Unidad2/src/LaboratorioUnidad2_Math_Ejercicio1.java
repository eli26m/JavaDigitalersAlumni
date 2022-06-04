import java.text.DecimalFormat; // para determinar cuantos decimales mostrar
import java.text.DecimalFormatSymbols; // para cambiar el separador decimal de la coma al punto

public class LaboratorioUnidad2_Math_Ejercicio1 {

	public static void main(String[] args) {
		
		int r, g, b;
		
		
		r = (int) Math.round((Math.random() * 255) + 1);
		g = (int) Math.round((Math.random() * 255) + 1);
		b = (int) Math.round((Math.random() * 255) + 1);
		
		System.out.println("Color RGB(" + r + ", " + g + ", " + b + ")");

		double a = Math.random();
		
		DecimalFormatSymbols comaAPunto = new DecimalFormatSymbols(); // para cambiar la coma por el punto
		comaAPunto.setDecimalSeparator('.');
		DecimalFormat unDecimal = new DecimalFormat("#.#", comaAPunto); // para mostrar solo un decimal
		
		System.out.println("Color RGBA(" + r + ", " + g + ", " + b + ", " + unDecimal.format(a) + ")");
	
	}

}
