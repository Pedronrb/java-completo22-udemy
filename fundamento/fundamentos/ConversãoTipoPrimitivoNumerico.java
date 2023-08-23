package fundamentos;

public class ConversãoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //Conversao implícita
		System.out.println(a);
		
		float f = (float) 1.1234567897456; // Conversao explicita (Cast), truncou pq passou do tamanho limite
		System.out.println(f);
		
		int c = 340;
		byte d = (byte)c; // Conversao explicita (Cast)
		System.out.println(d);
		
		double g = 1.999999;
		int h = (int) g; // Conversao explicita (Cast)
		System.out.println(h);
		
		
		
	}
}
