package br.edu.ufca.dados;

public abstract class PersonagemAbstrato {
	private String nome;
	private int vida;
	private int nivel;
	private int ataque;
	private double gold;
	
	public PersonagemAbstrato(String nome,int vida,int nivel,int ataque,double gold) {
		this.gold = 0.0;
		this.nome = nome;
		this.vida = vida;
		this.nivel = nivel;
		this.ataque = ataque;
		
	}
}
