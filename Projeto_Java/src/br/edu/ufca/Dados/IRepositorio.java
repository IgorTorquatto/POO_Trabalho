package br.edu.ufca.Dados;

import br.edu.ufca.Negocio.Banda;

public interface IRepositorio<T>{
	
	//CRUD:
	public void consulta(T parametro);
	public void atualiza(T parametro,T parametro2);
	public void remove(T parametro);
	
}
