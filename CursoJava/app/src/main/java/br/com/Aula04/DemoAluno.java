package Aula04;

public class DemoAluno {

	public static void main(String[] args) {

		Aluno al1 = new Aluno();
		al1.setNome("João");
		al1.setMedia(8.0f);
		al1.verificaMedia();
		al1.verificaMedia2();
		al1.verificaMedia3();
		
		Aluno al2 = new Aluno();
		al2.setNome("Paulo");
		al2.setMedia(6.99f);
		al2.verificaMedia();
		al1.verificaMedia2();
		al1.verificaMedia3();
		
	}

}
