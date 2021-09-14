import java.util.Scanner;


public class tarefamod2Java {

	public static void main(String[] args) {
		
		
		System.out.println("------------Menu de Opções------------");
		
	int opcao = 0;
	do {
		
		System.out.println("1 - Opção 1 ");
		System.out.println("2 - Opção 2 ");
		System.out.println("3 - Opção Sair ");
		
				
		System.out.println("Selecione a opção desejada:  ");
		
			switch (opcao) {
			
			case 1:
				System.out.println("Opção 1 selecionada");
				break;   
				
			case 2: 
				System.out.println("Opção 2 selecionada");
				break;
			
			}
				 
		Scanner scanner = new Scanner(System.in);
		
		opcao = scanner.nextInt();
		
			
		
		
	}while (opcao !=3);
	
	System.out.println("Fim de processo! ");
		     }
		   
	 
}


