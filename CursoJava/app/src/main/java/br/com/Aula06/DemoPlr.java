package Aula06;

public class DemoPlr {

	public static void main(String[] args) 
	{
	
		String nome = "Jose Maria";
		int idade= 25;
		String dataNascimento="12/01/2017";
		long cpf = 12345678910L;
		Endereco endereco = new Endereco();
		double salario = 1000;
		String deparatamento ="TI";
		int senha = 123456;
		int qtdFncionarios=50;
		boolean cartaoCorporativo=true;
		int qtdGerentes=5;
		String pais = "BR";
		int qtdDiretores=2;
		
		Funcionario func = new Funcionario(matricula, 
				salario, departamento);
		Gerente ger = new Gerente(matricula, salario, 
				departamento, senha, qtdFuncionarios);
		Diretor dir = new Diretor(matricula, salario, 
				departamento, senha, qtdFuncionarios,
				cartaoCorporativo, qtdGerentes);
		Presidente pres = new Presidente(matricula, salario, 
				departamento, senha, qtdFuncionarios,
				cartaoCorporativo, qtdGerentes, pais, 
				qtdDiretores);
		
		RelatorioBonus rb = new RelatorioBonus();
		rb.calculaTotalDeBonusFuncionario(func);
		rb.calculaTotalDeBonusFuncionario(ger);
		rb.calculaTotalDeBonusFuncionario(dir);
		rb.calculaTotalDeBonusFuncionario(pres);
		
	}

}
