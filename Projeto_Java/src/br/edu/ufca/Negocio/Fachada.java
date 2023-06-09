package br.edu.ufca.Negocio;

import java.util.ArrayList;


import br.edu.ufca.Dados.RepositorioBanda;
import br.edu.ufca.Dados.RepositorioMusicos;
import br.edu.ufca.Excecoes.bandaExistenteException;
import br.edu.ufca.Excecoes.bandaInexistenteException;
import br.edu.ufca.Excecoes.gerenteException;
import br.edu.ufca.Excecoes.gerenteInexistenteException;
import br.edu.ufca.Excecoes.musicoExistenteException;
import br.edu.ufca.Excecoes.musicoInexistenteException;
import br.edu.ufca.Excecoes.repositorioVazioException;
import br.edu.ufca.Dados.IRepositorio;

public class Fachada {
	/*
	 Cada método representa uma ação que o usuário pode realizar através do sistema
	 Aqui deve ser toda a classe responsável por fazer toda a conexão entre a camada de negócios, que por sua vez já usa a camada dos dados,
	 e a IU
	*/
	private IRepositorio repositorio;
	private NegocioBanda bandas;
	private NegocioMusico musicos;
	private NegocioGerente gerente;
	
	//Construtor:
	
	public Fachada() {
		this.bandas = new NegocioBanda(new RepositorioBanda());
		this.gerente = new NegocioGerente(new Gerente(null, null, 5000));
	}
	
	//Banda:
	
