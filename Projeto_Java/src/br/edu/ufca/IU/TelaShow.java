package br.edu.ufca.IU;

import java.util.Scanner;

import br.edu.ufca.Excecoes.gerenteInexistenteException;
import br.edu.ufca.Negocio.*;

public class TelaShow {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaShow(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}
	
	
	public void iniciar(Gerente gerente) {
		try {
			fachada.realizarShow(gerente);
		} catch (gerenteInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fachada.pagarDespesas(gerente);
		} catch (gerenteInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
