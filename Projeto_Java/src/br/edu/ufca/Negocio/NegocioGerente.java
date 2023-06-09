package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;
import br.edu.ufca.Excecoes.gerenteException;
import br.edu.ufca.Excecoes.gerenteInexistenteException;

public class NegocioGerente {
	/*
	 Regras de négocio para manipulação do gerente
	 Envia exceções para a interface com o usuário
	*/
	
	private Gerente gerente;
	
	public NegocioGerente(Gerente gerente ) {
		this.gerente = gerente;
	}
	
	public double saldo(Gerente g) throws gerenteInexistenteException{
		if(gerente != null) {
			return g.getDinheiro();
		}else {
			throw new gerenteInexistenteException();
		}
	}
	
	public Gerente adicionaGerente(String nome,double dinheiro,Banda banda) throws gerenteException{
		Gerente g = null;
		if(nome != null && dinheiro!= 0 && banda != null) {
			g = new Gerente(nome, banda, dinheiro);
			return g;
		}else {
			throw new gerenteException();
		}	
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
	
	public String consultaNomeGerente(Gerente gerente) throws gerenteInexistenteException{
		if(gerente != null) {
			return gerente.getNome();
		}else {
			throw new gerenteInexistenteException(); //excecao
		}
	}

	public String checaNomeBanda(Gerente g) {
		return g.getBanda().getNome();
	}

	public String[] checaDetalhesBanda(Gerente g) {
		return g.getBanda().imprimirBanda();
	}

	public void trocaBanda(Gerente gerente2,int escolha, NegocioBanda bandas2) {
		gerente2.setBanda(bandas2.getRepositorio().pegarBanda(escolha));
		
	}


}
