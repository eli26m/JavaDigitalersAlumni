
public class Recibo extends Elemento{
	
	private String ElementoIngresado;
	private int Cantidad;
	private double Total;
	
	public Recibo(){
		ElementoIngresado = this.getTipoElemento();
		Cantidad = 0;
		Total = 0;
	}
	
	public String getElementoIngresado() {
		return ElementoIngresado;
	}
	
//	public void setElementoIngresado() {
//		ElementoIngresado = this.getTipoElemento();
//	}
	
	public int getCantidad() {
		return Cantidad;
	}
	
	public void sumarCantidad() { // setter
		Cantidad++;
	}
	
	public double getTotal() {
		return Total;
	}
	
	public void calcularTotal() { // setter
		double precioUnitario = this.getValor();
//		System.out.println(this.getValor());
		Total =  precioUnitario * Cantidad;
	}
	
}
