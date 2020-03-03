package Aula02;

import java.util.Scanner;

public class DemoEndereco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Endereco end1 = new Endereco();
		System.out.println("Digite o logradouro");
		end1.setLogradouro(sc.nextLine());
		System.out.println("Digite o numero");
		end1.setNumero(sc.nextInt());
		
		sc.nextLine();//limpa o buffer
		//obs: apenas quando um número anteceder a leitura de uma String
		
		System.out.println("Digite o complemento");
		end1.setComplemento(sc.nextLine());
		System.out.println("Digite o CEP");
		end1.setCEP(sc.nextLine());
		System.out.println("Digite a cidade");
		end1.setCidade(sc.nextLine());
		System.out.println("Digite a UF");
		end1.setUF(sc.nextLine());
		
		System.out.println("logradouro = " + end1.getLogradouro());
		System.out.println("numero = " + end1.getNumero());
		System.out.println("cidade = " + end1.getCidade());
		System.out.println("CEP = " + end1.getCEP());
		System.out.println("CEP = " + end1.getCEP());
		System.out.println("CEP = " + end1.getCEP());
		System.out.println("CEP = " + end1.getCEP());
		
		sc.close();
	}

}
