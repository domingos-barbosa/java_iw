package br.com.iw;

import java.util.*;
import br.com.iw.TrianguloQ20;
import br.com.iw.RetanguloQ20;

public class MainQ20 {

  public static void main(String[] args) {

    //triângulo
    int l=0;
    Scanner sc = new Scanner (System.in);
   
    TrianguloQ20 tri1 = new TrianguloQ20();
    
    System.out.println ("entre com o lado do triângulo 1");
    l=sc.nextInt();
    tri1.setTriLado1(l);

    System.out.println ("entre com o lado do triângulo 2");
    l=sc.nextInt();
    tri1.setTriLado2(l);
    
   System.out.println ("entre com o lado triângulo 3");
   l=sc.nextInt();
    tri1.setTriLado3(l);
   
    System.out.println("O perímetro do triângulo é " + tri1.perimTri());
    
    System.out.println("");
    tri1.eEquilatero();

  sc.close();
  
  
  // retângulo
  System.out.println("");
  System.out.println("     -----      ");
  System.out.println("");
  
  
    l=0;
    Scanner sc1 = new Scanner (System.in);
   
    RetanguloQ20 ret1 = new RetanguloQ20();
    
    
    System.out.println ("entre com o lado do retângulo 1");
    l=sc1.nextInt();
    ret1.setRetLado1(l);

    System.out.println ("entre com o lado do retângulo 2");
    l=sc1.nextInt();
    ret1.setRetLado2(l);
    
    System.out.println ("A área do retângulo é: " + ret1.areaRet());
    
    System.out.println("");
    ret1.eQuadrado();

  sc1.close();
  }


}
