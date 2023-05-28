package br.edu.ufca.Negocio;

import java.util.ArrayList;

import br.edu.ufca.Dados.RepositorioBanda;
import br.edu.ufca.Dados.RepositorioMusicos;

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
		this.gerente = new NegocioGerente(new Gerente(null, null, 0) );
	}
	
	//Banda:
	
	public void adicionarBanda(Banda banda,String nome) {   //deve ter throws bandajaexisteException
		Banda b = new Banda(banda.getVocalista(), banda.getTecladista(), banda.getGuitarrista(), banda.getBaterista(), banda.getBaixista(), nome);
		bandas.adicionaBanda(b);
	}
	
	public void consultarBanda(Banda banda) {   //throws bandainexistenteException
		bandas.consultaBanda(banda);
	}
	
	public void atualizarBanda(Banda bandaExistente, Banda novaBanda) {  //throws bandainexistente Exception
		bandas.atualizaBanda(bandaExistente, novaBanda);
	}
	
	public void removerBanda(Banda banda) {  //throws bandainexistente Exception
		bandas.removeBanda(banda);
	}
	
	public int checarQuantidadeBanda() {  //throws repositoriovazioException
		return bandas.qtdBandas();
	}
	
	public Banda gerarBanda(ArrayList<String> nomes,String nome_banda) {
		 return bandas.geraBanda(nomes, nome_banda);
		
	}
	
	//Musico:
	
	public void adicionarBaixista(String nome,double exp,int preco) {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Baixista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarBaterista(String nome,double exp,int preco) {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Baterista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarGuitarrista(String nome,double exp,int preco) {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Guitarrista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarTecladista(String nome,double exp,int preco) {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Tecladista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void adicionarVocalista(String nome,double exp,int preco) {   //deve ter throws musicojaexisteException
		MusicoAbstrato m = new Vocalista(nome,exp,preco);
		musicos.adicionaMusico(m);
	}
	
	public void consultarMusico(MusicoAbstrato musico) {   //throws musicoinexistenteException
		musicos.consultaMusico(musico);
	}
	
	public void atualizarMusico(MusicoAbstrato musicoExistente, MusicoAbstrato novoMusico) {  //throws musicoinexistente Exception
		musicos.atualizaMusico(musicoExistente, novoMusico);
	}
	
	public void removerMusico(MusicoAbstrato musico) {  //throws musicoinexistenteException
		musicos.removeMusico(musico);
	}
	
	public int checarQuantidadeMusico() {  //throws repositoriovazioException
		return musicos.qtdBandas();
	}
	
	//Gerente:
	
	public void adicionarGerente(String nome,double dinheiro,Banda banda) {
		 gerente.adicionaGerente(nome, dinheiro, banda);
	}
	
	public double checarSaldo() {
		return this.gerente.saldo();
	}
	
}
