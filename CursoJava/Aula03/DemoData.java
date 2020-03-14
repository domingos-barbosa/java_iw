package Aula03;

public class DemoData {

	public static void main(String[] args) {
		
		//Data d = new Data();
		//d.setDia(04);
		//d.setMes(02);
		//d.setAno(2020);
		
		Data d1 = new Data(04,02,2020);
		Data d2 = new Data(04,02,2020,10,25,36);
		
		System.out.println("Data atual: " + d1.getDia() 
		+ "/" 
		+ d1.getMes() 
		+ "/" 
		+ d1.getAno());
		
		System.out.println();
		System.out.println("Data atual: " + d1.getDia() 
		+ "/" 
		+ d1.getMes() 
		+ "/" 
		+ d1.getAno()
		+ " " 
		+ d2.getHora()
		+ ":" 
		+ d2.getMinuto()
		+ ":" 
		+ d2.getSegundo());
	}

}
