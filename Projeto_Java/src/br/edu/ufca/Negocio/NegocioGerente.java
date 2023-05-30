package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;

public class NegocioGerente {
	/*
	 Regras de négocio para manipulação do gerente
	 Envia exceções para a interface com o usuário
	*/
	
	private Gerente gerente;
	
	public NegocioGerente(Gerente gerente ) {
		this.gerente = gerente;
	}
	
	public double saldo(Gerente g) {
		if(gerente != null) {
			return g.getDinheiro();
		}else {
			//exceção
			return 0;
		}
	}
	
	public Gerente adicionaGerente(String nome,double dinheiro,Banda banda) {
		Gerente g = null;
		if(nome != null && dinheiro!= 0 && banda != null) {
			g = new Gerente(nome, banda, dinheiro);
		}else {
			//exceção

		}
		return g;
		
	}
	
	public void compraVocalista(Gerente gerente) {
		Loja.comprarVocalista(gerente);
		
	}
	
	public void compraGuitarrista(Gerente gerente) {
		Loja.comprarGuitarrista(gerente);
		
	}
	
	public void compraTecladista(Gerente gerente) {
		Loja.comprarTecladista(gerente);
		
	}
	
	public void compraBaixista(Gerente gerente) {
		Loja.comprarBaixista(gerente);
		
	}
	
	public void compraBaterista(Gerente gerente) {
		Loja.comprarBaterista(gerente);
		
	}
	
	public String consultaNomeGerente(Gerente gerente) {
		if(gerente != null) {
			return gerente.getNome();
		}else {
			return gerente.getNome(); //excecao
		}
	}

	public String checaNomeBanda(Gerente g) {
		return g.getBanda().getNome();
	}



}
