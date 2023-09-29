package oo.encapsulamento;

public class PessoaTest {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro","Nascimento", 20);
		p1.setIdade(10);
		
		
		System.out.println(p1.getIdade());
		System.out.println(p1); //toString
		System.out.println(p1.getNomeCompleto()); //toString
		
	}
}
