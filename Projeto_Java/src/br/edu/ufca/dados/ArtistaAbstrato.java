package br.edu.ufca.dados;

public abstract class ArtistaAbstrato {
	private String nome;
	private int exp;
	private int preco;
	
	
	public ArtistaAbstrato(String nome,int exp,int preco) {
		this.preco = preco;
		this.exp = exp;
		this.nome = nome;
	
	}
	
	//Getters and Setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	//Métodos:
	
	
}
