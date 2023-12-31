package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros 
		byte anosDeEmpresa = 23;
		short numeroDevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // True
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de voo
		System.err.println(numeroDevoos / 2);
	}
}
