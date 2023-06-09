package br.edu.ufca.Excecoes;

public class gerenteException extends Exception{
	public gerenteException() {
		super("Nome, dinheiro e banda são essenciais para criação do gerente!");
	}
}
