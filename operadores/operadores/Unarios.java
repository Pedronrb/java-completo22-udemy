package operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1; Imcrementar, forma Pos-fixada 
		a--; // a = a - 1; Decrementar, forma Pos-fixada
		
		++a; // a = a + 1; Imcrementar, forma Pre-fixada 
		--a; // a = a - 1; Imcrementar, forma Pre-fixada 
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini desafio...");
		
		System.out.println(a++ == b--); // Verdade por causa da ordem de precedência dos operadores
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	
	
	}
}
