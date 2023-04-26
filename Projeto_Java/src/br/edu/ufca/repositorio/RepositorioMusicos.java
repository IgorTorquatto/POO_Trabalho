package br.edu.ufca.repositorio;

import java.util.ArrayList;
import br.edu.ufca.dados.*;

public class RepositorioMusicos {
	
	private ArrayList<MusicoAbstrato> musicos;
	//CRUD:
	
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
	public void adicionaMusico(MusicoAbstrato musico) {
		this.musicos.add(musico);
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
	
	public void imprimirVocalistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirTecladistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirGuitarristas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirBaixistas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
	
	public void imprimirBateristas() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}
}
