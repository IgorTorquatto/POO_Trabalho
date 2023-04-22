package br.edu.ufca.teste;

import java.util.ArrayList;
import java.util.Random;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Loja {
	//Musicos lensários (90)
	String[] tecladistas_lendarios = {"Rick Wakeman","Jon Lord","Keith Emerson"};
	String[] guitarristas_lendarios = {"Jimmy Hendrix","Duane Allman"," B. B. King"};
	String[] baterista_lendarios = {"John Bonham","Keith Moon","Ginger Baker"};
	
	public static void imprimirSaldo(Gerente gerente) {
		System.out.println("Seu saldo é de: "+gerente.getDinheiro()+"\n");
	}
	
	public static void comprarVocalista(Gerente gerente, int dinheiro) {
		//Repositórios de vocalistas:
		
		RepositorioMusicos vocalistas_lendarios = new RepositorioMusicos();
		vocalistas_lendarios.setVocalistas(Funcionalidades.VocalistasLendarios());
		RepositorioMusicos vocalistas_bons = new RepositorioMusicos();
		vocalistas_bons.setVocalistas(Funcionalidades.VocalistasBons());
		RepositorioMusicos vocalistas_medios = new RepositorioMusicos();
		vocalistas_medios.setVocalistas(Funcionalidades.VocalistasMedios());
		
		System.out.println("Vocalistas disponíveis: ");
		int compra;
		
		//Imprimir nome + preço
		vocalistas_lendarios.imprimirVocalistas();
	}
	
}
