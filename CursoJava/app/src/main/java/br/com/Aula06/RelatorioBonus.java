package Aula06;

public class RelatorioBonus {
	
private double totalDeBonusPago;


public double getTotalDeBonusPago() {
	return totalDeBonusPago;
}

public void setTotalDeBonusPago(double totalDeBonusPago) {
	this.totalDeBonusPago = totalDeBonusPago;
}

//passagem de valor por referencia
//gerente � um tipo de funcionario
//diretor � um tipo de funcionario 
//presidente � um tipo de funcionario

public void calculaTotalDeBonusFuncionario(Funcionario funcionario) 
{
	this.totalDeBonusPago += funcionario.calculaBonus();
}

}
