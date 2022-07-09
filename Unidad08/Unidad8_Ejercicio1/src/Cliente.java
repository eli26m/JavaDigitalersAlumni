
public class Cliente {

	Recibo recibo = new Recibo();
	
	public void ingresar() {
		
		Elemento elemento = new Elemento("Botella de gaseosa", 200, 300, 400, 100);
		recibo.setElementoIngresado(elemento);
		
		Elemento elemento2 = new Elemento("Lata de gaseosa", 90, 100, 100, 50);
		recibo.setElementoIngresado(elemento2);
		
		Elemento elemento3 = new Elemento("Botella de plastico", 200, 300, 200, 30);
		recibo.setElementoIngresado(elemento3);
		
	}
	
	public void imprimirRecibo() {
		
		recibo.mostrarLista();
		System.out.println("Cantidad de elementos ingresados: " + recibo.getCantidad() + "\nTOTAL A PAGAR: $" + (recibo.getTotal()));
	
	}
	
}
