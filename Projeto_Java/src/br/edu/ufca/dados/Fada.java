package br.edu.ufca.dados;

public class Fada extends PersonagemAbstrato{
	//Dá pouco dano mas pode se curar -vida -dano +cura
	public Fada(String nome,int vida,int nivel,int ataque,double gold) {
		super(nome,vida,nivel,ataque,gold);
	}
}
