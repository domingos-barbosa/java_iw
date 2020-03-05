package Aula03;

public class Lampada 
{
	private int watts;
	public static int qtdLampadas=0;
	
	//default 60 watts
	public Lampada() 
	{
		this.watts=60;
	}
	
	//solicita 01 parâmetro
	public Lampada(int watts) 
	{
		this.watts=watts;
	}

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

}
