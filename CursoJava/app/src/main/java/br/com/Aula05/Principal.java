package Aula05;

public class Principal {
	public static void main(String[] args) {

		//Exemplo for
		
		for (int i = 0; i < 1; i++)
		{
			for (int j = 0; j < 101; j++) 
			{
				if (j%2==0) 
				{
					System.out.println("o n�mero " + j + " � par");
				} else 
				{
					System.out.println("o n�mero " + j + " � impar");
				}
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		//Exemplo while
		
		int i=0,j=0;
		while (i<2)
		{
			while (j < 100) 
			{
				if (j%2==0) 
				{
					System.out.println("o n�mero " + j + " � par");
				} else 
				{
					System.out.println("o n�mero " + j + " � impar");
				}
			j++;
			}
		i++;
		}
		
		System.out.println("");
		System.out.println("");
		
		//Exemplo do while
		
				i=0;
				j=0;
				do
				{
					do
					{
						if (j%2==0) 
						{
							System.out.println("o n�mero " + j + " � par");
						} else 
						{
							System.out.println("o n�mero " + j + " � impar");
						}
					j++;	
					} while (j < 100);
				i++;	
				}	while (i<2);
				
			System.out.println("");
			System.out.println("");
				
			
			//Exemplo do while	
			//m�ltiplo de 3 de 0 .. 100
			
			i=0;
			while (i < 101)
			{
				if (i%3==0) 
				{
					System.out.println("o n�mero " + i + " � m�ltiplo de 3");
				} 
			i++;	
			} 
	}

}
