
public class Calle {
	
	private int numero;
	private Atleta atleta;
	private double tiempo;
	
	public Calle(int numero) {
		super();
		this.numero = numero;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public int getNumero() {
		return numero;
	}
	public String toString() {
		return "Calle [numero=" + numero + ", atleta=" + atleta + ", tiempo=" + tiempo + "]";
	}
	
	
	
	

}
