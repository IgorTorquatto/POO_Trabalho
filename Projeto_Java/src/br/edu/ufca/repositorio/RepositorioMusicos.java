package br.edu.ufca.repositorio;

import java.util.ArrayList;
import br.edu.ufca.dados.*;

public class RepositorioMusicos {
	
	private ArrayList<Vocalista> vocalistas ;
	private ArrayList<Tecladista> tecladistas ;
	private ArrayList<Guitarrista> guitarristas ;
	private ArrayList<Baterista> bateristas ;
	private ArrayList<Baixista> baixistas ;
	
	//CRUD:
	
	//Create
	public RepositorioMusicos() {
		this.vocalistas = new ArrayList<Vocalista>();
		this.tecladistas = new ArrayList<Tecladista>();
		this.guitarristas = new ArrayList<Guitarrista>();
		this.bateristas = new ArrayList<Baterista>();
		this.baixistas = new ArrayList<Baixista>();
	}

	//Read
	public ArrayList<Vocalista> getVocalistas() {
		return vocalistas;
	}

	public ArrayList<Tecladista> getTecladistas() {
		return tecladistas;
	}

	public ArrayList<Guitarrista> getGuitarristas() {
		return guitarristas;
	}

	public ArrayList<Baterista> getBateristas() {
		return bateristas;
	}
	
	public ArrayList<Baixista> getBaixistas() {
		return baixistas;
	}
	
	//Update
	public void setVocalistas(ArrayList<Vocalista> vocalistas) {
		this.vocalistas = vocalistas;
	}
	
	public void setBaixistas(ArrayList<Baixista> baixistas) {
		this.baixistas = baixistas;
	}
	
	public void setTecladistas(ArrayList<Tecladista> tecladistas) {
		this.tecladistas = tecladistas;
	}
	
	public void setGuitarristas(ArrayList<Guitarrista> guitarristas) {
		this.guitarristas = guitarristas;
	}
	
	public void setBateristas(ArrayList<Baterista> bateristas) {
		this.bateristas = bateristas;
	}
	
	//Delete
	
	
	
	//Outros métodos:
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
	
	public void imprimirBateristas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(bateristas.get(i).getNome()+" "+bateristas.get(i).getPreco()+" R$");
		}
	}
	
}
