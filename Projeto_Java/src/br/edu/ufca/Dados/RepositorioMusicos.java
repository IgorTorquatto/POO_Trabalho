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
	public int consulta(MusicoAbstrato musico) {
		return musicos.indexOf(musico); 
	}
	
	//Update
	@Override
	public void atualiza(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) {
		int index = musicos.indexOf(musicoExistente);
	    musicos.set(index, novoMusico); 
	}
	
	//Delete
	@Override
	public void remove(MusicoAbstrato musico) {
		musicos.remove(musico);
	}
	
	//Get & Set:
	
	public ArrayList<MusicoAbstrato> getMusicos() {
		return musicos;
	}

	public void setMusicos(ArrayList<MusicoAbstrato> musicos) {
		this.musicos = musicos;
	}
	
	//Outros métodos:
	
	@Override
	public void adiciona(MusicoAbstrato musico) {
		this.musicos.add(musico);
	}
	
	public void imprimirMusicos() {
		for(int i = 0; i < 3 ; i++) {
			System.out.println(musicos.get(i).getNome()+" "+musicos.get(i).getPreco()+" R$");
		}
	}

	@Override
	public boolean existe(MusicoAbstrato musico) {
		int index = musicos.indexOf(musico);
		if(index != -1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int qtd() {
		int qtd = musicos.size();
		return qtd;
	}

	@Override
	public boolean vazio() {
		if(musicos.size() > 0) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Banda geraBanda(ArrayList<String> nomes, String nome_banda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaNome(int indice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banda pegarBanda(int indice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banda primeiroElemento() {
		// TODO Auto-generated method stub
		return null;
	}


}
