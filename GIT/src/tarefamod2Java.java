import java.util.Scanner;


public class tarefamod2Java {

	public static void main(String[] args) {
		
		
		System.out.println("------------Menu de Op��es------------");
		
	int opcao = 0;
	do {
		
		System.out.println("1 - Op��o 1 ");
		System.out.println("2 - Op��o 2 ");
		System.out.println("3 - Op��o Sair ");
		
				
		System.out.println("Selecione a op��o desejada:  ");
		
			switch (opcao) {
			
			case 1:
				System.out.println("Op��o 1 selecionada");
				break;   
				
			case 2: 
				System.out.println("Op��o 2 selecionada");
				break;
			
			}
				 
		Scanner scanner = new Scanner(System.in);
		
		opcao = scanner.nextInt();
		
			
		
		
	}while (opcao !=3);
	
	System.out.println("Fim de processo! ");
		     }
		   
	 
}


