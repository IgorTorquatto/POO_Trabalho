package br.edu.ufca.Excecoes;

import br.edu.ufca.Negocio.MusicoAbstrato;

public class musicoExistenteException extends Exception {
	public musicoExistenteException(MusicoAbstrato musico) {
		super("Musico existente!\nMusico encontrado: "+musico.getNome());
	}
}
