package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual;
	
	
	public void acelerar() {
		if(velocidadeAtual >= 0) {
			velocidadeAtual += 5;
		}
	}
	
	public String frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
		return "Esta parado";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Velocidade atual é " + velocidadeAtual + " Km/h";
	}
	
}
