
public class LaboratorioUnidad1_AspectosAdicionales_Ejercicio6 {

	public static void main(String[] args) {
		
		final float IVA = 21;
		
		float precioRemera = 59.9F;
		float precioPantalon = 99.9F;
		float precioCampera = 149.9F;
		
		
		float precioRemeraIva = precioRemera + ((precioRemera * IVA)/100);
		float precioPantalonIva = precioPantalon + ((precioPantalon * IVA)/100);
		float precioCamperaIva = precioCampera + ((precioCampera * IVA)/100);
		
		
		System.out.println("REMERA:\n\tPrecio: $" + precioRemera + "\n\tPrecio con IVA: $" + precioRemeraIva);
		System.out.println("PANTALON:\n\tPrecio: $" + precioPantalon + "\n\tPrecio con IVA: $" + precioPantalonIva);
		System.out.println("CAMPERA:\n\tPrecio: $" + precioCampera + "\n\tPrecio con IVA: $" + precioCamperaIva);

	}

}
