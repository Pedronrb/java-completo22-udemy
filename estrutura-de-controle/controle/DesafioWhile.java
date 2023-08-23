package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qntdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0) {
				total += nota;
				qntdNotas ++;
			}
			else if(nota != -1) {
				System.out.println("Nota invalida");
			}
		}
		
		double media = total / qntdNotas;
		System.out.println("Media = " + media);
		entrada.close();
	}
}
