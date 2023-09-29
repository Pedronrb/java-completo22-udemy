package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int VELOCIDADE_MAXIMA){
		super(VELOCIDADE_MAXIMA);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = false;

	}
	
	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false;
	}
	
	
	@Override
	public int getDelta() {
		// TODO Auto-generated method stub
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && !ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
		
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
