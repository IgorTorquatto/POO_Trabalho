package br.edu.ufca.Negocio;

import java.util.ArrayList;

import br.edu.ufca.Dados.IRepositorio;
import br.edu.ufca.Dados.RepositorioBanda;

public class NegocioBanda {
	
	/*
	 Regras de négocio para manipulação de bandas
	 Utiliza o repositório de bandas
	 Envia exceções para a interface com o usuário
	*/
	
	private IRepositorio repositorio;
	
	public NegocioBanda(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public int consultaBanda(Banda banda) {
		boolean existe = repositorio.existe(banda);
		if (existe == true) {
			return repositorio.consulta(banda);
		}else{
			//Lança exceção
			return repositorio.consulta(banda);
		}
	}
	
	public void atualizaBanda(Banda bandaExistente, Banda novaBanda) {
		boolean existe = repositorio.existe(bandaExistente);
		if(existe == true) {
			repositorio.atualiza(bandaExistente, novaBanda);
		}else {
			//Lança a exceção
		}
	}
	
	public void removeBanda(Banda banda) {
		boolean existe = repositorio.existe(banda);
		if(existe == true) {
			repositorio.remove(banda);
		}else {
			//Lança a exceção 
		}
	}
	
	public void adicionaBanda(Banda banda) {
		boolean existe = repositorio.existe(banda);
		if(banda != null) {
			if(existe == true) {
				// lança exceção
			}else {
				repositorio.adiciona(banda);
			}
		}else {
			// lança exceção
		}
	}
	
	public int qtdBandas() {
		if(repositorio.vazio() == true) {
			//exceção
			return 0;
		}else {
			return repositorio.qtd();
		}
		
	}
	
	public Banda geraBanda(ArrayList<String> nomes,String nome_banda) {
		 return repositorio.geraBanda(nomes,nome_banda);
	}
	
	public String consultaNome(int indice) {
		return repositorio.consultaNome(indice);
	}

	//Get & Set:
	
	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	
	
}
