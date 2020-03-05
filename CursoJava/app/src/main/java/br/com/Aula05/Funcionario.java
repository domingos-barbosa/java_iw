package Aula05;

public class Funcionario extends Pessoa
{
	public void imprimeDados() 
	{
		System.out.println("Nome " + this.getNome() + "Idade " + this.getIdade());
	}
}
