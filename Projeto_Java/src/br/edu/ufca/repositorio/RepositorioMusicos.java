package br.edu.ufca.repositorio;
import java.util.ArrayList;

import br.edu.ufca.dados.*;

public class RepositorioMusicos {
	
	private ArrayList<MusicoAbstrato> musicos;

	//Create
	public RepositorioMusicos() {
		this.musicos = new ArrayList<MusicoAbstrato>();
	}

	//Read
	public void consultaMusico(MusicoAbstrato musico) {
		if(musicos.contains(musico)) {
			System.out.println(musicos.indexOf(musico)); 
		}
	}
	
	//Update

	public void atualizaMusico(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) {
	    int index = musicos.indexOf(musicoExistente);
	    if (index != -1) { // verifica se o musico existente está na lista
	        musicos.set(index, novoMusico); // substitui o musico existente pelo novo musico
	    } else {
	        System.out.println("Músico não encontrado na lista.");
	    }
	}
	
	//Delete
	public void removeMusico(MusicoAbstrato musico) {
		if(musicos.contains(musico)) {
			musicos.remove(musico);
		}
	}
	
	//Get & Set:
	
	public ArrayList<MusicoAbstrato> getMusicos() {
		return musicos;
	}

	public void setMusicos(ArrayList<MusicoAbstrato> musicos) {
		this.musicos = musicos;
	}
	
	//Outros métodos:
	
	public void adicionaMusico(MusicoAbstrato musico) {
		this.musicos.add(musico);
	}
	
	public void imprimirMusicos() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
	
}
