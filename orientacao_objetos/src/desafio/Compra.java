package desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	
	void adicionarItem(Produto p, int qntde) {
		this.itens.add(new Item(p, qntde));
	}
	
	void adicionarItem(String nome, double preco, int qntde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qntde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: this.itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
	
}
