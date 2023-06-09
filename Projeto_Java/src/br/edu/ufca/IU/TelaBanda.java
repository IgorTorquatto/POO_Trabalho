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

	public void trocaBanda(Fachada fachada2, Gerente gerente,NegocioBanda bandas) {
		
		int escolha;
		
		System.out.println("Selecione a banda que você deseja gerenciar:");
		try {
			System.out.println("Quantidade de bandas ("+fachada2.checarQuantidadeBanda()+")");
		} catch (repositorioVazioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			for(int i = 0; i < fachada2.checarQuantidadeBanda(); i++) {
				System.out.println(i+")"+fachada.consultarNomeBanda(i));
			}
		} catch (repositorioVazioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		escolha = scanner.nextInt();
		
		fachada.trocarBanda(gerente,bandas,escolha);
		
	}

}
