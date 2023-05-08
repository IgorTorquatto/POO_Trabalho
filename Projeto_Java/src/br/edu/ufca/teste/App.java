package br.edu.ufca.teste;

import java.util.Scanner;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class App {
	
  public static void main(String[] args) {
	  
	  //A intenção é deixar similar a um sistema de gerenciamento
	  
	  RepositorioBanda bandas = new RepositorioBanda();
	  
	  //Início - Trata se o usuário escreveu uma string:
	  
	  Scanner scanner = new Scanner(System.in);
      String nome = "";

      while (nome.isEmpty() || !nome.matches("[a-zA-Z]+")) {
          System.out.println("Digite seu nome: ");
          nome = scanner.nextLine();

          if (!nome.matches("[a-zA-Z]+")) {
              System.out.println("Digite apenas letras.");
          }
      }

      //Mensagem de início:
      
      System.out.println("Olá, " + nome + "!");
      System.out.println("Primeiramente, vamos cadastrar sua primeira banda. \n");
      
	  bandas.adicionaBanda(Funcionalidades.Novabanda());
      
      //Parte das variáveis:
      
      boolean sair = false;
      int escolha;
      Gerente gerente = new Gerente(nome, bandas.getBandas().get(0), 10000);
      Show show = new Show();
      int i;
      int indice=0;
      int excluir;
      
      System.out.println("Vamos começar seu sistema de gerenciamento de banda"+
		      " escolha uma das opções abaixo: ");
    		  
      while(sair==false) {
    	  
    	  System.out.println("indice"+ indice); // Mostrando para corrigir bugs, apagar depois
    	  
    	  System.out.println(
				  "\n1-Cadastrar nova banda\n"
		   		+ "2-Detalhes da banda\n"
		   		+ "3-Comprar músicos com atributos especiais \n"
		   		+ "4-Realizar show \n"
		   		+ "5-Excluir bandas\n"
		   		+ "6-Trocar de banda \n"
		   		+ "7-Encerrar programa\n"
		   		+ "Quantidade de bandas sendo gerenciadas: " + bandas.qtdBandas()+"\n"
		   		+ "Nome da Banda sendo gerenciada atualmente: " +gerente.getBanda().getNome() +"\n"
		   		);
    	  
    	  escolha = scanner.nextInt();
    	  
	    	switch (escolha) {
	    	
			case 1: 
				
				//Criar banda 
				
				  bandas.adicionaBanda(Funcionalidades.Novabanda());
				  System.out.println("Seu número de bandas agora é: "+ bandas.qtdBandas());
				  
				break;
					
			case 2:
				
				//Detalhes
				
				if(bandas.qtdBandas() == 0) System.out.println("Você não possui nenhuma banda cadastrada.");
				
				else {
					System.out.println("\n Banda: "+gerente.getBanda().getNome());
					System.out.println("Integrantes da banda: \n");
					String[] nome_integrantes = gerente.getBanda().imprimirBanda();
					for(i=0;i<5;i++) {
						   System.out.println(nome_integrantes[i]);
					 }
					
				}
			
				break;
				
			case 3:
				
				//Loja
				Funcionalidades.Loja(gerente);
				
				break;
				
			case 4:
				
				//Show
				System.out.println("Relizando show");
				show.realizarShow(gerente.getBanda(), gerente);
				show.pagarDespesas(gerente.getBanda(), gerente);
				break;
				
			case 5:
				
				//Excluir
				if(bandas.qtdBandas() == 1) {
					System.out.println("Para continuar com o sistema de gerenciamento de bandas você não pode excluir sua única banda."); 
					break;
				}
				System.out.println("Você deseja excluir a banda "+"("+gerente.getBanda().getNome()+")" +"?\n"
				+"1-Sim\n"
				+"2-Não\n");
				
				excluir = scanner.nextInt();
				
				if(excluir == 1) {
					
					if (indice == 0) {
						bandas.removeBanda(bandas.getBandas().get(0));
						gerente.setBanda(bandas.getBandas().get(0));
						System.out.println("Banda excluída com sucesso.");
					}
					
					else if (indice > 0 ) {
						
						bandas.removeBanda(bandas.getBandas().get(indice - 1));
						gerente.setBanda(bandas.getBandas().get(0));
						System.out.println("Banda excluída com sucesso.");
						indice--;
						
					}
					
				}
				
				else {
					System.out.println("Selecione a banda que deseja excluir no menu de opções.");
				}
				
				break;
				
			case 6:
				
				//Troca a banda do usuário
				
				if(bandas.qtdBandas() == 1 ) {
					System.out.println("Você possui apenas uma banda cadastrada. Preocedimento inválido.");
					break;
				}
				
				else if (bandas.qtdBandas() > 1){
					System.out.println("Selecione o número da banda que você quer gerenciar agora :  [1/2/3/4/...]");
					indice = scanner.nextInt();
					
					if(indice > 0 && indice <= bandas.qtdBandas()) {
						gerente.setBanda(bandas.getBandas().get(indice - 1));
					}
					else {
						System.out.println("Opção inválida!");
						indice = 0;
					}
					
				}
				
				break;
				
			case 7:
				sair = true;
				break;
				
			default:
				System.out.println("Opção inválida!");
			}
	      }
      System.out.println("Programa finalizado com sucesso "+nome+".");
      scanner.close();
      System.exit(0);
  
  }
}
