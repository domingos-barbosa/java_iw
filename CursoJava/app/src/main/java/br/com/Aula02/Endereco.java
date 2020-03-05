package Aula02;

public class Endereco 
{
private String logradouro;
private String complemento;
private String CEP;
private String bairro;
private String cidade;
private String UF;
private int numero;

public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getCEP() {
	return CEP;
}
public void setCEP(String cEP) {
	CEP = cEP;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getUF() {
	return UF;
}
public void setUF(String uF) {
	UF = uF;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}


}
