package Aula04;

public class Aluno0102 
{
private String nome;
private float nota01;
private float nota02;
private float mediaPonderada;


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getNota01() {
	return nota01;
}
public void setNota01(float nota01) {
	this.nota01 = nota01;
}
public float getNota02() {
	return nota02;
}
public void setNota02(float nota02) {
	this.nota02 = nota02;
}
public float getMediaPonderada() {
	return mediaPonderada;
}
public void setMediaPonderada(float mediaPonderada) {
	this.mediaPonderada = mediaPonderada;
}


public float calculaMediaPonderada() 
{
	this.mediaPonderada = ((this.getNota01()*2) + (this.getNota02()*3))/5;
	return mediaPonderada;
}

@Override
public String toString() 
{	
		return super.toString();
}

public void imprimeDados()
{
System.out.println("Nome do aluno " + this.nome);
System.out.println("Nota 01 " + this.nota01);
System.out.println("Nota 02 " + this.nota02);
System.out.println("Media Ponderada " + this.mediaPonderada);
System.out.println("");
}

public boolean comparaNotas(float mediaAluno01, float nomediaAluno02)
{
	if (mediaAluno01==nomediaAluno02) 
	{
		return true;
	}
	return false;
}
}

