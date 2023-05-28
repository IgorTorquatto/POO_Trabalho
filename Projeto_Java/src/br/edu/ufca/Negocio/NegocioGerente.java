package br.edu.ufca.Negocio;

import br.edu.ufca.Dados.IRepositorio;

public class NegocioGerente {
	/*
	 Regras de négocio para manipulação do gerente
	 Envia exceções para a interface com o usuário
	*/
	
	private Gerente gerente;
	
	public NegocioGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public double saldo() {
		if(gerente != null) {
			return gerente.getDinheiro();
		}else {
			//exceção
			return 0;
		}
	}
	
	public void adicionaGerente(String nome,double dinheiro,Banda banda) {
		if(nome != null && dinheiro!= 0 && banda != null) {
			gerente.setNome(nome);
			gerente.setDinheiro(dinheiro);
			gerente.setBanda(banda);
		}else {
			//exceção

		}
		
	}

}
