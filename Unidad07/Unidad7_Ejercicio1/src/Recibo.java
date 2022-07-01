
public class Recibo {

	private Elemento ElementoIngresado;
	private int Cantidad;
	private float Total;
	
	public Recibo() {
		Cantidad = 0;
	}
	
	public Elemento getElementoIngresado() {
		return ElementoIngresado;
	}
	public void setElementoIngresado(Elemento elementoIngresado) {
		ElementoIngresado = elementoIngresado;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void sumarCantidad() {
		Cantidad++;
	}
	public float getTotal() {
		return Total;
	}
	public void setTotal(float total) {
		Total = total;
	}
	
	public void mostrarCantidad() {
		System.out.println(Cantidad);
	}
}
