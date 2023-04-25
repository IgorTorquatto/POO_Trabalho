package br.edu.ufca.teste;

import java.awt.font.TextLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Loja {
	
	
	public static void imprimirSaldo(Gerente gerente) {
		System.out.println("Seu saldo é de: "+gerente.getDinheiro()+" R$\n");
	}
	
	public static void comprarVocalista(Gerente gerente) {
		
		RepositorioMusicos vocalistas_lendarios = new RepositorioMusicos();
		RepositorioMusicos vocalistas_bons = new RepositorioMusicos();
		RepositorioMusicos vocalistas_medios = new RepositorioMusicos();
		
		String[] nomes_lendarios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		String[] nomes_bons = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		String[] nomes_medios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		
		Random random = new Random();
		
		for(int i = 0 ; i < 3 ; i++) {
			vocalistas_lendarios.adicionaMusico(new Vocalista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			vocalistas_bons.adicionaMusico(new Vocalista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			vocalistas_medios.adicionaMusico(new Vocalista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
		}
		
		System.out.println("Selecione a categoria de vocalistas: ");
		System.out.println("1-Lendários\n2-Bons\n3-Médios");
		Scanner input = new Scanner(System.in);
		int categoria = input.nextInt();
		
		if(categoria == 1) {
			//Vocalistas Lendários:
	
			vocalistas_lendarios.imprimirVocalistas();
			System.out.println("Qual vocalista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_lendarios.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
	
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)(vocalistas_lendarios.getMusicos().get(0)));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_lendarios.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_lendarios.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_lendarios.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_lendarios.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
		}
		
		
		
		else if(categoria == 2) {
			//Vocalistas bons
			
			vocalistas_bons.imprimirVocalistas();
			System.out.println("Qual vocalista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > vocalistas_bons.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_bons.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(0));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_bons.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_bons.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_bons.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_bons.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
		}
		
		
		else if(categoria == 3) {
			//Vocalistas médios
		
			vocalistas_medios.imprimirVocalistas();
			System.out.println("Qual vocalista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > vocalistas_medios.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_medios.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(0));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_medios.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_medios.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_medios.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco = vocalistas_medios.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
		}
		
		else {
			System.out.println("Opção inválida!");
		}
	}
			
public static void comprarTecladista(Gerente gerente) {
		
		RepositorioMusicos tecladistas_lendarios = new RepositorioMusicos();
		RepositorioMusicos tecladistas_bons = new RepositorioMusicos();
		RepositorioMusicos tecladistas_medios = new RepositorioMusicos();
		
		String[] nomes_lendarios = {"Rick Wakeman","Jon Lord","Keith Emerson"};
		String[] nomes_bons = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		String[] nomes_medios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		
		Random random = new Random();
		
		for(int i = 0 ; i < 3 ; i++) {
			tecladistas_lendarios.adicionaMusico(new Tecladista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			tecladistas_bons.adicionaMusico(new Tecladista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			tecladistas_medios.adicionaMusico(new Tecladista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
		}
		
		System.out.println("Selecione a categoria de tecladistas: ");
		System.out.println("1-Lendários\n2-Bons\n3-Médios");
		Scanner input = new Scanner(System.in);
		int categoria = input.nextInt();
		
		if(categoria == 1) {
			//Vocalistas Lendários:
	
			tecladistas_lendarios.imprimirTecladistas();
			System.out.println("Qual tecladista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_lendarios.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
	
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)(tecladistas_lendarios.getMusicos().get(0)));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_lendarios.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_lendarios.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_lendarios.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_lendarios.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
		}
		
		
		
		else if(categoria == 2) {
			//Vocalistas bons
			
			tecladistas_bons.imprimirTecladistas();
			System.out.println("Qual tecladista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > tecladistas_bons.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int  preco_tecladista = tecladistas_bons.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(0));
					System.out.println("Parabéns,você comprou "+tecladistas_bons.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_bons.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_bons.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_bons.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_bons.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_bons.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_bons.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
		}
		
		
		else if(categoria == 3) {
			//Vocalistas médios
		
			tecladistas_medios.imprimirTecladistas();
			System.out.println("Qual vocalista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getMusicos().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getMusicos().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(0));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getMusicos().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getMusicos().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getMusicos().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getMusicos().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getMusicos().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getMusicos().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getMusicos().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
		}
		
		else {
			System.out.println("Opção inválida!");
		}
	}	

public static void comprarGuitarrista(Gerente gerente) {
	
	RepositorioMusicos guitarristas_lendarios = new RepositorioMusicos();
	RepositorioMusicos guitarristas_bons = new RepositorioMusicos();
	RepositorioMusicos guitarristas_medios = new RepositorioMusicos();
	
	String[] nomes_lendarios = {"Jimmy Hendrix","Duane Allman"," B. B. King"};
	String[] nomes_bons = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	String[] nomes_medios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	
	Random random = new Random();
	
	for(int i = 0 ; i < 3 ; i++) {
		guitarristas_lendarios.adicionaMusico(new Guitarrista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		guitarristas_bons.adicionaMusico(new Guitarrista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		guitarristas_medios.adicionaMusico(new Guitarrista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
	}
	
	System.out.println("Selecione a categoria de guitarristas: ");
	System.out.println("1-Lendários\n2-Bons\n3-Médios");
	Scanner input = new Scanner(System.in);
	int categoria = input.nextInt();
	
	if(categoria == 1) {
		//Vocalistas Lendários:

		guitarristas_lendarios.imprimirGuitarristas();
		System.out.println("Qual guitarrista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > guitarristas_lendarios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_lendarios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;

				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)(guitarristas_lendarios.getMusicos().get(0)));
				System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > guitarristas_lendarios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_lendarios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_lendarios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > guitarristas_lendarios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_lendarios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_lendarios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	
	
	else if(categoria == 2) {
		//Vocalistas bons
		
		guitarristas_bons.imprimirGuitarristas();
		System.out.println("Qual guitarrista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > guitarristas_bons.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int  preco_tecladista = guitarristas_bons.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+guitarristas_bons.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > guitarristas_bons.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_bons.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+guitarristas_bons.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > guitarristas_bons.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_bons.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+guitarristas_bons.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		guitarristas_medios.imprimirGuitarristas();
		System.out.println("Qual guitarrista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > guitarristas_medios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_medios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+guitarristas_medios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > guitarristas_medios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_medios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+guitarristas_medios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > guitarristas_medios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = guitarristas_medios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+guitarristas_medios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	else {
		System.out.println("Opção inválida!");
	}
}	

public static void comprarBaixista(Gerente gerente) {
	
	RepositorioMusicos baixistas_lendarios = new RepositorioMusicos();
	RepositorioMusicos baixistas_bons = new RepositorioMusicos();
	RepositorioMusicos baixistas_medios = new RepositorioMusicos();
	
	String[] nomes_lendarios = {"James Jamerson","Charles Mingus","John Entwistle"};
	String[] nomes_bons = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	String[] nomes_medios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	
	Random random = new Random();
	
	for(int i = 0 ; i < 3 ; i++) {
		baixistas_lendarios.adicionaMusico(new Baixista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		baixistas_bons.adicionaMusico(new Baixista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		baixistas_medios.adicionaMusico(new Baixista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
	}
	
	System.out.println("Selecione a categoria de baixistas: ");
	System.out.println("1-Lendários\n2-Bons\n3-Médios");
	Scanner input = new Scanner(System.in);
	int categoria = input.nextInt();
	
	if(categoria == 1) {
		//Vocalistas Lendários:

		baixistas_lendarios.imprimirBaixistas();
		System.out.println("Qual baixista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > baixistas_lendarios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_lendarios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;

				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)(baixistas_lendarios.getMusicos().get(0)));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_lendarios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_lendarios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_lendarios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_lendarios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_lendarios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_lendarios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	
	
	else if(categoria == 2) {
		//Vocalistas bons
		
		baixistas_bons.imprimirBaixistas();
		System.out.println("Qual baixista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > baixistas_bons.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int  preco_tecladista = baixistas_bons.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+baixistas_bons.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_bons.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_bons.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_bons.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_bons.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_bons.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_bons.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		baixistas_medios.imprimirBaixistas();
		System.out.println("Qual baixista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > baixistas_medios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_medios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_medios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_medios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_medios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = baixistas_medios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	else {
		System.out.println("Opção inválida!");
	}
}

public static void comprarBaterista(Gerente gerente) {
	
	RepositorioMusicos bateristas_lendarios = new RepositorioMusicos();
	RepositorioMusicos bateristas_bons = new RepositorioMusicos();
	RepositorioMusicos bateristas_medios = new RepositorioMusicos();
	
	String[] nomes_lendarios = {"John Bonham","Keith Moon","Ginger Baker"};
	String[] nomes_bons = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	String[] nomes_medios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	
	Random random = new Random();
	
	for(int i = 0 ; i < 3 ; i++) {
		bateristas_lendarios.adicionaMusico(new Baterista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		bateristas_bons.adicionaMusico(new Baterista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		bateristas_medios.adicionaMusico(new Baterista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
	}
	
	System.out.println("Selecione a categoria de bateristas: ");
	System.out.println("1-Lendários\n2-Bons\n3-Médios");
	Scanner input = new Scanner(System.in);
	int categoria = input.nextInt();
	
	if(categoria == 1) {
		//Vocalistas Lendários:

		bateristas_lendarios.imprimirBateristas();
		System.out.println("Qual baterista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > bateristas_lendarios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_lendarios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;

				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)(bateristas_lendarios.getMusicos().get(0)));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_lendarios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_lendarios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_lendarios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_lendarios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_lendarios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_lendarios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	
	
	else if(categoria == 2) {
		//Vocalistas bons
		
		bateristas_bons.imprimirBateristas();
		System.out.println("Qual baterista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > bateristas_bons.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int  preco_tecladista = bateristas_bons.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+bateristas_bons.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_bons.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_bons.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_bons.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_bons.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_bons.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_bons.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		bateristas_medios.imprimirBateristas();
		System.out.println("Qual baixista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > bateristas_medios.getMusicos().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_medios.getMusicos().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(0));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getMusicos().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_medios.getMusicos().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_medios.getMusicos().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getMusicos().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_medios.getMusicos().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_tecladista = bateristas_medios.getMusicos().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_tecladista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getMusicos().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	else {
		System.out.println("Opção inválida!");
	}
}

}
