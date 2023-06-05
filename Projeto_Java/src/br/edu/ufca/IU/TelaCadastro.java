package br.edu.ufca.IU;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ufca.Negocio.Banda;
import br.edu.ufca.Negocio.Fachada;
import br.edu.ufca.Negocio.Gerente;

public class TelaCadastro {
	
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaCadastro(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}
	
	//cadastrar gerente
	public Gerente cadastroIncial() {
		
		String nome = "";
		Gerente gerente ;
		
	    while (nome.isEmpty() || !nome.matches("[a-zA-Z]+")) {
	        System.out.println("Digite seu nome: ");
	        nome = scanner.nextLine();

	        if (!nome.matches("[a-zA-Z]+")) {
	            System.out.println("Digite apenas letras.");
	        }
	    }
	    
	   gerente = fachada.adicionarGerente(nome, 10000, cadastroBanda());
	   return gerente;
	}
	
	public Banda cadastroBanda() {
		
		String nome_banda = "";
		Banda banda;
		int i;
		  
		  while (nome_banda.isEmpty() || !nome_banda.matches("[a-zA-Z]+")) {
	          System.out.println("Digite o nome da banda: ");
	          nome_banda = scanner.nextLine();

	          if (!nome_banda.matches("[a-zA-Z]+")) {
	              System.out.println("Digite apenas letras.");
	          }
	      }
		  
		 System.out.println("Cadastro: \n");
		 ArrayList<String> nome_musicos_inicial = new ArrayList<String>();
		 String[] musicos = {"vocalista","tecladista","guitarrista","baterista","baixista"};

		   for(i=0;i<5;i++) {
				  
				String nome_musico= "";

			 while (nome_musico.isEmpty() || !nome_musico.matches("[a-zA-Z]+")) {
			        System.out.println("Insira o nome do "+musicos[i]+" que você quer contratar.");
			        nome_musico = scanner.nextLine();
			        nome_musicos_inicial.add(nome_musico);

			        if (!nome_musico.matches("[a-zA-Z]+")) {
			            System.out.println("Digite apenas letras.");
			        }
			    }
				
			  }
		 
		 banda = fachada.gerarBanda(nome_musicos_inicial, nome_banda);
		 fachada.adicionarBanda(banda, nome_banda);
		 return  banda;
		   
	}
	
}
