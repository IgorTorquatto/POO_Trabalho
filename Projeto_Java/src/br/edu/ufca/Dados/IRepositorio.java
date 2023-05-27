package br.edu.ufca.Dados;

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
	
}
