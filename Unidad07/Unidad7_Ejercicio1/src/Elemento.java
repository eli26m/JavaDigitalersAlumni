
public class Elemento {

	private String TipoElemento;
	private float Ancho;
	private float Alto;
	private float Peso;
	private float Valor;
	
	

	public Elemento(String tipoElemento, float ancho, float alto, float peso, float valor) {
		TipoElemento = tipoElemento;
		Ancho = ancho;
		Alto = alto;
		Peso = peso;
		Valor = valor;
	}

	public String getTipoElemento() {
		return TipoElemento;
	}

	public void setTipoElemento(String tipoElemento) {
		TipoElemento = tipoElemento;
	}

	public float getAncho() {
		return Ancho;
	}

	public void setAncho(float ancho) {
		Ancho = ancho;
	}

	public float getAlto() {
		return Alto;
	}

	public void setAlto(float alto) {
		Alto = alto;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}
	
	public void devolverDatos() {
		System.out.println("Se ingreso un elemento del tipo '" + TipoElemento + "'. Su ancho es de " + Ancho + " cm, su alto es de " + Alto + " cm, y su peso es de " + Peso + " gr. Su valor es de $" + Valor + ".");
	}
	
}
