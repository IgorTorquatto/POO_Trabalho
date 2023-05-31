package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.RepositorioBanda;

public class Fachada {
	/*
	 Cada método representa uma ação que o usuário pode realizar através do sistema
	 Aqui deve ser toda a classe responsável por fazer toda a conexão entre a camada de negócios, que por sua vez já usa a camada dos dados,
	 e a IU
	*/
	private NegocioBanda bandas;
	private NegocioGerente gerente;
	
	public Fachada() {
		this.bandas = new NegocioBanda(new RepositorioBanda());
		//this.gerente = new NegocioGerente(new Gerente(null, null, 5000));
	}
}
