package br.com.iw;

import java.util.Scanner;

public class DemoEnderecoQ15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EnderecoQ15 end1 = new EnderecoQ15();
		
		System.out.println("Entre com o logradouro \r ");
		end1.logradouro=sc.nextLine();
		
		System.out.println("Entre com o numero \r ");
		end1.numero=sc.nextInt();
		
		System.out.println("Entre com o complemento \r ");
		end1.complemento=sc.nextLine();//para limpar o buffer após int
		end1.complemento=sc.nextLine();
		
		System.out.println("Entre com o CEP \r ");
		end1.CEP=sc.nextLine();
		
		System.out.println("Entre com o bairro \r ");
		end1.bairro=sc.nextLine();
		
		System.out.println("Entre com o cidade \r ");
		end1.cidade=sc.nextLine();
		
		System.out.println("Entre com o UF \r ");
		end1.UF=sc.nextLine();
		
		System.out.println("");
		System.out.println("logradouro = " + end1.logradouro);
		System.out.println("numero = " + end1.numero);
		System.out.println("complemento = " + end1.complemento);
		System.out.println("CEP = " + end1.CEP);
		System.out.println("bairro = " + end1.bairro);
		System.out.println("cidade = " + end1.cidade);
		System.out.println("UF = " + end1.UF);
		}

}
