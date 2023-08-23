package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	Produto(String nomeInicail, double precoInicial){
		nome = nomeInicail;
		preco = precoInicial;
	}
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
