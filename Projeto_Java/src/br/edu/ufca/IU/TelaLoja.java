package br.edu.ufca.IU;

import java.text.DecimalFormat;
import java.util.Scanner;


import br.edu.ufca.Negocio.*;

public class TelaLoja {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaLoja(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}

	
	public void iniciar(Gerente gerente) {
		
		System.out.println("Loja: ");
		
		boolean sair_loja = false;
		int escolha;
		DecimalFormat dp = new DecimalFormat("#.000");
		
		while(sair_loja == false) {
			
			   System.out.println(
					  "1- Verificar saldo\n"
			   		+ "2- Comprar novo músico\n"
			   		+ "3- Sair da loja\n");
			   
			   escolha = scanner.nextInt();
			   
			   if(escolha==1) System.out.println("Saldo " +dp.format(fachada.checarSaldoGerente())+" R$.");   
			   
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
					   fachada.comprarVocalistaGerente(gerente);
					   break;
				   case 2:
					   fachada.comprarTecladistaGerente(gerente);
					   break;
				   case 3:
					   fachada.comprarGuitarristaGerente(gerente);
					   break;
				   case 4:
					   fachada.comprarBateristaGerente(gerente);
					   break;
				   case 5:
					   fachada.comprarBaixistaGerente(gerente);
					   break;
					
					default:
						System.out.println("Opção inválida! ");
				   }
			   }
			   if(escolha==3) sair_loja= true;
		   }
		  
	}

}
