package operadores;

public class Atribuição {
public static void main(String[] args) {
	int a = 3;
	int b = a;
	int c = a + b;
	
	c += b; //c = c + b  
	c -= b; //c = c - b
	c *= b; //c = c * b
	c /= b; //c = c / b
	c %= b; //c = c % b Resultado 0 (Par) ou 1 (Ímpar)
	
}
}
