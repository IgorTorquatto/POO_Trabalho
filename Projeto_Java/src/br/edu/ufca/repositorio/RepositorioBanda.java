package br.edu.ufca.repositorio;

import br.edu.ufca.dados.*;
import java.util.ArrayList;
import java.util.Random;

public class RepositorioBanda {
	
	//Guarda todas as bandas do usuário
	
	ArrayList<Banda> banda = new ArrayList<Banda>();
	Random numero_random = new Random();
	
	public RepositorioBanda(ArrayList<Banda> banda) {
		this.banda = banda;
	}
	
	
	//Fazer o CRUD desse repositorio:
	public void create() {
		
	}
	
	public String read() {
		return this.banda.toString();
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
