import java.util.ArrayList;
import java.util.List;

public class Recibo extends Elemento{

	private Elemento ElementoIngresado;
	private static int Cantidad;
	private static float Total;
	private static List<Elemento> Elementos = new ArrayList<Elemento>();
	
	public Recibo() {
		Cantidad = 0;
		Total = 0;
	}
	
	public Elemento getElementoIngresado() {
		return ElementoIngresado;
	}
	
	public void setElementoIngresado(Elemento elementoIngresado) {
		ElementoIngresado = elementoIngresado;
		this.sumarCantidad();
		this.calcularTotal();
		this.almacenarElementos();
	}
	public int getCantidad() {
		return Cantidad;
	}
	
	public float getTotal() {
		return Total;
	}
	
	public void sumarCantidad() {
		Cantidad++;
	}
	
	public void calcularTotal() {
		Total = Total + this.getElementoIngresado().getValor();
	}
	
	public void almacenarElementos() {
		Elementos.add(this.getElementoIngresado());
	}
	
	public void mostrarLista() {
		for (Elemento e : Elementos) {
			e.devolverDatos();
			System.out.println("\n****************************************");
		}
	}
	
}
