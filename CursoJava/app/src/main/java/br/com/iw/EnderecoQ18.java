package br.com.iw;

public class EnderecoQ18
 {
   public String logradouro;
   public int numero;
   public String complemento;
   //public String CEP;
   //public String bairro;
   //public String cidade;
   //public String UF;
   
   public void setLogradouro(String logradouro) 
   {
     this.logradouro=logradouro;
   }
   public String getLogradouro()
   {
        return logradouro;
        
  }
  
  public void setNumero(int numero) 
   {
     this.numero=numero;
   }
   public int getNumero()
   {
        return numero;
        
  }
  
   @Override
    public String toString() {
        return "Logradouro: " + this.logradouro + ", Número: " + this.numero + ", Complemento: " + this.complemento; 
         
 }   
 }
