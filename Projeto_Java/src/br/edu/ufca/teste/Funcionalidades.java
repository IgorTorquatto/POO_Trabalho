package br.edu.ufca.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Funcionalidades {
	
	//Funcionalidades da loja
	
	public static ArrayList<Vocalista> VocalistasLendarios() {
		Random random  = new Random();
		ArrayList<Vocalista> vocalistas_lendarios = new ArrayList<>();
		String[] nomes = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
		
		for(int i=0;i < 3 ; i++) {
			vocalistas_lendarios.add(new Vocalista(nomes[i],random.nextInt(99-90)+90, 5000));
		}
		return vocalistas_lendarios;
	}
	
	public static ArrayList<Vocalista> VocalistasBons() {
		Random random  = new Random();
		ArrayList<Vocalista> vocalistas_bons = new ArrayList<>();
		String[] nomes = {"VocalistaBom1","VocalistaBom2","VocalistaBom3"};
		
		for(int i=0;i < 3 ; i++) {
			vocalistas_bons.add(new Vocalista(nomes[i],random.nextInt(89-80)+80, 3000));
		}
		return vocalistas_bons;
	}
	
	public static ArrayList<Vocalista> VocalistasMedios() {
		Random random  = new Random();
		ArrayList<Vocalista> vocalistas_medios = new ArrayList<>();
		String[] nomes = {"VocalistaMedio1","VocalistaMedio2","VocalistaMedio3"};
		
		for(int i=0;i < 3 ; i++) {
			vocalistas_medios.add(new Vocalista(nomes[i],random.nextInt(79-70)+70, 2000));
		}
		return vocalistas_medios;
	}
	
	
}
