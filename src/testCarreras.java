import java.util.Arrays;

public class testCarreras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double []tiempos = {9.89,9.81,9.93,9.91,10.04,9.96,9.94,10.06};
		String []atletas = {"Usain Bolt","Justin Gatlin","Andre de Grasse","Yohan Blake","Akani Simbine","Ben Youssef","Jimmy Vicaut","Trayvon Bromell"};
		Arrays.sort(tiempos);
		
		
		Atleta atleta1 = new Atleta(atletas[0], 1980);
		Atleta atleta2 = new Atleta(atletas[1], 1989);
		Atleta atleta3 = new Atleta(atletas[2], 1990);
		Atleta atleta4 = new Atleta(atletas[3], 1987);
		Atleta atleta5 = new Atleta(atletas[4], 1985);
		Atleta atleta6 = new Atleta(atletas[5], 1991);
		Atleta atleta7 = new Atleta(atletas[6], 1984);
		Atleta atleta8 = new Atleta(atletas[7], 1989);
		
		

	}

}
