package br.edu.ufca.teste;

import java.util.Random;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Loja {
	//Musicos lensários (90)
	String[] vocalistas_lendarios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	String[] tecladistas_lendarios = {"Rick Wakeman","Jon Lord","Keith Emerson"};
	String[] guitarristas_lendarios = {"Jimmy Hendrix","Duane Allman"," B. B. King"};
	String[] baterista_lendarios = {"John Bonham","Keith Moon","Ginger Baker"};
	
	public static void imprimirSaldo(Gerente gerente) {
		System.out.println("Seu saldo é de: "+gerente.getDinheiro()+"\n");
	}
	
	public static void comprarMusico() {
		
	}
}
