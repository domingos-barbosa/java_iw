package br.com.iw;

public class RetanguloQ20 {

private  int retLado1;
private  int retLado2;


public void setRetLado1(int retLado1) 
   {
     this.retLado1=retLado1;
   }
public int getRetLado1()
   {
     return retLado1;   
   }
   
public void setRetLado2(int retLado2) 
   {
     this.retLado2=retLado2;
   }
public int getRetLado2()
   {
     return retLado2;   
   }
   
 
 public float areaRet(){
  
  float area;
  
  area=this.retLado1 * this.retLado2;
  return area;
 } 
 
 
 public void eQuadrado(){

if (this.retLado1==this.retLado2) {
  System.out.println ("O retângulo é também um quadrado");
  } 
  else {
   System.out.println ("O retângulo não é também um quadrado");
  }
  return;
 } 
}
