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
		//Repositórios de vocalistas:
		
		RepositorioMusicos vocalistas_lendarios = new RepositorioMusicos();
		vocalistas_lendarios.setVocalistas(Funcionalidades.VocalistasLendarios());
		RepositorioMusicos vocalistas_bons = new RepositorioMusicos();
		vocalistas_bons.setVocalistas(Funcionalidades.VocalistasBons());
		RepositorioMusicos vocalistas_medios = new RepositorioMusicos();
		vocalistas_medios.setVocalistas(Funcionalidades.VocalistasMedios());
		
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
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getVocalistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_lendarios.getVocalistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_lendarios.getVocalistas().get(0));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getVocalistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getVocalistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_lendarios.getVocalistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_lendarios.getVocalistas().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getVocalistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_lendarios.getVocalistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_lendarios.getVocalistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_lendarios.getVocalistas().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_lendarios.getVocalistas().get(2).getNome());
					
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
				
				if(gerente.getDinheiro() > vocalistas_bons.getVocalistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_bons.getVocalistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_bons.getVocalistas().get(0));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getVocalistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_bons.getVocalistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_bons.getVocalistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_bons.getVocalistas().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getVocalistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_bons.getVocalistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_bons.getVocalistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_bons.getVocalistas().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_bons.getVocalistas().get(2).getNome());
					
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
				
				if(gerente.getDinheiro() > vocalistas_medios.getVocalistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_medios.getVocalistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_medios.getVocalistas().get(0));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getVocalistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > vocalistas_medios.getVocalistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_medios.getVocalistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_medios.getVocalistas().get(1));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getVocalistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > vocalistas_medios.getVocalistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_vocalista = vocalistas_medios.getVocalistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_vocalista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setVocalista(vocalistas_medios.getVocalistas().get(2));
					System.out.println("Parabéns,você comprou "+vocalistas_medios.getVocalistas().get(2).getNome());
					
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
		tecladistas_lendarios.setTecladistas(Funcionalidades.TecladistasLendarios());
		RepositorioMusicos tecladistas_bons = new RepositorioMusicos();
		tecladistas_bons.setTecladistas(Funcionalidades.TecladistasBons());
		RepositorioMusicos tecladistas_medios = new RepositorioMusicos();
		tecladistas_medios.setTecladistas(Funcionalidades.TecladistasMedios());
		
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
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getTecladistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_lendarios.getTecladistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_lendarios.getTecladistas().get(0));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getTecladistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getTecladistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladistas = tecladistas_lendarios.getTecladistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladistas;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_lendarios.getTecladistas().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getTecladistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_lendarios.getTecladistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_lendarios.getTecladistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_lendarios.getTecladistas().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_lendarios.getTecladistas().get(2).getNome());
					
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
				
				if(gerente.getDinheiro() > tecladistas_bons.getTecladistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_bons.getTecladistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_bons.getTecladistas().get(0));
					System.out.println("Parabéns,você comprou "+ tecladistas_bons.getTecladistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_bons.getTecladistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_bons.getTecladistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_bons.getTecladistas().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_bons.getTecladistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_bons.getTecladistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_bons.getTecladistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_bons.getTecladistas().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_bons.getTecladistas().get(2).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
		}
		
		
		else if(categoria == 3) {
			//Vocalistas médios
		
			tecladistas_medios.imprimirTecladistas();
			System.out.println("Qual tecladista você quer comprar? [1/2/3]");
			int posicao = input.nextInt();
			
			if(posicao == 1) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getTecladistas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getTecladistas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_medios.getTecladistas().get(0));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getTecladistas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getTecladistas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getTecladistas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_medios.getTecladistas().get(1));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getTecladistas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > tecladistas_medios.getTecladistas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_tecladista = tecladistas_medios.getTecladistas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_tecladista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setTecladista(tecladistas_medios.getTecladistas().get(2));
					System.out.println("Parabéns,você comprou "+tecladistas_medios.getTecladistas().get(2).getNome());
					
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
		guitarristas_lendarios.setGuitarristas(Funcionalidades.GuitarristasLendarios());
		RepositorioMusicos guitarristas_bons = new RepositorioMusicos();
		guitarristas_bons.setGuitarristas(Funcionalidades.GuitarristasBons());
		RepositorioMusicos guitarristas_medios = new RepositorioMusicos();
		guitarristas_medios.setGuitarristas(Funcionalidades.GuitarristasMedios());
		
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
				
				if(gerente.getDinheiro() > guitarristas_lendarios.getGuitarristas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_lendarios.getGuitarristas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_lendarios.getGuitarristas().get(0));
					System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getGuitarristas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > guitarristas_lendarios.getGuitarristas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_Guitarristas = guitarristas_lendarios.getGuitarristas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_Guitarristas;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_lendarios.getGuitarristas().get(1));
					System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getGuitarristas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > guitarristas_lendarios.getGuitarristas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_lendarios.getGuitarristas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_lendarios.getGuitarristas().get(2));
					System.out.println("Parabéns,você comprou "+guitarristas_lendarios.getGuitarristas().get(2).getNome());
					
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
				
				if(gerente.getDinheiro() > guitarristas_bons.getGuitarristas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_bons.getGuitarristas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_bons.getGuitarristas().get(0));
					System.out.println("Parabéns,você comprou "+ guitarristas_bons.getGuitarristas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > guitarristas_bons.getGuitarristas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_bons.getGuitarristas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_bons.getGuitarristas().get(1));
					System.out.println("Parabéns,você comprou "+guitarristas_bons.getGuitarristas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > guitarristas_bons.getGuitarristas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_bons.getGuitarristas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_bons.getGuitarristas().get(2));
					System.out.println("Parabéns,você comprou "+guitarristas_bons.getGuitarristas().get(2).getNome());
					
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
				
				if(gerente.getDinheiro() > guitarristas_medios.getGuitarristas().get(0).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_medios.getGuitarristas().get(0).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_medios.getGuitarristas().get(0));
					System.out.println("Parabéns,você comprou "+guitarristas_medios.getGuitarristas().get(0).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
				
			}
			
			if(posicao == 2) {
				
				if(gerente.getDinheiro() > guitarristas_medios.getGuitarristas().get(1).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_medios.getGuitarristas().get(1).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_medios.getGuitarristas().get(1));
					System.out.println("Parabéns,você comprou "+guitarristas_medios.getGuitarristas().get(1).getNome());
					
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			
			if(posicao == 3) {
				
				if(gerente.getDinheiro() > guitarristas_medios.getGuitarristas().get(2).getPreco()) {
					
					int dinheiro_gerente = gerente.getDinheiro();
					int preco_guitarrista = guitarristas_medios.getGuitarristas().get(2).getPreco();
					int novo_saldo = dinheiro_gerente - preco_guitarrista;
					
					gerente.setDinheiro(novo_saldo);
					gerente.getBanda().setGuitarrista(guitarristas_medios.getGuitarristas().get(2));
					System.out.println("Parabéns,você comprou "+guitarristas_medios.getGuitarristas().get(2).getNome());
					
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
	baixistas_lendarios.setBaixistas(Funcionalidades.BaixistasLendarios());
	RepositorioMusicos baixistas_bons = new RepositorioMusicos();
	baixistas_bons.setBaixistas(Funcionalidades.BaixistasBons());
	RepositorioMusicos baixistas_medios = new RepositorioMusicos();
	baixistas_medios.setBaixistas(Funcionalidades.BaixistasMedios());
	
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
			
			if(gerente.getDinheiro() > baixistas_lendarios.getBaixistas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_lendarios.getBaixistas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_lendarios.getBaixistas().get(0));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getBaixistas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_lendarios.getBaixistas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_lendarios.getBaixistas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_lendarios.getBaixistas().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getBaixistas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_lendarios.getBaixistas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_lendarios.getBaixistas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_lendarios.getBaixistas().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_lendarios.getBaixistas().get(2).getNome());
				
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
			
			if(gerente.getDinheiro() > baixistas_bons.getBaixistas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_bons.getBaixistas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_bons.getBaixistas().get(0));
				System.out.println("Parabéns,você comprou "+ baixistas_bons.getBaixistas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_bons.getBaixistas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_bons.getBaixistas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_bons.getBaixistas().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_bons.getBaixistas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_bons.getBaixistas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_bons.getBaixistas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_bons.getBaixistas().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_bons.getBaixistas().get(2).getNome());
				
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
			
			if(gerente.getDinheiro() > baixistas_medios.getBaixistas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_medios.getBaixistas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_medios.getBaixistas().get(0));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getBaixistas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > baixistas_medios.getBaixistas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_medios.getBaixistas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_medios.getBaixistas().get(1));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getBaixistas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > baixistas_medios.getBaixistas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baixista = baixistas_medios.getBaixistas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baixista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaixista(baixistas_medios.getBaixistas().get(2));
				System.out.println("Parabéns,você comprou "+baixistas_medios.getBaixistas().get(2).getNome());
				
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
	bateristas_lendarios.setBateristas(Funcionalidades.BateristasLendarios());
	RepositorioMusicos bateristas_bons = new RepositorioMusicos();
	bateristas_bons.setBateristas(Funcionalidades.BateristasBons());
	RepositorioMusicos bateristas_medios = new RepositorioMusicos();
	bateristas_medios.setBateristas(Funcionalidades.BateristasMedios());
	
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
			
			if(gerente.getDinheiro() > bateristas_lendarios.getBateristas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_lendarios.getBateristas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_lendarios.getBateristas().get(0));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getBateristas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_lendarios.getBateristas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_bateristas = bateristas_lendarios.getBateristas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_bateristas;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_lendarios.getBateristas().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getBateristas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_lendarios.getBateristas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_lendarios.getBateristas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_lendarios.getBateristas().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_lendarios.getBateristas().get(2).getNome());
				
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
			
			if(gerente.getDinheiro() > bateristas_bons.getBateristas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_bons.getBateristas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_bons.getBateristas().get(0));
				System.out.println("Parabéns,você comprou "+ bateristas_bons.getBateristas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_bons.getBateristas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_bons.getBateristas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_bons.getBateristas().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_bons.getBateristas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_bons.getBateristas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_bons.getBateristas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_bons.getBateristas().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_bons.getBateristas().get(2).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		bateristas_medios.imprimirBateristas();
		System.out.println("Qual baterista você quer comprar? [1/2/3]");
		int posicao = input.nextInt();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() > bateristas_medios.getBateristas().get(0).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_medios.getBateristas().get(0).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_medios.getBateristas().get(0));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getBateristas().get(0).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() > bateristas_medios.getBateristas().get(1).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_medios.getBateristas().get(1).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_medios.getBateristas().get(1));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getBateristas().get(1).getNome());
				
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() > bateristas_medios.getBateristas().get(2).getPreco()) {
				
				int dinheiro_gerente = gerente.getDinheiro();
				int preco_baterista = bateristas_medios.getBateristas().get(2).getPreco();
				int novo_saldo = dinheiro_gerente - preco_baterista;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setBaterista(bateristas_medios.getBateristas().get(2));
				System.out.println("Parabéns,você comprou "+bateristas_medios.getBateristas().get(2).getNome());
				
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
