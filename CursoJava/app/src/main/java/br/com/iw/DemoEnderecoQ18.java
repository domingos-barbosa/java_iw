package br.com.iw;

import java.util.*;

 // Compiler version JDK 11.0.2

public class DemoEnderecoQ18
 {
   public static void main(String args[])      
   { 
   
    Scanner sc=new Scanner (System.in);
   
    EnderecoQ18 end1=new EnderecoQ18() ;
    
    System.out.println ("entre com o logradouro");
    end1.logradouro = sc.nextLine();
    
    
    System.out.println ("entre com o número ");
    end1.numero = sc.nextInt();
    
    sc.nextLine();//limpeza buffer
    
    System.out.println ("entre com o complemento ");
    end1.complemento = sc.nextLine();


System.out.println(end1);

sc.close();
               
 }
} 