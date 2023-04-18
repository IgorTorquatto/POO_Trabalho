package br.edu.ufca.dados;

public class Mago extends PersonagemAbstrato {
	//Só ataca de longe, +dano +-vida
	public Mago(String nome,int vida,int nivel,int ataque,double gold) {
		super(nome,vida,nivel,ataque,gold);
	}
}
