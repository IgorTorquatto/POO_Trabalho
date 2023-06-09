package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;

import br.edu.ufca.Excecoes.musicoExistenteException;
import br.edu.ufca.Excecoes.musicoInexistenteException;
import br.edu.ufca.Excecoes.repositorioVazioException;

public class NegocioMusico {
	private IRepositorio repositorio;
	
	public NegocioMusico(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void consultaMusico(MusicoAbstrato musico) throws musicoInexistenteException{
		boolean existe = repositorio.existe(musico);
		if (existe == true) {
			repositorio.consulta(musico);
		}else{
			throw new musicoInexistenteException();
		}
	}
	
	public void atualizaMusico(MusicoAbstrato musicoexistente, MusicoAbstrato novomusico) throws musicoInexistenteException{
		boolean existe = repositorio.existe(musicoexistente);
		if(existe == true) {
			repositorio.atualiza(musicoexistente, novomusico);
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void removeMusico(MusicoAbstrato musico) throws musicoInexistenteException{
		boolean existe = repositorio.existe(musico);
		if(existe == true) {
			repositorio.remove(musico);
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void adicionaMusico(MusicoAbstrato musico) throws musicoInexistenteException, musicoExistenteException{
		boolean existe = repositorio.existe(musico);
		if(musico != null) {
			if(existe == true) {
				throw new musicoExistenteException(musico);
			}else {
				repositorio.adiciona(musico);
			}
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public int qtdBandas() throws repositorioVazioException{
		if(repositorio.vazio() == true) {
			throw new repositorioVazioException();
		}else {
			return repositorio.qtd();
		}
		
	}
}
