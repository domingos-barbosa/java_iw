package Aula03;

public class Aluno 
{
	String nome;
	float media;
	
	public Aluno() 
	{
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}

	//if / else
	public void verificaMedia()
	{
		if (this.media >= 7.0) {
			
			//this diz respeito a instancia
			System.out.println("Aluno " + this.getNome() + " aprovado" );
		} else {
			System.out.println("Aluno " + this.getNome() + " reprovado");
		}
	}
	
	//ternário
	public void verificaMedia2()
	{
			String teste = (this.media >= 7.0) ? "aprovado" : "reprovado"; 
				System.out.println("Aluno " + this.getNome() + " " + teste );
		}
	
	//switch case
		int mediaCase=8;
		public void verificaMedia3()
		{
				switch (mediaCase) {
				case 7:
				case 8:
				case 9:
				case 10:
				{
					System.out.println("Aluno " + this.getNome() + " aprovado");
					break;
				
				}
				//System.out.println("Aluno " + this.getNome() + " reprovado");
		}
	}
}
