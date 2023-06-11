package br.edu.ufca.Negocio;

import java.util.ArrayList;

import br.edu.ufca.Dados.IRepositorio;
import br.edu.ufca.Dados.RepositorioBanda;
import br.edu.ufca.Excecoes.bandaExistenteException;
import br.edu.ufca.Excecoes.bandaInexistenteException;
import br.edu.ufca.Excecoes.repositorioVazioException;

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
	
	public int consultaIndiceBanda(Banda banda) throws bandaInexistenteException{
		boolean existe = repositorio.existe(banda);
		if (existe == true) {
			return repositorio.consulta(banda);
		}else{
			throw new bandaInexistenteException();
		}
	}
	
	public void atualizaBanda(Banda bandaExistente, Banda novaBanda) throws bandaInexistenteException{
		boolean existe = repositorio.existe(bandaExistente);
		if(existe == true) {
			repositorio.atualiza(bandaExistente, novaBanda);
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public void removeBanda(Banda banda) throws bandaInexistenteException{
		boolean existe = repositorio.existe(banda);
		if(existe == true) {
			repositorio.remove(banda);
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public void adicionaBanda(Banda banda) throws bandaInexistenteException, bandaExistenteException{
		boolean existe = repositorio.existe(banda);
		if(banda != null) {
			if(existe == true) {
				throw new bandaExistenteException(banda);
			}else {
				repositorio.adiciona(banda);
			}
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public int qtdBandas() throws repositorioVazioException{
		if(repositorio.vazio() == true) {
			throw new repositorioVazioException();
		}else {
			return repositorio.qtd();
		}
		
	}
	
	public Banda geraBanda(ArrayList<String> nomes,String nome_banda) {
		if(repositorio.vazio() == true){
			return repositorio.geraBanda(nomes,nome_banda); 
		}else {
			return repositorio.geraBanda(nomes,nome_banda);
		}
	}
	
	public String consultaNome(int indice) {
		if(repositorio.vazio() == true) {
			return repositorio.consultaNome(indice); 
		} else {
			return repositorio.consultaNome(indice);
		}
	}

	//Get & Set:
	
	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}

}
