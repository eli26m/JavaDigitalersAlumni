
public class Cliente {

	Elemento elemento = new Elemento();
	Recibo recibo = new Recibo();

	public void ingresar() {
		
		
		elemento.setTipoElemento("Botella de gaseosa");
		elemento.setAncho(100.00);
		elemento.setAlto(300.00);
		elemento.setPeso(200.00);
		elemento.setValor(50.00);
		
		
		System.out.println(recibo.getElementoIngresado());
		recibo.sumarCantidad();
		
	}
	
	public void imprimirRecibo() {
		
		recibo.calcularTotal();
		System.out.println(recibo.getTotal());
		
	}
	
}
