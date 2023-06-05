package br.edu.ufca.IU;

import java.util.Scanner;

import br.edu.ufca.Negocio.*;

public class TelaShow {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaShow(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}
	
	
	public void iniciar(Gerente gerente) {
		fachada.realizarShow(gerente);
		fachada.pagarDespesas(gerente);
	}



}
