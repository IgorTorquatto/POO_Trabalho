package br.edu.ufca.teste;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Teste {
	//Esse package é onde fica a main
	
  public static void main(String[] args) {
	  
	  	   //Parte inicial:
	  
	  	   Scanner input = new Scanner(System.in);
	  	   String nome;
	  	   int escolha_usuario;
	  	   
		   System.out.println("Digite seu nome: ");
		   nome = input.nextLine();		  
		   
		   System.out.println("Olá " + nome + " vamos começar o seu sistema de gerenciamento da banda, escolha uma das opções a seguir: ");
		   System.out.printf("1- Criar banda \n2-Encerrar programa \n");
		   escolha_usuario = input.nextInt();
		   
		   if(escolha_usuario == 2) System.exit(0);
		   
		   //Criando banda e gerente:
		   
		   System.out.println("Criando sua banda inicial...");
		   Banda banda = new Banda(null,null,null,null,null);
		   banda.gerarBanda();
		   Gerente gerente = new Gerente(nome,banda,500);
		   
		   //Operações:
		   
		   System.out.println("Sua banda foi criada com sucesso! Agora escolha uma das opções abaixo: ");
		   
		   Boolean sair = false;
		  
		   while(sair == false ) {
			   
			   System.out.println("\n1-Realizar show \n2-Ver lista de integrantes\n3-Ir para a loja\n4-Encerrar programa\n");
			   escolha_usuario = input.nextInt();
			   
			   switch(escolha_usuario) {
			   
			   case 1:
				   System.out.println("Relizando show");
				   break;
				   
			   case 2:
				   System.out.println("Integrantes da banda: ");
				   System.out.println(banda.imprimirBanda());
				   break;
				   
			   case 3:
				   System.out.println("Loja: ");
				   break;
				   
			   case 4:
				   sair = true;
				   break;
				   
			   default:
					System.out.println("Opção inválida! Digite uma das opções: ");
				   
			   }
			   
		   }
		   System.out.println("Parabéns pelo seu progresso " +gerente.getNome()+" !");
		   System.exit(0);
  }
  
}
