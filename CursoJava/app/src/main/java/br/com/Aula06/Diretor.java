package Aula06;

public class Diretor extends Gerente
{
private boolean cartaoCorporativo;
private int qtdGerentes;




public Diretor(int matricula, double salario, String departamento, int senha, int qtdFuncionarios,
		boolean cartaoCorporativo, int qtdGerentes) 
{
	super(matricula, salario, departamento, senha, qtdFuncionarios);
	this.cartaoCorporativo = cartaoCorporativo;
	this.qtdGerentes = qtdGerentes;
}


public boolean isCartaoCorporativo() {
	return cartaoCorporativo;
}

public void setCartaoCorporativo(boolean cartaoCorporativo) {
	this.cartaoCorporativo = cartaoCorporativo;
}

public int getQtdGerentes() {
	return qtdGerentes;
}

public void setQtdGerentes(int qtdGerentes) {
	this.qtdGerentes = qtdGerentes;
}

public double calculaBonus()
{
	return getSalario()*1.5;
}

}
