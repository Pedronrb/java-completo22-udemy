package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println("Valores da ferrari");
		
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.desligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());
		
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		
	}
}
