package br.edu.ufca.IU;

import java.text.DecimalFormat;
import java.util.Scanner;

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

	public void trocaBanda(Gerente gerente, Fachada fachada) {
		
		int indice;
		
		if(fachada.checarQuantidadeBanda() == 1 ) {
			System.out.println("Você possui apenas uma banda cadastrada. Procedimento inválido.");
			return;
		}
		
		else if (fachada.checarQuantidadeBanda() > 1){
			System.out.println("Selecione o número da banda que você quer gerenciar agora :  [1/2/3/4/...]");
			indice = scanner.nextInt();
			
			if(indice > 0 && indice <= fachada.checarQuantidadeBanda()) {
				//gerente.setBanda(bandas.getBandas().get(indice - 1));
				fachada.getBandas().atualizaBanda(null, null);
				
			}
			else {
				System.out.println("Opção inválida!");
				indice = 0;
			}
			
		}
	}
	
	
}
