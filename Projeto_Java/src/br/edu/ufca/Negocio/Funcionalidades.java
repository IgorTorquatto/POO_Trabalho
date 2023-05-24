package br.edu.ufca.Negocio;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

import br.edu.ufca.Dados.*;

public class Funcionalidades {
	
	public static Banda Novabanda() {
		
		int i;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastro: \n");
		ArrayList<String> nome_musicos_inicial = new ArrayList<String>();
		String[] musicos = {"vocalista","tecladista","guitarrista","baterista","baixista"};

		  for(i=0;i<5;i++) {
			  
			  String nome_musico= "";

			  while (nome_musico.isEmpty() || !nome_musico.matches("[a-zA-Z]+")) {
		          System.out.println("Insira o nome do "+musicos[i]+" que você quer contratar.");
		          nome_musico = scanner.nextLine();
		          nome_musicos_inicial.add(nome_musico);

		          if (!nome_musico.matches("[a-zA-Z]+")) {
		              System.out.println("Digite apenas letras.");
		          }
		      }
			
		  }
		
		  String nome_banda = "";
		  
		  while (nome_banda.isEmpty() || !nome_banda.matches("[a-zA-Z]+")) {
	          System.out.println("Digite o nome da banda: ");
	          nome_banda = scanner.nextLine();

	          if (!nome_banda.matches("[a-zA-Z]+")) {
	              System.out.println("Digite apenas letras.");
	          }
	      }
			
		  System.out.println("Banda criada com sucesso");
		  Banda banda = new Banda(null,null,null,null,null,null);
		  banda.gerarBanda(nome_musicos_inicial,nome_banda);
		  return banda;
	}
	
	public static void Loja(Gerente gerente) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Loja: ");
		
		boolean sair_loja = false;
		int escolha;
		
		while(sair_loja == false) {
			
			   System.out.println(
					  "1- Verificar saldo\n"
			   		+ "2- Comprar novo músico\n"
			   		+ "3- Sair da loja\n");
			   
			   escolha = input.nextInt();
			   
			   if(escolha==1) Loja.imprimirSaldo(gerente);
			   
			   if(escolha==2) {
				   System.out.println("Qual integrante você deseja comprar? ");
				   System.out.println(
						   "1-Vocalista\n"
						   + "2-Tecladista\n"
						   + "3-Guitarrista\n"
						   + "4-Baterista\n"
						   + "5-Baixista\n");
				   
				   int escolh = input.nextInt();
				   
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
