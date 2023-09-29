package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobreNome;
	
	public Pessoa(String nome,String sobreNome, int idade) {
		setIdade(idade);
		setSobreNome(sobreNome);
		setNome(nome);
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	
	//Getters
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	//Setters
	public void setIdade(int novaIdade) {
		if(novaIdade > 0 && novaIdade <= 110) {
			this.idade = novaIdade;
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeCompleto() {
		return "Meu nome completo e: " + getNome() + " " +getSobreNome();
	}
	
	public String toString() {
		return "Ola meu nome e " + getNome() + " e tenho " + getIdade();
	}
}
