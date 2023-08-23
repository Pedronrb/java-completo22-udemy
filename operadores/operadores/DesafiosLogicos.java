package operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean t1 = false;
		boolean t2 = false;
		
		boolean buytv50 = t1 && t2; 
		boolean buytv32 = t1 ^ t2; 
		boolean comprouSorvete = t1 || t2; 
		
		System.out.println("Comprou tv 50\"? " + buytv50);
		System.out.println("Comprou tv 32\"? " + buytv32);
		System.out.println("Comprou tv 32\"Sorvete? " + comprouSorvete);
		
		//Operador unario
		System.out.println("Mais saudável? " + !comprouSorvete);
		
	}
}

