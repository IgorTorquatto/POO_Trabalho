package br.edu.ufca.Dados;
import java.util.ArrayList;

import br.edu.ufca.Negocio.*;

public class RepositorioBanda implements IRepositorio <Banda>{
	
	/*
	 Só deve conter código de acesso a dados
	*/
	
	ArrayList<Banda> bandas; 
	private int capacidadeMaxima = 1000;
	
	//Create
	public RepositorioBanda() {
		this.bandas = new ArrayList<Banda>();
	}

	//Read
	@Override
	public int consulta(Banda banda) {
		return bandas.indexOf(banda);
	}
		
	//Update
	@Override
	public void atualiza(Banda bandaExistente, Banda novaBanda) /*throws*/ {
	    int index = bandas.indexOf(bandaExistente);
        if (index != -1) {
            bandas.set(index, novaBanda);
        } else {
           // throw new ElementoNaoEncontradoException();
        } 
	}

	//Delete
	@Override
	public void remove(Banda banda) /*throws*/{
		boolean removido = bandas.remove(banda);
        if (!removido) {
           // throw new ElementoNaoEncontradoException();
        }
	}
	
	@Override
	public boolean existe(Banda banda) {
		int index = bandas.indexOf(banda);
		if(index != -1) {
			return true;
		}
		else {
			return false;
		}
	}

	public ArrayList<Banda> getBandas() {
		return bandas;
	}

	public void setBandas(ArrayList<Banda> bandas) {
		this.bandas = bandas;
	}
		
	//Outros métodos:
	
	@Override
	public void adiciona(Banda banda) /*throws RepositorioCheioException() */ {
	   if (bandas.size() < capacidadeMaxima) {
		   this.bandas.add(banda);
		 } else {
		       // throw new RepositorioCheioException();
	 }
	}
	
	@Override
	public int qtd() {
		int qtd = bandas.size();
		return qtd;
	}
	
	@Override
	public boolean vazio() {
		if(bandas.size() > 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public Banda geraBanda(ArrayList<String> nomes,String nome_banda) {
		Banda b = new Banda(null, null, null, null, null, nome_banda);
		b.gerarBanda(nomes, nome_banda);
		return b;
	}
	
	public String consultaNome(int indice) {
		return bandas.get(indice).getNome();
	}

	@Override
	public Banda pegarBanda(int indice) /*throws*/{
		if (indice >= 0 && indice < bandas.size()) {
            return bandas.get(indice);
        } else {
           // throw new IndiceInvalidoException();
        	return null; // retirar
        }
	}

	@Override
	public Banda primeiroElemento()/*throws*/ {
		if (!bandas.isEmpty()) {
            return bandas.get(0);
        } else {
            //throw new RepositorioVazioException();
            return null; // retirar
        }
	}

}
