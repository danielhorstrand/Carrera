import java.util.Arrays;

public class Carrera {
	
	private int distancia;
	private int ronda;
	private long fecha;
	private Calle []calles;
	
	public Carrera(int distancia, int ronda, long fecha) {
		super();
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
		this.calles = new Calle [8];
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	public long getFecha() {
		return fecha;
	}
	public void setFecha(long fecha) {
		this.fecha = fecha;
	}
	public void añadirCalle(Calle calle1){
		for (int i=0;i<calles.length;i++){
			if(calles[i]==(null)){
				calles[i]=calle1;
				break;
			}
		}
	}
	public String toString() {
		return "Carrera [distancia=" + distancia + ", ronda=" + ronda + ", fecha=" + fecha + ", calles="
				+ Arrays.toString(calles) + "]";
	}
	public String decirCalle(Calle calle){
		return calle.toString();
	}
}
