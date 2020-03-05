package Aula05;


	public class DemoAgregacao {
	
		public static void main(String[] args) 
		{
			Pessoa p1 = new Pessoa();
			p1.setNome("Magno");
			p1.setIdade(25);
			p1.setCpf(12345678910L);
			
			Endereco end1 = new Endereco();
			end1.setLogradouro("rua f");
			end1.setNumero(123);
	
			p1.setEnderecoPessoa(end1);
			
		}
	
	}
