package br.com.iw;

import java.util.Scanner;

public class ClienteQ17 
{
	String nome;
	int idade;
	int telefone;
	EnderecoQ15 endereco;
	
	public void imprimeDados() 
{
		Scanner sc = new Scanner(System.in);
		
		ClienteQ16 cli1 = new ClienteQ16();
		
		System.out.println("Entre com o nome \r ");
		cli1.nome=sc.nextLine();
			
		System.out.println("Entre com o idade \r ");
		cli1.idade=sc.nextInt();
		
		System.out.println("Entre com o telefone \r ");
		cli1.telefone=sc.nextInt();
		
		EnderecoQ15 end1 = new EnderecoQ15();
		
		System.out.println("Entre com o logradouro \r ");
		end1.logradouro=sc.nextLine();//para limpar o buffer aos nextInt
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
		System.out.println("Dados do cliente");
		System.out.println("nome = " + cli1.nome);
		System.out.println("idade = " + cli1.idade);
		System.out.println("telefone = " + cli1.telefone);
		
		System.out.println("");
		System.out.println("Endereço do cliente");
		System.out.println("logradouro = " + end1.logradouro);
		System.out.println("numero = " + end1.numero);
		System.out.println("complemento = " + end1.complemento);
		System.out.println("CEP = " + end1.CEP);
		System.out.println("bairro = " + end1.bairro);
		System.out.println("cidade = " + end1.cidade);
		System.out.println("UF = " + end1.UF);
}
}
