
public class Persona {

	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private int nroDocumento;
	private int edad;
	private boolean esMayor;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, String tipoDocumento, int nroDocumento, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.edad = edad;
		this.esMayor = this.esMayor();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public int getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esMayor() {
		esMayor = (edad >= 18) ? true : false;
		return esMayor;
	}
	
	public String mostrarDatos() {
		String mensaje = 	"Nombre: " + this.getNombre() + 
							"\nApellido: " + this.getApellido() +
							"\nTipo de documento: " + this.getTipoDocumento() +
							"\nNumero de documento: " + this.getNroDocumento() +
							"\nEdad: " +  this.getEdad() +
							"\nEs mayor de edad: " + (this.esMayor() ? "SI" : "NO");
		return mensaje;
	}
	
}
