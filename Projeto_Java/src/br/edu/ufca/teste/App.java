package br.edu.ufca.teste;
import java.util.ArrayList;
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
      Gerente gerente = new Gerente(nome, bandas.getBandas().get(0), 3000000);
      int i;
      int indice=0;
      int excluir;
      
      System.out.println("Vamos começar seu sistema de gerenciamento de banda"+
		      " escolha uma das opções abaixo: ");
    		  
      while(sair==false) {
    	  
    	  System.out.println("indice"+ indice); // cuidado com os bugs que esse cara gera
    	  
    	  System.out.println(
				  "\n1-Cadastrar nova banda\n"
		   		+ "2-Detalhes da banda\n"
		   		+ "3-Comprar músicos com atributos especiais \n"
		   		+ "4-Realizar show \n"
		   		+ "5-Excluir bandas\n"
		   		+ "6-Trocar  de banda \n"
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
				
					System.out.println("Integrantes da banda: \n");
					String[] nome_integrantes = gerente.getBanda().imprimirBanda();
					for(i=0;i<5;i++) {
						   System.out.println(nome_integrantes[i]);
					 }
				
				break;
				
			case 3:
				
				//Loja
				Funcionalidades.Loja(gerente);
				
				break;
				
			case 4:
				
				//Show
				
				break;
				
			case 5:
				
				//Excluir
				System.out.println("Você deseja excluir banda atual? \n"
				+"1-Sim\n"
				+"2-Não\n");
				
				excluir = scanner.nextInt();
				
				if(excluir == 1) {
					bandas.removeBanda(bandas.getBandas().get(indice));
					gerente.setBanda(bandas.getBandas().get(0));
					System.out.println("Banda excluída com sucesso.");
					indice--;
				}
				
				else {
					System.out.println("Selecione a banda que deseja excluir no menu de opções.");
				}
				
				break;
				
			case 6:
				
				//Troca a banda do usuário
				
				System.out.println("Selecione o número da banda que você quer gerenciar agora :  [0/1/2/3/...]");
				indice = scanner.nextInt();
				
				if(indice > 0 && indice <= bandas.qtdBandas()) {
					gerente.setBanda(bandas.getBandas().get(indice));
				}
				else {
					System.out.println("Opção inválida!");
				}
				
				break;
				
			case 7:
				sair = true;
				break;
				
			default:
				System.out.println("Opção inválida!");
			}
	      }
      System.exit(0);
  
  }
}
