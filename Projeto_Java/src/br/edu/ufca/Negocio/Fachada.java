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

public class Fachada {
	/*
	 Cada método representa uma ação que o usuário pode realizar através do sistema
	 Aqui deve ser toda a classe responsável por fazer toda a conexão entre a camada de negócios, que por sua vez já usa a camada dos dados,
	 e a IU
	*/
	private NegocioBanda bandas;
	private NegocioMusico musicos;
	private NegocioGerente gerente;
	
	//Construtor:
	
	public Fachada() {
		this.bandas = new NegocioBanda(new RepositorioBanda());
		this.musicos = new NegocioMusico(new RepositorioMusicos());
		this.gerente = new NegocioGerente(new Gerente(null, null, 0));
	}
	
	//Banda:
	
	public void adicionarBanda(Banda banda,String nome) throws bandaInexistenteException, bandaExistenteException {   
		Banda b = new Banda(banda.getVocalista(), banda.getTecladista(), banda.getGuitarrista(), banda.getBaterista(), banda.getBaixista(), nome);
		bandas.adicionaBanda(b);
	}
	
	public int consultarIndiceBanda(Banda banda) throws bandaInexistenteException {   
		return bandas.consultaIndiceBanda(banda);
	}
	
	public void atualizarBanda(Banda bandaExistente, Banda novaBanda) throws bandaInexistenteException {  
		bandas.atualizaBanda(bandaExistente, novaBanda);
	}
	
	public void removerBanda(Banda banda) throws bandaInexistenteException {  
		bandas.removeBanda(banda);
	}
	
	public Banda gerarBanda(ArrayList<String> nomes,String nome_banda) {
		 return bandas.geraBanda(nomes, nome_banda);
		
	}
	
	public int checarQuantidadeBanda() throws repositorioVazioException {  
		return bandas.qtdBandas();
	}
	
	public String consultarNomeBanda(int indice) {
		return bandas.consultaNome(indice);
	}
	
	//Musico:
	
	public void adicionarBaixista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {   
		MusicoAbstrato m = new Baixista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarBaterista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {  
		MusicoAbstrato m = new Baterista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarGuitarrista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {   
		MusicoAbstrato m = new Guitarrista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarTecladista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {   
		MusicoAbstrato m = new Tecladista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarVocalista(String nome,double exp,int preco) throws musicoInexistenteException, musicoExistenteException {   
		MusicoAbstrato m = new Vocalista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void consultarMusico(MusicoAbstrato musico) throws musicoInexistenteException {   
		musicos.consultaMusico(musico);
	}
	
	public void atualizarMusico(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) throws musicoInexistenteException {  
		musicos.atualizaMusico(musicoExistente, novoMusico);
	}
	
	public void removerMusico(MusicoAbstrato musico) throws musicoInexistenteException {  
		musicos.removeMusico(musico);
	}
	
	public int checarQuantidadeMusico() throws repositorioVazioException {  
		return musicos.qtdBandas();
	}
	
	//Gerente:
	
	public Gerente adicionarGerente(String nome,double dinheiro,Banda banda) throws gerenteException {
		Gerente g = null;
		g= gerente.adicionaGerente(nome, dinheiro, banda);
		return g;
	}
	
	public double checarSaldoGerente(Gerente g) throws gerenteInexistenteException {
		return gerente.saldo(g);
	}
	
	public String consultarNomeGerente(Gerente g) throws gerenteInexistenteException {
		return gerente.consultaNomeGerente(g);
	}
	
	
<<<<<<< HEAD
	public String comprarVocalistaGerente(Gerente g, int categoria, int posicao) {
		return gerente.compraVocalista(g, categoria, posicao);
	}
	
	public String comprarTecladistaGerente(Gerente g, int categoria, int posicao) {
		return gerente.compraTecladista(g, categoria, posicao);
	}
	
	public String comprarGuitarristaGerente(Gerente g, int categoria, int posicao) {
		return gerente.compraGuitarrista(g, categoria, posicao);
	}
	
	public String comprarBaixistaGerente(Gerente g, int categoria, int posicao) {
		return gerente.compraBaixista(g, categoria, posicao);
	}
	
	public String comprarBateristaGerente(Gerente g, int categoria, int posicao) {
		return gerente.compraBaterista(g, categoria, posicao);
	}
=======
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

>>>>>>> main
	public String checarNomeBanda(Gerente g) throws gerenteInexistenteException {
		return gerente.checaNomeBanda(g);
	}
	
	public String [] checarDetalhesBanda(Gerente g) throws gerenteInexistenteException {
		return gerente.checaDetalhesBanda(g);
	}
	
	public void trocarBanda(Gerente gerente2, NegocioBanda bandas2, int escolha) throws gerenteInexistenteException, bandaInexistenteException {
		gerente.trocaBanda(gerente2,escolha,bandas2);	
	}
	
	public void excluirBanda(Gerente gerente2, NegocioBanda bandas2, int escolha) throws bandaInexistenteException, gerenteInexistenteException {
		gerente.excluiBanda(gerente2,escolha,bandas2);
		
	}
	
	public void setarPrimeiraBanda(Gerente gerente2, NegocioBanda bandas2) throws bandaInexistenteException, gerenteInexistenteException {
		gerente.setaPrimeiraBanda(gerente2,bandas2);
		
	}
	
	public void realizarShow(Gerente gerente2) throws gerenteInexistenteException {
		gerente.realizaShow(gerente2);
	}
	
	public void pagarDespesas(Gerente gerente2) throws gerenteInexistenteException {
		gerente.pagaDespesa(gerente2);
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