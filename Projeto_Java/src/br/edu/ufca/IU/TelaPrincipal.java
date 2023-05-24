package br.edu.ufca.IU;

import java.util.Scanner;
import br.edu.ufca.Negocio.*;

public class TelaPrincipal {
	
	private Scanner scanner;
	private TelaLoja telaloja;
	private TelaShow telashow;
	
	public TelaPrincipal(Fachada fachada) {
		scanner = new Scanner(System.in);
		telaloja = new TelaLoja(fachada);
		telashow = new TelaShow(fachada);
	}
}
