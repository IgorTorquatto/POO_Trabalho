package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;
import br.edu.ufca.Excecoes.bandaInexistenteException;
import br.edu.ufca.Excecoes.gerenteException;
import br.edu.ufca.Excecoes.gerenteInexistenteException;

public class NegocioGerente {
	/*
	 Regras de négocio para manipulação do gerente
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
	
	public String compraVocalista(Gerente gerente, int categoria, int posicao) {
		return Loja.comprarVocalista(gerente, categoria, posicao);
		
	}
	
	public String compraGuitarrista(Gerente gerente, int categoria, int posicao) {
		return Loja.comprarGuitarrista(gerente, categoria, posicao);
		
	}
	
	public String compraTecladista(Gerente gerente, int categoria, int posicao) {
		return Loja.comprarTecladista(gerente, categoria, posicao);
		
	}
	
	public String compraBaixista(Gerente gerente, int categoria, int posicao) {
		return Loja.comprarBaixista(gerente, categoria, posicao);
		
	}
	
	public String compraBaterista(Gerente gerente, int categoria, int posicao) {
		return Loja.comprarBaterista(gerente, categoria, posicao);
		
	}
	
	public String consultaNomeGerente(Gerente gerente) throws gerenteInexistenteException{
		if(gerente != null) {
			return gerente.getNome();
		}else {
			throw new gerenteInexistenteException();
		}
	}

	public String checaNomeBanda(Gerente g) throws gerenteInexistenteException{
		if(g != null) {
			return g.getBanda().getNome();
		}else {
			throw new gerenteInexistenteException();
		}
	}

	public String[] checaDetalhesBanda(Gerente g) throws gerenteInexistenteException{
		if(gerente != null) {
			return g.getBanda().imprimirBanda();
		}else {
			throw new gerenteInexistenteException();
		}
	}

	public void trocaBanda(Gerente gerente2,int escolha, NegocioBanda bandas2) throws gerenteInexistenteException, bandaInexistenteException{
		if(gerente2 != null) {
			if(bandas2 != null) {
				gerente2.setBanda(bandas2.getRepositorio().pegarBanda(escolha));
			}else {
				throw new bandaInexistenteException();
			}
		}else {
			throw new gerenteInexistenteException();
		}
	}

	public void excluiBanda(Gerente gerente2, int escolha, NegocioBanda bandas2) throws bandaInexistenteException, gerenteInexistenteException{
		Banda b = bandas2.getRepositorio().pegarBanda(escolha);
		if(b != null) {
			if(gerente2 != null) {
				bandas2.removeBanda(b);
			}else {
				throw new gerenteInexistenteException();
			}
			
		}else {
			throw new bandaInexistenteException();
		}
	}

	public void setaPrimeiraBanda(Gerente gerente2, NegocioBanda bandas2) throws bandaInexistenteException, gerenteInexistenteException{
		if(bandas2 != null) {
			if(gerente2 != null) {
				gerente2.setBanda(bandas2.getRepositorio().primeiroElemento());
			}else {
				throw new gerenteInexistenteException();
			}
		}else {
			throw new bandaInexistenteException();
		}
	}

	public void realizaShow(Gerente gerente2) throws gerenteInexistenteException{
		Show show = new Show();
		if(gerente2 != null) {
			show.realizarShow(gerente2.getBanda(), gerente2);
		}else {
			throw new gerenteInexistenteException();
		}
	}

	public void pagaDespesa(Gerente gerente2) throws gerenteInexistenteException{
		Show show = new Show();
		if(gerente2 != null) {
			show.pagarDespesas(gerente2.getBanda(), gerente2);
		}else {
			throw new gerenteInexistenteException();
		}
	}

}
