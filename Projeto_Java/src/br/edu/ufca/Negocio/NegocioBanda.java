package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;

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
	
}
