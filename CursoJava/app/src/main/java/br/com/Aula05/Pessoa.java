package Aula05;

public class Pessoa
{
	private String nome;
	private int idade;
	private long cpf;
	private Endereco enderecoPessoa;
	

	
	public Pessoa() {
		super();
	}
	
	
	public Pessoa(String nome, int idade, long cpf, Endereco enderecoPessoa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.enderecoPessoa = enderecoPessoa;
	}
	

	public Pessoa(String nome, int idade, long cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.enderecoPessoa = enderecoPessoa;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEnderecoPessoa() {
		return enderecoPessoa;
	}
	public void setEnderecoPessoa(Endereco nome) {
		this.enderecoPessoa = enderecoPessoa;
	
	}
	
	public void imprimeDados() 
	{
		System.out.println("Nome " + this.getNome());
	}
	
	//public toString() {
		//System.out.println("nome" + nome + "Endereco" + enderecoPessoa);
	//}
}
