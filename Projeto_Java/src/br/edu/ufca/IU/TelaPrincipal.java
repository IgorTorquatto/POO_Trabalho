package br.edu.ufca.IU;

import java.util.Scanner;

import br.edu.ufca.Dados.IRepositorio;
import br.edu.ufca.Negocio.*;

public class TelaPrincipal {
	
	private Scanner scanner;
	private TelaLoja telaloja;
	private TelaShow telashow;
	private TelaCadastro telacadastro;
	private TelaBanda telabanda;
	private Fachada fachada;
	
	public TelaPrincipal(Fachada fachada) {
		scanner = new Scanner(System.in);
		telaloja = new TelaLoja(fachada);
		telashow = new TelaShow(fachada);
		telacadastro = new TelaCadastro(fachada);
		telabanda = new TelaBanda(fachada);
		this.fachada = fachada;
	}
	
	public void iniciar(){
		
	    boolean sair = false;
	    Gerente gerente;
	 
	    gerente = telacadastro.cadastroIncial();
	   
	    System.out.println("Olá, "+ fachada.consultarNomeGerente(gerente)+ "!");
		
		while(sair == false){
		System.out.println(
				">>>> Menu Principal <<<<\n"
				+ "1-Cadastrar nova banda\n"
		   		+ "2-Detalhes da banda\n"
		   		+ "3-Abrir loja \n"
		   		+ "4-Realizar show \n"
		   		+ "5-Excluir bandas\n"
		   		+ "6-Trocar de banda \n"
		   		+ "7-Encerrar programa\n"
		   		+ "Quantidade de bandas sendo gerenciadas:"+fachada.checarQuantidadeBanda()+"\n"
		   		+ "Nome da Banda sendo gerenciada atualmente:"+fachada.checarNomeBanda(gerente)+"\n"
		   		);
		int operacao = scanner.nextInt();
		switch(operacao){
		case 1: 
			telacadastro.cadastroBanda();
			break;
		case 2:  
			telabanda.detalhesBanda(gerente);
			break;
		case 3:
			telaloja.iniciar(gerente);
			break;
		case 4:
			//telashow.iniciar();
			break;
		case 5:
			telabanda.excluirBanda(gerente,fachada.getBandas());
			break;
		case 6:
			telabanda.trocaBanda(gerente,fachada.getBandas());
			break;
		case 7: 
			System.out.println("Você realmente deseja encerrar o programa? [s / n]");
		    String resposta = scanner.next();
		    if (resposta.equalsIgnoreCase("s")) {
		        sair = true;
		    } else if (resposta.equalsIgnoreCase("n")) {
		        sair = false;
		    } else {
		        System.out.println("Opção inválida! Continuando o programa.");
		    }
		    break;
		default: 
			System.out.println("Opção inválida!");
		}
		}
	 System.out.println("Programa finalizado com sucesso "+fachada.consultarNomeGerente(gerente)+".");
	}
}
