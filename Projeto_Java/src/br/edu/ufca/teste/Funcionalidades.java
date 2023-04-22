package br.edu.ufca.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Funcionalidades {
	
	//Tipos de Vocalistas:	
	
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
	
	//Tipos de Tecladistas;
	
	public static ArrayList<Tecladista> TecladistasLendarios() {
		Random random  = new Random();
		ArrayList<Tecladista> tecladistas_lendarios = new ArrayList<>();
		String[] nomes = {"Rick Wakeman","Jon Lord","Keith Emerson"};
		
		for(int i=0;i < 3 ; i++) {
			tecladistas_lendarios.add(new Tecladista(nomes[i],random.nextInt(99-90)+90, 5000));
		}
		return tecladistas_lendarios;
	}
	
	public static ArrayList<Tecladista> TecladistasBons() {
		Random random  = new Random();
		ArrayList<Tecladista> tecladistas_bons = new ArrayList<>();
		String[] nomes = {"tecladista","tecladista","tecladista"};
		
		for(int i=0;i < 3 ; i++) {
			tecladistas_bons.add(new Tecladista(nomes[i],random.nextInt(89-80)+80, 3000));
		}
		return tecladistas_bons;
	}
	
	public static ArrayList<Tecladista> TecladistasMedios() {
		Random random  = new Random();
		ArrayList<Tecladista> tecladistas_medios = new ArrayList<>();
		String[] nomes = {"tecladista","tecladista","tecladista"};
		
		for(int i=0;i < 3 ; i++) {
			tecladistas_medios.add(new Tecladista(nomes[i],random.nextInt(79-70)+70, 2000));
		}
		return tecladistas_medios;
	}
	
	//Tipos de Guitarrita
	
	public static ArrayList<Guitarrista> GuitarristasLendarios() {
		Random random  = new Random();
		ArrayList<Guitarrista> guitarristas_lendarios = new ArrayList<>();
		String[] nomes = {"Jimmy Hendrix","Duane Allman"," B. B. King"};
		
		for(int i=0;i < 3 ; i++) {
			guitarristas_lendarios.add(new Guitarrista(nomes[i],random.nextInt(99-90)+90, 5000));
		}
		return guitarristas_lendarios;
	}
	
	public static ArrayList<Guitarrista> GuitarristasBons() {
		Random random  = new Random();
		ArrayList<Guitarrista> guitarristas_bons = new ArrayList<>();
		String[] nomes = {"guitarrista","guitarrista","guitarrista"};
		
		for(int i=0;i < 3 ; i++) {
			guitarristas_bons.add(new Guitarrista(nomes[i],random.nextInt(89-80)+80, 3000));
		}
		return guitarristas_bons;
	}
	
	public static ArrayList<Guitarrista> GuitarristasMedios() {
		Random random  = new Random();
		ArrayList<Guitarrista> guitarristas_medios = new ArrayList<>();
		String[] nomes = {"guitarrista","guitarrista","guitarrista"};
		
		for(int i=0;i < 3 ; i++) {
			guitarristas_medios.add(new Guitarrista(nomes[i],random.nextInt(79-70)+70, 2000));
		}
		return guitarristas_medios;
	}
	
	//Tipos de Bateristas:
	
	public static ArrayList<Baterista> BateristasLendarios() {
		Random random  = new Random();
		ArrayList<Baterista> bateristas_lendarios = new ArrayList<>();
		String[] nomes = {"John Bonham","Keith Moon","Ginger Baker"};
		
		for(int i=0;i < 3 ; i++) {
			bateristas_lendarios.add(new Baterista(nomes[i],random.nextInt(99-90)+90, 5000));
		}
		return bateristas_lendarios;
	}
	
	public static ArrayList<Baterista> BateristasBons() {
		Random random  = new Random();
		ArrayList<Baterista> bateristas_bons = new ArrayList<>();
		String[] nomes = {"baterista","baterista","baterista"};
		
		for(int i=0;i < 3 ; i++) {
			bateristas_bons.add(new Baterista(nomes[i],random.nextInt(89-80)+80, 3000));
		}
		return bateristas_bons;
	}
	
	public static ArrayList<Baterista> BateristasMedios() {
		Random random  = new Random();
		ArrayList<Baterista> baterista_medios = new ArrayList<>();
		String[] nomes = {"baterista","baterista","baterista"};
		
		for(int i=0;i < 3 ; i++) {
			baterista_medios.add(new Baterista(nomes[i],random.nextInt(79-70)+70, 2000));
		}
		return baterista_medios;
	}
	
	//Tipos de Baixistas
	
	public static ArrayList<Baixista> BaixistasLendarios() {
		Random random  = new Random();
		ArrayList<Baixista> baixistas_lendarios = new ArrayList<>();
		String[] nomes = {"James Jamerson","Charles Mingus","John Entwistle"};
		
		for(int i=0;i < 3 ; i++) {
			baixistas_lendarios.add(new Baixista(nomes[i],random.nextInt(99-90)+90, 5000));
		}
		return baixistas_lendarios;
	}
	
	public static ArrayList<Baixista> BaixistasBons() {
		Random random  = new Random();
		ArrayList<Baixista> baixistas_bons = new ArrayList<>();
		String[] nomes = {"baixista","baixista","baixista"};
		
		for(int i=0;i < 3 ; i++) {
			baixistas_bons.add(new Baixista(nomes[i],random.nextInt(89-80)+80, 3000));
		}
		return baixistas_bons;
	}
	
	public static ArrayList<Baixista> BaixistasMedios() {
		Random random  = new Random();
		ArrayList<Baixista> baixistas_medios = new ArrayList<>();
		String[] nomes = {"baixista","baixista","baixista"};
		
		for(int i=0;i < 3 ; i++) {
			baixistas_medios.add(new Baixista(nomes[i],random.nextInt(79-70)+70, 2000));
		}
		return baixistas_medios;
	}
}
