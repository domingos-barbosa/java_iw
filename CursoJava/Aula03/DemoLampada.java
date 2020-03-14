package Aula03;

public class DemoLampada {

	public static void main(String[] args) {
		
		//não precisa instanciar
		Lampada.qtdLampadas=+1;
		
		//construtor default
		Lampada l1 = new Lampada();
		l1.qtdLampadas+=1;
		System.out.println("Lampada 1 = " + l1.getWatts());
		
		//construtor 01 argumento
		Lampada l2 = new Lampada(20);
		l2.qtdLampadas+=1;
		System.out.println("Lampada 2 = " + l2.getWatts());
		
		System.out.println("quant de Lampadas = " + Lampada.qtdLampadas);

	}

}
