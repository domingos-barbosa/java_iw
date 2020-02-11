package br.com.iw;

public class GrausQ21 {

private float gCessius;
private float gFahrenheit;

public void setGcessius (float gCessius) 
   {
    this.gCessius = gCessius;
   }
public float getGcessius()
   {
     return gCessius;   
   }
   
   
public void setGfahrenheit ( float gFahrenheit) 
   {
    this.gFahrenheit = gFahrenheit;
   }
public float getGfahrenheit()
   {
     return gFahrenheit;   
   }
   
   public float converteCparaF(float cessius){
     
     float f = 0.0f;
     f = (cessius * 9/5) + 32;
     return f;
   }
   
   
   public float converteFparaC(float fahrenheit){
     
     float c = 0.0f;
     c = (fahrenheit - 32) * 9/5;
     return c;
   }
}
