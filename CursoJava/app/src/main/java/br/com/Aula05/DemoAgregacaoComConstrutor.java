package Aula05;

public class DemoAgregacaoComConstrutor {


		public static void main(String[] args) 
		{
			Endereco end1 = new Endereco();
			end1.setLogradouro("rua f");
			end1.setNumero(123);
			
			Pessoa p1 = new Pessoa();
			p1.setNome("Magno");
			p1.setIdade(25);
			p1.setCpf(12345678910L);
			p1.setEnderecoPessoa(end1);
			p1.setEnderecoPessoa(end1);
			
			Pessoa p2 = new Pessoa("Claudia", 18, 8866554455L);
			p2.setEnderecoPessoa(end1);
			
			
			Pessoa p3 = new Pessoa("jorge", 20, 608666221L, end1);
			

			
	
			
			
		}
	
	}
