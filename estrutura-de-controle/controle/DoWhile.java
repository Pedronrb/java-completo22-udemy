package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
	 
		Scanner entrada = new Scanner(System.in);
		
		String texto = "Por favor";
		
		do {
			System.out.println("Precisa dizer a palavra magica...\n");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
	}
	
}
