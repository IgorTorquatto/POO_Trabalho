package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;

public class NegocioMusico {
	private IRepositorio repositorio;
	
	public NegocioMusico(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	public void consultaMusico(MusicoAbstrato musico) {
		boolean existe = repositorio.existe(musico);
		if (existe == true) {
			repositorio.consulta(musico);
		}else{
			//Lança exceção
		}
	}
	
	public void atualizaMusico(MusicoAbstrato musicoexistente, MusicoAbstrato novomusico) {
		boolean existe = repositorio.existe(musicoexistente);
		if(existe == true) {
			repositorio.atualiza(musicoexistente, novomusico);
		}else {
			//Lança a exceção
		}
	}
	
	public void removeMusico(MusicoAbstrato musico) {
		boolean existe = repositorio.existe(musico);
		if(existe == true) {
			repositorio.remove(musico);
		}else {
			//Lança a exceção
		}
	}
	
	public void adicionaMusico(MusicoAbstrato musico) {
		boolean existe = repositorio.existe(musico);
		if(musico != null) {
			if(existe == true) {
				// lança exceção
			}else {
				repositorio.adiciona(musico);
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
}
