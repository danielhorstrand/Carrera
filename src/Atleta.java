
public class Atleta {
	
	private String nombre;
	private long nacimiento;
	
	
	public Atleta(String nombre, long nacimiento) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public long getNacimiento() {
		return nacimiento;
	}
	public String toString() {
		return "Atleta [nombre=" + nombre + ", nacimiento=" + nacimiento + "]";
	}
	
	
	
	

}
