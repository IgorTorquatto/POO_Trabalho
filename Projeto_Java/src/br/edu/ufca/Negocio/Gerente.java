package br.edu.ufca.Negocio;

public class Gerente {
	String nome;
	Banda banda;
	double dinheiro;
	
	public Gerente(String nome, Banda banda,double dinheiro) {
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

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	//Métodos:
	public void comprarArtista() {
		
	}
	
	public void realizarShow() {
		
	}
	
	
}
