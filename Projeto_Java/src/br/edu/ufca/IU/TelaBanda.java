package br.edu.ufca.IU;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.edu.ufca.Excecoes.repositorioVazioException;
import br.edu.ufca.Negocio.*;

public class TelaBanda {
	
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaBanda(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}
	
	public void detalhesBanda(Gerente gerente) {
		
		int i;
		boolean sair = false;
		
		while(sair == false) {
			
			System.out.println("Detalhes da Banda: ");
			System.out.println("\nBanda: "+fachada.checarNomeBanda(gerente));
			System.out.println("Integrantes da banda: \n");
			
			String[] nome_integrantes = fachada.checarDetalhesBanda(gerente);
			for(i=0;i<5;i++) {
				   System.out.println(nome_integrantes[i]);
			 }
			
			System.out.println("Para retornar ao menu principal digite V. ");
	        String opcao = scanner.next();
	        if (opcao.equalsIgnoreCase("v")) {
	            sair = true;
	        }
			
		}
		
	
	}
	
	public void trocaBanda(Gerente gerente, NegocioBanda bandas) {

	    if (fachada.checarQuantidadeBanda() == 1) {
	        System.out.println("Você possui apenas uma banda cadastrada. Procedimento inválido.");
	        return;
	    } else {
	        int escolha;
	        boolean escolhaValida = false;

	        System.out.println("Selecione o índice da banda que você deseja gerenciar:");
	        System.out.println("Quantidade de bandas (" + fachada.checarQuantidadeBanda() + ")");

	        while (!escolhaValida) {
	            for (int i = 0; i < fachada.checarQuantidadeBanda(); i++) {
	                System.out.println(i + ")" + fachada.consultarNomeBanda(i));
	            }

	            escolha = scanner.nextInt();

	            if (escolha >= 0 && escolha < fachada.checarQuantidadeBanda()) {
	                escolhaValida = true;
	                fachada.trocarBanda(gerente, bandas, escolha);
	            } else {
	                System.out.println("Escolha inválida. Digite um índice existente.");
	            }
	        }
	    }
	}

	public void excluirBanda(Gerente gerente, NegocioBanda bandas) {
		if (fachada.checarQuantidadeBanda() == 1) {
	        System.out.println("Para continuar com o sistema de gerenciamento de bandas você não pode excluir sua única banda.");
	        return;
	    } else {
	    	
	    	int escolha;
	        boolean escolhaValida = false;

	        System.out.println("Selecione o índice da banda que você deseja excluir:");
	        System.out.println("Quantidade de bandas (" + fachada.checarQuantidadeBanda() + ")");

	        while (!escolhaValida) {
	            for (int i = 0; i < fachada.checarQuantidadeBanda(); i++) {
	                System.out.println(i + ")" + fachada.consultarNomeBanda(i));
	            }

	            escolha = scanner.nextInt();

	            if (escolha >= 0 && escolha < fachada.checarQuantidadeBanda()) {
	                escolhaValida = true;
	                //remover a banda pelo indice
	                fachada.excluirBanda(gerente, bandas, escolha);
	                //setar primeira banda da lista para o gerente
	                fachada.setarPrimeiraBanda(gerente, bandas);
	            } else {
	                System.out.println("Escolha inválida. Digite um índice existente.");
	            }
	        
	        }
	    	
	    }
		
	}


}
