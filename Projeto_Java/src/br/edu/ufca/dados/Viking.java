package br.edu.ufca.dados;

public class Viking extends PersonagemAbstrato {
	//Só ataca corpo a corpo, ++dano +vida -sofre mais dano
	public Viking(String nome,int vida,int nivel,int ataque,double gold) {
		super(nome,vida,nivel,ataque,gold);
	}
}
