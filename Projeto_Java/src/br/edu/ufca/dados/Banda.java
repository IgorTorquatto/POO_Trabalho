package br.edu.ufca.dados;

public class Banda {
	Baixista baixista;
	Baterista baterista;
	Guitarrista guitarrista;
	Tecladista tecladista;
	Vocalista vocalista;
	
	public Banda(Baixista baixista, Baterista baterista, Guitarrista guitarrista, Tecladista tecladista, Vocalista vocalista) {
		this.baixista = baixista;
		this.baterista = baterista;
		this.guitarrista = guitarrista;
		this.tecladista = tecladista;
		this.vocalista = vocalista;
	}

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
	
	
}
