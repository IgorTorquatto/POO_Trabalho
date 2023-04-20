package br.edu.ufca.dados;

public class Gerente {
	String nome;
	Banda banda;
	int dinheiro;
	
	public Gerente(String nome, Banda banda,int dinheiro) {
		this.nome = nome;
		this.banda = banda;
		this.dinheiro = dinheiro;
	}
		
	//Getters and Setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	//Métodos:
	public void comprarArtista() {
		
	}
	
	public void realizarShow() {
		
	}
	
	
}
