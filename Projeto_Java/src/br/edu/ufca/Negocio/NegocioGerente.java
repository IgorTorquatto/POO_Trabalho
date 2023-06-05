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
			// throw new GerenteNaoCriadoException
			return 0;  // isso deve sair daqui depois de implementar exceções
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
			// throw new GerenteNaoCriadoException()
			return gerente.getNome(); // isso deve sair daqui depois de implementar exceções
		}
	}

	public String checaNomeBanda(Gerente g) {
		return g.getBanda().getNome();
		//exceção
	}

	public String[] checaDetalhesBanda(Gerente g) {
		return g.getBanda().imprimirBanda();
		//exceção
	}

	public void trocaBanda(Gerente gerente2,int escolha, NegocioBanda bandas2) {
		gerente2.setBanda(bandas2.getRepositorio().pegarBanda(escolha));
		//exceção
		
	}

	public void excluiBanda(Gerente gerente2, int escolha, NegocioBanda bandas2) {
		Banda b = bandas2.getRepositorio().pegarBanda(escolha);
		bandas2.removeBanda(b);
		//exceção
	}

	public void setaPrimeiraBanda(Gerente gerente2, NegocioBanda bandas2) {
		gerente2.setBanda(bandas2.getRepositorio().primeiroElemento());
		//exceção
		
	}

	public void realizaShow(Gerente gerente2) {
		Show show = new Show();
		show.realizarShow(gerente2.getBanda(), gerente2);
		//exceção
	}

	public void pagaDespesa(Gerente gerente2) {
		Show show = new Show();
		show.pagarDespesas(gerente2.getBanda(), gerente2);
		//exceção
	}

}
