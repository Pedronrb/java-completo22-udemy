package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a media: ");
		double nota = entrada.nextDouble();
		
		if (nota >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("parabens");
		}
		
		entrada.close();
	}
}