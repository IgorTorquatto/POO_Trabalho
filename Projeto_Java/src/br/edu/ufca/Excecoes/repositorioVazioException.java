package br.edu.ufca.Excecoes;

public class repositorioVazioException extends Exception{
	public repositorioVazioException() {
		super("Repositório não contém nenhum dado!");
	}	
}
	