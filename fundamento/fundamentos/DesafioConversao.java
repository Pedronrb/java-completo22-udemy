package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 valor: ");
		String valor1 = entrada.nextLine().replace(",", ".");

		System.out.println("2 valor: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("3 valor: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double somaValores = numero1 + numero2 + numero3;
		double mediaValores = somaValores / 3;
		System.out.printf("A soma dos valores "+ somaValores + " e a media " + mediaValores);
		
		entrada.close();
	}
}
