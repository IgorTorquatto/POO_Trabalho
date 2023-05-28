package br.edu.ufca.IU;

import java.util.Scanner;
import br.edu.ufca.Negocio.*;

public class TelaPrincipal {
	
	private Scanner scanner;
	private TelaLoja telaloja;
	private TelaShow telashow;
	private TelaCadastro telacadastro;
	
	public TelaPrincipal(Fachada fachada) {
		scanner = new Scanner(System.in);
		telaloja = new TelaLoja(fachada);
		telashow = new TelaShow(fachada);
		telacadastro = new TelaCadastro(fachada);
	}
	
	public void iniciar(){
		
	    boolean sair = false;
	    String nome;
	    
	    nome =telacadastro.cadastroIncial();
	    
	    System.out.println("Olá, " + nome + "!");
		
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
		   		+ "Quantidade de bandas sendo gerenciadas: ? \n"
		   		+ "Nome da Banda sendo gerenciada atualmente: ? \n"
		   		);
		String operacao = scanner.nextLine();
		switch(operacao){
		case 1: 
			telacadastro.cadastroBanda();
			break;
		case 2:  
			break;
		case 3:
			//telaloja.iniciar();
			break;
		case 4:
			//telashow.iniciar();
			break;
		case 5:
			break;
		case 6:
			break;
		case 7: 
			sair = true; 
			break;
		default: 
			System.out.println("Opção inválida!");
		}
		}
	 System.out.println("Programa finalizado com sucesso "+nome+".");
	}
}
