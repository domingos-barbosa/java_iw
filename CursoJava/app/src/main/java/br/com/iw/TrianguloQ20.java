package br.com.iw;

public class TrianguloQ20 {

private int triLado1;
private int triLado2;
private int triLado3;



public void setTriLado1(int triLado1) 
   {
     this.triLado1=triLado1;
   }
public int getTriLado1()
   {
     return triLado1;   
   }


public void setTriLado2(int triLado2) 
   {
     this.triLado2=triLado2;
   }
public int getTriLado2()
   {
     return triLado2;   
   }
   
   public void setTriLado3(int triLado3) 
   {
     this.triLado3=triLado3;
   }
public int getTriLado3()
   {
     return triLado3;   
   }
   
public void eEquilatero(){

  if (this.triLado1==this.triLado2 && this.triLado2==this.triLado3) {
  System.out.println ("O triângulo é equilátero");
 } 
  else {
   System.out.println ("O triângulo não é equilátero");
  }
  return;
 } 
 
 
 public int perimTri(){
  
  int perimTri;
  
  perimTri=this.triLado1 + this.triLado2 + this.triLado3;
   
  return perimTri;
 } 
}
