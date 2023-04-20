package br.edu.ufca.dados;

import java.util.Random;

public class Banda {
	private Baixista baixista;
	private Baterista baterista;
	private Guitarrista guitarrista;
	private Tecladista tecladista;
	private Vocalista vocalista;
	
	public Banda(Baixista baixista, Baterista baterista, Guitarrista guitarrista, Tecladista tecladista, Vocalista vocalista) {
		this.baixista = baixista;
		this.baterista = baterista;
		this.guitarrista = guitarrista;
		this.tecladista = tecladista;
		this.vocalista = vocalista;
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
	
	//Métodos:
	public void gerarBanda() {
		Random random = new Random();
		
		vocalista = new Vocalista("Vocalista",random.nextInt(30),10);
		baixista = new Baixista("Baixista",random.nextInt(30),10);
		baterista = new Baterista("Baterista",random.nextInt(30),10);
		tecladista = new Tecladista("Tecladista",random.nextInt(30),10);
		guitarrista = new Guitarrista("Guitarrista",random.nextInt(30),10);
		
	}
	
	public String imprimirBanda() {
		String nome_integrantes = "Vocalista: "+getVocalista().getNome()+"\nBaixista: "+getBaixista().getNome()+"\nBaterista: "+getBaterista().getNome()+"\nTecladista: "+getTecladista().getNome()+"\nGuitarrista: "+getGuitarrista().getNome();
		return nome_integrantes;
	}
	
}
