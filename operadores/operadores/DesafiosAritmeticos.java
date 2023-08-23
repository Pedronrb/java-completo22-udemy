package operadores;

import java.util.Scanner;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = (int) Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c + "\n");
		
		System.out.println("Digite numerador 1: ");
		double numerado1 = entrada.nextDouble();
		
		System.out.println("Digite denominador 1: ");
		double denominador1 = entrada.nextDouble();
		
		System.out.println("Potencia da 1 fracao: ");
		double potencia1 = entrada.nextDouble();
				
		System.out.println("Digite numerador 2: ");
		double numerado2 = entrada.nextDouble();	
		
		System.out.println("Digite denominador 2: ");
		double denominador2 = entrada.nextDouble();
		
		System.out.println("Potencia da 2 fracao: ");
		double potencia2 = entrada.nextDouble();
		
		double primeiraFrac = 
				(Math.pow(numerado1, potencia1) / denominador1);	
		double segundaFrac = 
				(Math.pow(numerado2, potencia2) / denominador2);
	
		System.out.println("Digite denominador da fracao geral: ");
		double denominadorGeral = entrada.nextDouble();
		System.out.println("Digite potencia do denominador da fracao geral: ");
		double potenciaGeralDenominador = entrada.nextDouble();
		double denominadorGeralFinal = Math.pow(denominadorGeral, potenciaGeralDenominador);
		
		System.out.println("Potencia da fracao geral: ");
		double potenciaGeralNumerador = entrada.nextDouble();
		double numeradorEqua = Math.pow(primeiraFrac - segundaFrac, potenciaGeralNumerador);
		
		System.out.println("Resultado da equacao:" + numeradorEqua / denominadorGeralFinal);
		
	}
}
