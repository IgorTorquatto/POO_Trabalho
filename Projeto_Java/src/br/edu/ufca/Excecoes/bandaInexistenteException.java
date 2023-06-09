package br.edu.ufca.Excecoes;

public class bandaInexistenteException extends Exception{
	public bandaInexistenteException(){
		super("Banda não encontrada!");
	}
}
