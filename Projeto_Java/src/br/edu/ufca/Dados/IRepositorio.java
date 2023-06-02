package br.edu.ufca.Dados;

import java.util.ArrayList;

import br.edu.ufca.Negocio.Banda;

public interface IRepositorio<T>{
	
	//CRUD:
	public int consulta(T parametro);
	public void atualiza(T parametro,T parametro2);
	public void remove(T parametro);
	
	//Outros:
	public boolean existe(T parametro);
	public void adiciona(T parametro);
	public int qtd();
	public boolean vazio();
	public Banda geraBanda(ArrayList<String> nomes,String nome_banda);
	public String consultaNome(int indice);
	public Banda pegarBanda(int indice);
}
