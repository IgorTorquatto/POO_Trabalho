package br.edu.ufca.repositorio;
import br.edu.ufca.dados.*;
import java.util.ArrayList;

public class RepositorioBanda {
	
	//Guarda todas as bandas do usuário
	
	ArrayList<Banda> bandas;  // new ArrayList<Banda>();
	
	//Create
	public RepositorioBanda() {
		this.bandas = new ArrayList<Banda>();
	}

	//Read
	public void consultaBanda(Banda banda) {
		if(bandas.contains(banda)) {
				System.out.println(bandas.indexOf(banda)); 
			}
	}
		
	//Update
	public void adicionaBanda(Banda banda) {
			this.bandas.add(banda);
	}
	
	//Delete
	public void removeBanda(Banda banda) {
		if(bandas.contains(banda)) {
			bandas.remove(banda);
			}
	}

	public ArrayList<Banda> getBandas() {
		return bandas;
	}

	public void setBandas(ArrayList<Banda> bandas) {
		this.bandas = bandas;
	}
		
	//Outros métodos:
	
	public int qtdBandas() {
		int qtd = bandas.size();
		return qtd;
	}
	
	public void imprimeNomesBandas() {
		for(int i = 0 ; i < bandas.size();i++) {
			System.out.println(bandas.get(i).getNome());
		}
	}
}
