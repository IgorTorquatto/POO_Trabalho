package br.edu.ufca.dados;

public abstract class ArtistaAbstrato {
	private String nome;
	private int exp;
	private double gold;
	
	public ArtistaAbstrato(String nome,int exp,double gold) {
		this.gold = 0.0;
		this.exp = exp;
		this.nome = nome;
	
	}

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

	public double getGold() {
		return gold;
	}

	public void setGold(double gold) {
		this.gold = gold;
	}
	
	
}
