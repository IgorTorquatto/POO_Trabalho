package br.edu.ufca.Excecoes;

public class musicoInexistenteException extends Exception {
	public musicoInexistenteException() {
		super("Musico não encontrado!");
	}

}
