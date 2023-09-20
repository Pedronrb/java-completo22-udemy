package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int VELOCIDADE_MAXIMA){
		super(VELOCIDADE_MAXIMA);
		delta = 15;
	}
	
	/*
		@Override
	 * 	public void acelerar() {
			// TODO Auto-generated method stub
			velocidadeAtual += 15;
		}
	 */
	
	public String toString() {
		return "";
	}
}
