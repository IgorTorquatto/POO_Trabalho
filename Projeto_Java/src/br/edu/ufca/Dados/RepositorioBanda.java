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
	public int consulta(Banda banda) {
		return bandas.indexOf(banda);
	}
		
	//Update
	@Override
	public void atualiza(Banda bandaExistente, Banda novaBanda) {
	    int index = bandas.indexOf(bandaExistente);
	    bandas.set(index, novaBanda); 
	}

	//Delete
	@Override
	public void remove(Banda banda) {
		bandas.remove(banda);
	}
	
	@Override
	public boolean existe(Banda banda) {
		int index = bandas.indexOf(banda);
		if(index != -1) {
			return true;
		}
		else {
			return false;
		}
	}

	public ArrayList<Banda> getBandas() {
		return bandas;
	}

	public void setBandas(ArrayList<Banda> bandas) {
		this.bandas = bandas;
	}
		
	//Outros métodos:
	
	@Override
	public void adiciona(Banda banda) {
		this.bandas.add(banda);
	}
	
	@Override
	public int qtd() {
		int qtd = bandas.size();
		return qtd;
	}
	
	@Override
	public boolean vazio() {
		if(bandas.size() > 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public Banda geraBanda(ArrayList<String> nomes,String nome_banda) {
		Banda b = new Banda(null, null, null, null, null, nome_banda);
		b.gerarBanda(nomes, nome_banda);
		return b;
	}
}
