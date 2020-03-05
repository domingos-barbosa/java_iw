package Aula06Abstract;

public class Homem extends PessoaIMC
{
	@Override
	public void resultadoIMC(double peso, double altura) 
	{
		double resultadoIMC = calculaIMC(peso, altura);
		
		if (resultadoIMC > 43)
		{
			System.out.println("Obsidade mórbida");
		} else if (resultadoIMC >= 30 & resultadoIMC <= 39.9)
		{
			System.out.println("Obsidade moderada");
		} else if (resultadoIMC >= 25 & resultadoIMC <= 29.9)
	{
		System.out.println("Obsidade leve");
	} else if (resultadoIMC >= 20 & resultadoIMC <= 24.9)
	{
		System.out.println("Normal");
	} else if (resultadoIMC < 20)
	{
		System.out.println("Abaixo do normal");
	}
	}
	
}
