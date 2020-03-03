package Aula05;

public class DemoHeranca {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("João");
		func.setIdade(30);
		func.setCpf(12345678910L);
		
		Endereco end1 = new Endereco();
		end1.setLogradouro("rua f");
		end1.setNumero(123);

		func.setEnderecoPessoa(end1);
		
		// sobrescrita
		func.imprimeDados();

	}

}
