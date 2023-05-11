package br.edu.ufca.repositorio;
import br.edu.ufca.dados.*;

import java.util.ArrayList;

public class RepositorioBanda {
	
	//Guarda todas as bandas do usuário
	
	ArrayList<Banda> bandas; 
	
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
	public void atualizaBanda(Banda bandaExistente, Banda novaBanda) {
	    int index = bandas.indexOf(bandaExistente);
	    if (index != -1) { // verifica se a banda existente está na lista
	        bandas.set(index, novaBanda); // substitui a banda existente pela nova banda
	    } else {
	        System.out.println("Banda não encontrada na lista.");
	    }
	}

	//Delete
	public void removeBanda(Banda banda) {
		if(bandas.contains(banda)) {
			bandas.remove(banda);
			}
		else {
			System.out.println("Banda não está contida na lista.");
		}
	}

	public ArrayList<Banda> getBandas() {
		return bandas;
	}

	public void setBandas(ArrayList<Banda> bandas) {
		this.bandas = bandas;
	}
		
	//Outros métodos:
	
	public void adicionaBanda(Banda banda) {
		this.bandas.add(banda);
	}
	
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