	public void adicionarBanda(Banda banda,String nome) throws bandaInexistenteException, bandaExistenteException{   //deve ter throws bandaexistenteException
		Banda b = new Banda(banda.getVocalista(), banda.getTecladista(), banda.getGuitarrista(), banda.getBaterista(), banda.getBaixista(), nome);
		boolean existe = repositorio.existe(banda);
		if(banda != null) {
			if(existe == true) {
				throw new bandaExistenteException(banda);
			}else {
				bandas.adicionaBanda(b);
			}
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public int consultarBanda(Banda banda) throws bandaInexistenteException{   //throws bandainexistenteException
		boolean existe = repositorio.existe(banda);
		if (existe == true) {
			return bandas.consultaBanda(banda);
		}else{
			throw new bandaInexistenteException();
		}
	}
	
	public void atualizarBanda(Banda bandaExistente, Banda novaBanda) throws bandaInexistenteException{  //throws bandainexistente Exception
		boolean existe = repositorio.existe(bandaExistente);
		if(existe == true) {
			bandas.atualizaBanda(bandaExistente, novaBanda);
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public void removerBanda(Banda banda) throws bandaInexistenteException{  //throws bandainexistente Exception
		boolean existe = repositorio.existe(banda);
		if(existe == true) {
			bandas.removeBanda(banda);
		}else {
			throw new bandaInexistenteException();
		}
	}
	
	public Banda gerarBanda(ArrayList<String> nomes,String nome_banda) {
		 return bandas.geraBanda(nomes, nome_banda);
		
	}
	
	public int checarQuantidadeBanda() throws repositorioVazioException{  //throws repositoriovazioException
		if(repositorio.vazio() == true) {
			throw new repositorioVazioException();
		}else {
			return bandas.qtdBandas();
		}
	}
	
	public String consultarNomeBanda(int indice) {
		return bandas.consultaNome(indice);
	}
	
	//Musico:
	
	public void adicionarBaixista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException{   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Baixista(nome,exp,preco);
		boolean existe = repositorio.existe(m);
		if(m != null) {
			if(existe == true) {
				throw new musicoExistenteException(m);
			}else {
				musicos.adicionaMusico(m);
			}
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void adicionarBaterista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException{   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Baterista(nome,exp,preco);
		boolean existe = repositorio.existe(m);
		if(m != null) {
			if(existe == true) {
				throw new musicoExistenteException(m);
			}else {
				musicos.adicionaMusico(m);
			}
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void adicionarGuitarrista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException{   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Guitarrista(nome,exp,preco);
		boolean existe = repositorio.existe(m);
		if(m != null) {
			if(existe == true) {
				throw new musicoExistenteException(m);
			}else {
				musicos.adicionaMusico(m);
			}
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void adicionarTecladista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Tecladista(nome,exp,preco);
		boolean existe = repositorio.existe(m);
		if(m != null) {
			if(existe == true) {
				throw new musicoExistenteException(m);
			}else {
				musicos.adicionaMusico(m);
			}
		}else {
			throw new musicoInexistenteException();
		}
		
	}
	
	public void adicionarVocalista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException{   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Vocalista(nome,exp,preco);
		boolean existe = repositorio.existe(m);
		if(m != null) {
			if(existe == true) {
				throw new musicoExistenteException(m);
			}else {
				musicos.adicionaMusico(m);
			}
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void consultarMusico(MusicoAbstrato musico) throws musicoInexistenteException {   //throws musicoinexistenteException
		boolean existe = repositorio.existe(musico);
		if (existe == true) {
			musicos.consultaMusico(musico);
		}else{
			throw new musicoInexistenteException();
		}
	}
	
	public void atualizarMusico(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) throws musicoInexistenteException{  //throws musicoinexistente Exception
		boolean existe = repositorio.existe(musicoExistente);
		if(existe == true) {
			musicos.atualizaMusico(musicoExistente, novoMusico);
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public void removerMusico(MusicoAbstrato musico) throws musicoInexistenteException {  //throws musicoinexistenteException
		boolean existe = repositorio.existe(musico);
		if(existe == true) {
			musicos.removeMusico(musico);
		}else {
			throw new musicoInexistenteException();
		}
	}
	
	public int checarQuantidadeMusico() throws repositorioVazioException {  //throws repositoriovazioException
		if(repositorio.vazio() == true) {
			throw new repositorioVazioException();
		}else {
			return musicos.qtdBandas();
		}
	}
	
	//Gerente:
	
	public Gerente adicionarGerente(String nome,double dinheiro,Banda banda) throws gerenteException{
		Gerente g = null;
		if(nome != null && dinheiro!= 0 && banda != null) {
			g = gerente.adicionaGerente(nome, dinheiro, banda);
			return g;
		}else {
			throw new gerenteException();
		}
	}
	
	public double checarSaldoGerente(Gerente g) throws gerenteInexistenteException{
		if(g != null) {
			return gerente.saldo(g);
		}else {
			throw new gerenteInexistenteException();
		}
	}
	
	public String consultarNomeGerente(Gerente g) throws gerenteInexistenteException{
		if(gerente != null) {
			return gerente.consultaNomeGerente(g);
		}else {
			throw new gerenteInexistenteException(); //excecao
		}
	}
	
	
	public void comprarVocalistaGerente(Gerente g) {
		gerente.compraVocalista(g);
	}
	
	public void comprarTecladistaGerente(Gerente g) {
		gerente.compraTecladista(g);
	}
	
	public void comprarGuitarristaGerente(Gerente g) {
		gerente.compraGuitarrista(g);
	}
	
	public void comprarBaixistaGerente(Gerente g) {
		gerente.compraBaixista(g);
	}
	
	public void comprarBateristaGerente(Gerente g) {
		gerente.compraBaterista(g);
	}

	public String checarNomeBanda(Gerente g) {
		return gerente.checaNomeBanda(g);
	}
	
	public String [] checarDetalhesBanda(Gerente g) {
		return gerente.checaDetalhesBanda(g);
	}
	
	public void trocarBanda(Gerente gerente2, NegocioBanda bandas2, int escolha) {
		gerente.trocaBanda(gerente2,escolha,bandas2);	
	}
	
	//Get & Set
	
	public NegocioBanda getBandas() {
		return bandas;
	}

	public void setBandas(NegocioBanda bandas) {
		this.bandas = bandas;
	}

	public NegocioMusico getMusicos() {
		return musicos;
	}

	public void setMusicos(NegocioMusico musicos) {
		this.musicos = musicos;
	}

	public NegocioGerente getGerente() {
		return gerente;
	}

	public void setGerente(NegocioGerente gerente) {
		this.gerente = gerente;
	}

}
