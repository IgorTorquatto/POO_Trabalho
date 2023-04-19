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
	  	   int num;
	  	   
		   System.out.println("Digite seu nome: ");
		   nome = input.nextLine();		  
		   
		   System.out.println("Olá " + nome + " vamos começar o seu sistema de gerenciamento da banda, escolha uma das opções a seguir: ");
		   System.out.printf("1- Criar banda \n 2-Encerrar programa \n");
		   num = input.nextInt();
		   
		   if(num == 2) System.exit(0);
		   
		   //Criando banda e gerente:
		   System.out.println("Criando sua banda inicial...");
		   Banda banda = new Banda(null,null,null,null,null);
		   banda = Funcionalidades.gerarBanda();
		   Gerente gerente = new Gerente(nome,banda,500);
		   
		   //Operações:
		   System.out.println("Sua banda foi criada com sucesso! Agora escolha uma das opções abaixo: ");
		   //switch com a opção de realizar show, checar status banda ( nome dos artistas ,exp , etc), comprar artistas e encerrar programa.
		   
 
  
  }
  
}
