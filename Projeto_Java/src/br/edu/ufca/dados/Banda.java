package br.edu.ufca.dados;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Banda {
	private String nome;
	private Baixista baixista;
	private Baterista baterista;
	private Guitarrista guitarrista;
	private Tecladista tecladista;
	private Vocalista vocalista;
	
	public Banda(Baixista baixista, Baterista baterista,
			Guitarrista guitarrista, Tecladista tecladista,
			Vocalista vocalista,String nome) {
		this.baixista = baixista;
		this.baterista = baterista;
		this.guitarrista = guitarrista;
		this.tecladista = tecladista;
		this.vocalista = vocalista;
		this.nome = nome;
	}
	
	//Getters and setters:

	public Baixista getBaixista() {
		return baixista;
	}

	public void setBaixista(Baixista baixista) {
		this.baixista = baixista;
	}

	public Baterista getBaterista() {
		return baterista;
	}

	public void setBaterista(Baterista baterista) {
		this.baterista = baterista;
	}

	public Guitarrista getGuitarrista() {
		return guitarrista;
	}

	public void setGuitarrista(Guitarrista guitarrista) {
		this.guitarrista = guitarrista;
	}

	public Tecladista getTecladista() {
		return tecladista;
	}

	public void setTecladista(Tecladista tecladista) {
		this.tecladista = tecladista;
	}

	public Vocalista getVocalista() {
		return vocalista;
	}

	public void setVocalista(Vocalista vocalista) {
		this.vocalista = vocalista;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Métodos:
	public void gerarBanda(ArrayList<String> nomes,String nome_banda) {
		Random random = new Random();
		
		//Para gerar na range certa (max-min)+min
		vocalista = new Vocalista(nomes.get(0),random.nextInt(69-60)+60,0);
		baixista = new Baixista(nomes.get(1),random.nextInt(69-60)+60,0);
		baterista = new Baterista(nomes.get(2),random.nextInt(69-60)+60,0);
		tecladista = new Tecladista(nomes.get(3),random.nextInt(69-60)+60,0);
		guitarrista = new Guitarrista(nomes.get(4),random.nextInt(69-60)+60,0);
		nome = nome_banda;
		
	}
	
	public double calcularExp() {
		double media = vocalista.getExp() + baixista.getExp() + baterista.getExp() + tecladista.getExp() + guitarrista.getExp();
		return (media/5);
	}
	
	public void atualizarExp(double exp, double expShow, MusicoAbstrato musico) {
		exp = musico.getExp();
		exp += expShow;
		Math.ceil(exp);
		musico.setExp(exp);
	}
	
	
	public void atualizarExp(double exp) {
		double aux = 0;
		atualizarExp(aux, exp, vocalista);
		atualizarExp(aux, exp, baixista);
		atualizarExp(aux, exp, baterista);
		atualizarExp(aux, exp, tecladista);
		atualizarExp(aux, exp, guitarrista);
	}
	
	public String[] imprimirBanda() {
	
		String[] integrantes = {
				"Vocalista: "+getVocalista().getNome()+" exp("+getVocalista().getExp()+")",
				"Baixista: "+getBaixista().getNome()+" exp("+getBaixista().getExp()+")",
				"Baterista: "+getBaterista().getNome()+" exp("+getBaterista().getExp()+")",
				"Tecladista: "+getTecladista().getNome()+ " exp("+getTecladista().getExp()+")",
				"Guitarrista: "+getGuitarrista().getNome()+" exp("+getGuitarrista().getExp()+")",
		};
		return integrantes;
	}
	
	
}
