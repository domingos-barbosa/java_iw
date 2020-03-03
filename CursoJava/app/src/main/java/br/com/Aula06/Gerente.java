package Aula06;

public class Gerente extends Funcionario
{
private int senha;
private int qtdFuncionarios;



public Gerente(int matricula, double salario, String departamento, int senha, int qtdFuncionarios) 
{
	super(matricula, salario, departamento);
	this.senha = senha;
	this.qtdFuncionarios = qtdFuncionarios;
}


public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public int getQtdFuncionarios() {
	return qtdFuncionarios;
}

public void setQtdFuncionarios(int qtdFuncionarios) {
	this.qtdFuncionarios = qtdFuncionarios;
}

public double calculaBonus()
{
	return getSalario()*1.3;
}

}
