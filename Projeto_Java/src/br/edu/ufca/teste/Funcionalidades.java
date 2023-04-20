package br.edu.ufca.teste;

import java.util.Random;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Funcionalidades {
	//Aqui cabe usar interface futuramente
	public static Banda gerarBanda() {

		Random random = new Random();
		
		Vocalista vocalista = new Vocalista("Vocalista",random.nextInt(30),10);
		Baixista baixista = new Baixista("Baixista",random.nextInt(30),10);
		Baterista baterista = new Baterista("Baterista",random.nextInt(30),10);
		Tecladista tecladista = new Tecladista("Tecladista",random.nextInt(30),10);
		Guitarrista guitarrista = new Guitarrista("Guitarrista",random.nextInt(30),10);
		
		Banda banda = new Banda(baixista ,baterista , guitarrista, tecladista, vocalista);
		return banda;
	}
}
