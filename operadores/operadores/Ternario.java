package operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoFinal = media > 7.0? "Aprovado": "Recuperacao: ";
		
		System.out.println("O aluno esta " + resultadoFinal);
	}
}
