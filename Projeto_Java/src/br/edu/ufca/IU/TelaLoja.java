package br.edu.ufca.IU;

import java.util.Scanner;

import br.edu.ufca.Negocio.*;

public class TelaLoja {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaLoja(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}
}
