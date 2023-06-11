package br.edu.ufca.IU;

import br.edu.ufca.Negocio.*;

public class Main {
	
	public static void main(String[] args) {
		Fachada fachada = new Fachada();
		TelaPrincipal tela = new TelaPrincipal(fachada);
		tela.iniciar();
	}
	
}
