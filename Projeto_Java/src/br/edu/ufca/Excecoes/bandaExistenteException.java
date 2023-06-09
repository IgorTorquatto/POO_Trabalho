package br.edu.ufca.Excecoes;

import br.edu.ufca.Negocio.Banda;

public class bandaExistenteException extends Exception{
	public bandaExistenteException(Banda banda) {
		super("Banda existente!\nBanda encontrada: "+banda.getNome());
	}
}
