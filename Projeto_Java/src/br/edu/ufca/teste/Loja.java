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
}
