package br.edu.ufca.Negocio;

public abstract class MusicoAbstrato implements IMusico {
	private String nome;
	private double exp;
	private int preco;
	
	
	public MusicoAbstrato(String nome,double exp,int preco) {
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

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
