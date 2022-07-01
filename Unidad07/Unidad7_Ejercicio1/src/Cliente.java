
public class Cliente {

	public void ingresar() {
		
		Recibo recibo = new Recibo();
		
		Elemento elemento = new Elemento("Botella de gaseosa", 200, 300, 400, 100);
		
		recibo.sumarCantidad();
		
		Elemento elemento2 = new Elemento("Botella de gaseosa", 200, 300, 400, 100);
		
		recibo.sumarCantidad();
		
		recibo.mostrarCantidad();
		
	}
	
}
