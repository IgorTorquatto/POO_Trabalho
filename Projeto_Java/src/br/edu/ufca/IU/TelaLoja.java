package br.edu.ufca.IU;

import java.util.Scanner;

import br.edu.ufca.Negocio.*;

public class TelaLoja {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaLoja(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}

	
	public void iniciar() {
		
		System.out.println("Loja: ");
		
		boolean sair_loja = false;
		int escolha;
		
		while(sair_loja == false) {
			
			   System.out.println(
					  "1- Verificar saldo\n"
			   		+ "2- Comprar novo músico\n"
			   		+ "3- Sair da loja\n");
			   
			   escolha = scanner.nextInt();
			   
			   if(escolha==1) Loja.imprimirSaldo(gerente);
			   
			   if(escolha==2) {
				   System.out.println("Qual integrante você deseja comprar? ");
				   System.out.println(
						   "1-Vocalista\n"
						   + "2-Tecladista\n"
						   + "3-Guitarrista\n"
						   + "4-Baterista\n"
						   + "5-Baixista\n");
				   
				   int escolh = scanner.nextInt();
				   
				   switch(escolh) {
				   
				   case 1:
					   Loja.comprarVocalista(gerente);
					   break;
				   case 2:
					   Loja.comprarTecladista(gerente);
					   break;
				   case 3:
					  Loja.comprarGuitarrista(gerente);
					   break;
				   case 4:
					   Loja.comprarBaterista(gerente);
					   break;
				   case 5:
					   Loja.comprarBaixista(gerente);
					   break;
					
					default:
						System.out.println("Opção inválida! ");
				   }
			   }
			   if(escolha==3) sair_loja= true;
		   }
		  
	}

}
