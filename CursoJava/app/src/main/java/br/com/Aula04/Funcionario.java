package Aula04;

public class Funcionario extends Pessoa
{
	private int matricula;
	private double salario;
	private String departamento;
	
	
	
	public Funcionario(int matricula, double salario, String departamento) 
	{
		super();
		this.matricula = matricula;
		this.salario = salario;
		this.departamento = departamento;
	}


	public int getMatricula() {
		return matricula;
	}
	public void setMatric(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double calculaBonus()
	{
		return salario*1.2;
	}
}
