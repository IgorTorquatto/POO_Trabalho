package br.edu.ufca.Excecoes;

public class gerenteInexistenteException extends Exception{
	public gerenteInexistenteException() {
		super("Gerente não encontrado!");
	}
}
