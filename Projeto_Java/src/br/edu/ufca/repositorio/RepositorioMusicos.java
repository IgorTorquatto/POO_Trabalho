package br.edu.ufca.repositorio;

import java.util.ArrayList;
import br.edu.ufca.dados.*;

public class RepositorioMusicos {
	
	private ArrayList<Vocalista> vocalistas ;
	private ArrayList<Tecladista> tecladistas ;
	private ArrayList<Guitarrista> guitarristas ;
	private ArrayList<Baterista> bateristas ;
	private ArrayList<Baixista> baixistas ;
	
	
	public RepositorioMusicos() {
		this.vocalistas = new ArrayList<Vocalista>();
		this.tecladistas = new ArrayList<Tecladista>();
		this.guitarristas = new ArrayList<Guitarrista>();
		this.bateristas = new ArrayList<Baterista>();
		this.baixistas = new ArrayList<Baixista>();
	}


	public ArrayList<Vocalista> getVocalistas() {
		return vocalistas;
	}


	public void setVocalistas(ArrayList<Vocalista> vocalistas) {
		this.vocalistas = vocalistas;
	}
	
	public void imprimirVocalistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(vocalistas.get(i).getNome()+" "+vocalistas.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirTecladistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(tecladistas.get(i).getNome()+" "+tecladistas.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirGuitarristas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(guitarristas.get(i).getNome()+" "+guitarristas.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirBaixistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(baixistas.get(i).getNome()+" "+baixistas.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirBaterstas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(bateristas.get(i).getNome()+" "+bateristas.get(i).getPreco()+" R$");
		}
	}

	public ArrayList<Tecladista> getTecladistas() {
		return tecladistas;
	}


	public void setTecladistas(ArrayList<Tecladista> tecladistas) {
		this.tecladistas = tecladistas;
	}


	public ArrayList<Guitarrista> getGuitarristas() {
		return guitarristas;
	}


	public void setGuitarristas(ArrayList<Guitarrista> guitarristas) {
		this.guitarristas = guitarristas;
	}


	public ArrayList<Baterista> getBateristas() {
		return bateristas;
	}


	public void setBateristas(ArrayList<Baterista> bateristas) {
		this.bateristas = bateristas;
	}


	public ArrayList<Baixista> getBaixistas() {
		return baixistas;
	}


	public void setBaixistas(ArrayList<Baixista> baixistas) {
		this.baixistas = baixistas;
	}
	
	
}
