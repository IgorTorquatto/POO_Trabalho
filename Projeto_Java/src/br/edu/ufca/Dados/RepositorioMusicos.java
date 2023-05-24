package br.edu.ufca.Dados;
import java.util.ArrayList;

import br.edu.ufca.Negocio.*;

public class RepositorioMusicos implements IRepositorio<MusicoAbstrato> {
	
	/*
	 Só deve conter código de acesso a dados
	 não lança exceções
	 não imprime mensagens
	*/
	
	private ArrayList<MusicoAbstrato> musicos;

	//Create
	public RepositorioMusicos() {
		this.musicos = new ArrayList<MusicoAbstrato>();
	}

	//Read
	@Override
	public void consulta(MusicoAbstrato musico) {
		if(musicos.contains(musico)) {
			System.out.println(musicos.indexOf(musico)); 
		}
	}
	
	//Update
	@Override
	public void atualiza(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) {
	    int index = musicos.indexOf(musicoExistente);
	    if (index != -1) { 
	        musicos.set(index, novoMusico); 
	    } else {
	        System.out.println("Músico não encontrado na lista.");
	    }
	}
	
	//Delete
	@Override
	public void remove(MusicoAbstrato musico) {
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
