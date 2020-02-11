package br.com.iw;

import br.com.iw.GrausQ21;
import java.util.Scanner;


public class MainQ21 {

  public static void main(String[] args) {

//Cessius para Fahrenheit
float c = 0.0f;
GrausQ21 g = new GrausQ21();
Scanner sc = new Scanner (System.in);

System.out.println ("Entre com o grau em Cessius ");
c=sc.nextFloat();

System.out.println("A temperatura em Fahrenheit é " + g.converteCparaF(c));

sc.close();


// Fahrenheit para Cessius
float f = 0.0f;
GrausQ21 g1 = new GrausQ21();
Scanner sc1 = new Scanner (System.in);

  System.out.println("");
  System.out.println("     -----      ");
  System.out.println("");

System.out.println ("Entre com o grau em Fahrenheit ");
f=sc1.nextFloat();

System.out.println("A temperatura em Cessius é " + g1.converteFparaC(f));

sc1.close();
  }

}
