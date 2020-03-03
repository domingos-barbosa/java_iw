package Aula06;

public class DemoAluno0102 {

	public static void main(String[] args) {
		Aluno0102 al1 = new Aluno0102();
		Aluno0102 al2 = new Aluno0102();
		
		al1.setNome("Joao");
		al1.setNota01(10);
		al1.setNota02(9);
		al1.calculaMediaPonderada();
		al1.imprimeDados();
		
		al2.setNome("Maria");
		al2.setNota01(10);
		al2.setNota02(9);
		al2.calculaMediaPonderada();
		al2.imprimeDados();
		
		if(al1.comparaNotas(al1.getMediaPonderada(), al2.getMediaPonderada()))
		{
			System.out.println("As medias são iguais");
		}
		else 
		{
			System.out.println("As médias são diferentes");
		}

	}
}
