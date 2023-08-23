package fundamentos;

public class TipoString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.length()); 
		System.out.println(s.endsWith("dia")); 
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Silva";
		var idade = 24;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome,
				idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome,
				idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		
	} 
}
