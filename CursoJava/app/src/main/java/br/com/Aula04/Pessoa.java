package Aula04;

public class Pessoa
{
	private String nome;
	private int idade;
	private String dataNascimento;
	private long cpf;
	private Endereco endereco;
	

	
	public Pessoa() 
	{
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento=dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
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
	public String getDataDenascimento() {
		return dataNascimento;
	}
	public void setDataDenascimento(String dataDenascimento) {
		this.dataNascimento = dataDenascimento;
	
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco nome) {
		this.endereco = endereco;
	
	}
	
	public void imprimeDados() 
	{
		System.out.println("Nome " + this.getNome());
	}
	
	//public toString() {
		//System.out.println("nome" + nome + "Endereco" + enderecoPessoa);
	//}
}
