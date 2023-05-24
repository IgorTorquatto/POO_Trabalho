package br.edu.ufca.Dados;
import java.util.ArrayList;

import br.edu.ufca.Negocio.*;

public class RepositorioBanda implements IRepositorio <Banda>{
	
	/*
	 Só deve conter código de acesso a dados
	 não lança exceções
	 não imprime mensagens
	*/
	
	ArrayList<Banda> bandas; 
	
	//Create
	public RepositorioBanda() {
		this.bandas = new ArrayList<Banda>();
	}

	//Read
	@Override
	public void consulta(Banda banda) {
		if(bandas.contains(banda)) {
				System.out.println(bandas.indexOf(banda)); 
			}
	}
		
	//Update
	@Override
	public void atualiza(Banda bandaExistente, Banda novaBanda) {
	    int index = bandas.indexOf(bandaExistente);
	    if (index != -1) { 
	        bandas.set(index, novaBanda); 
	    } else {
	        System.out.println("Banda não encontrada na lista.");
	    }
	}

	//Delete
	@Override
	public void remove(Banda banda) {
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
