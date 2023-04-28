package br.edu.ufca.teste;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.ufca.dados.*;
import br.edu.ufca.repositorio.*;

public class Teste {
	
  public static void main(String[] args) {
	  
	  	   //Parte inicial:
	  
	  	   Scanner input = new Scanner(System.in);
	  	   String nome;
	  	   int escolha_usuario;
	  	   int i;
	  	   
		   System.out.println("Digite seu nome: ");
		   nome = input.nextLine();		  
		   
		   System.out.println("Olá," + nome + " vamos começar o seu sistema de gerenciamento da banda, escolha uma das opções a seguir: ");
		   System.out.printf("1- Criar banda \n2- Encerrar programa \n");
		   escolha_usuario = input.nextInt();
		   
		   if(escolha_usuario == 2) {
			   System.out.println("Programa encerrado.");
			   System.exit(0);
		   }
		   
		
		  System.out.println("Cadastro incial: ");
		  ArrayList<String> nome_musicos_inicial = new ArrayList<String>();
		  String[] musicos = {"vocalista","tecladista","guitarrista","baterista","baixista"};
		  input.nextLine();
			
		  //Cadastrar nome dos músicos baseado na escolha de nomes passado pelo usuário/gerente:
			
		  for(i=0;i<5;i++) {
			  System.out.println("Insira o nome do "+musicos[i]+" que você quer contratar.");
			  nome_musicos_inicial.add(input.nextLine());
		  }
		
		  System.out.println("Qual o nome da sua nova banda? ");
		  String nome_banda = input.nextLine();
		  double saldo = 3000;
			
		  //Criando banda e o gerente:
			
		  System.out.println("Criando sua banda inicial...");
		  Banda banda = new Banda(null,null,null,null,null,null);
		  banda.gerarBanda(nome_musicos_inicial,nome_banda);
		  Gerente gerente = new Gerente(nome,banda,saldo);
		  RepositorioBanda bandas = new RepositorioBanda();
		  bandas.adicionaBanda(banda);
		  System.out.println("Banda criada, "+nome+" você é gerente da banda "+nome_banda+" e inicia com saldo de "+saldo);
		   
		   //Operações:
		   
		   System.out.println("Agora escolha uma das opções abaixo: ");
		   
		   Boolean sair = false;
		  
		   while(sair == false ) {
			   
			   System.out.println(
					  "\n1-Realizar show\n"
			   		+ "2-Ver lista de integrantes\n"
			   		+ "3-Ir para a loja\n"
			   		+ "4-Encerrar programa\n"
			   		+ "5-Verificar bandas gerenciadas\n");
			   
			   escolha_usuario = input.nextInt();
			   
			   switch(escolha_usuario) {
			   
			   case 1:
				   Show show = new Show();
				   System.out.println("Relizando show");
				   show.realizarShow(banda, gerente);
				   break;
				   
			   case 2:
				   System.out.println("Integrantes da banda: ");
				   String[] nome_integrantes = banda.imprimirBanda();
				   for(i=0;i<5;i++) {
					   System.out.println(nome_integrantes[i]);
				   }
				   break;
				   
			   case 3:
				   System.out.println("Loja: ");
				   boolean sair_loja = false;
				   int escolha;
				   while(sair_loja == false) {
					   System.out.println(
							  "1- Verificar saldo\n"
					   		+ "2-Comprar novo músico\n"
					   		+ "3- Sair da loja\n");
					   escolha = input.nextInt();
					   if(escolha==1) Loja.imprimirSaldo(gerente);
					   if(escolha==2) {
						   System.out.println("Qual integrante você deseja comprar? ");
						   System.out.println(
								   "1-Vocalista\n"
								   + "2-Tecladista\n"
								   + "3-Guitarrista\n"
								   + "4-Baterista\n"
								   + "5-Baixista\n");
						   
						   int escolh = input.nextInt();
						   
						   switch(escolh) {
						   
						   case 1:
							   Loja.comprarVocalista(gerente);
							   break;
						   case 2:
							   Loja.comprarTecladista(gerente);
							   break;
						   case 3:
							  Loja.comprarGuitarrista(gerente);
							   break;
						   case 4:
							   Loja.comprarBaterista(gerente);
							   break;
						   case 5:
							   Loja.comprarBaixista(gerente);
							   break;
							
							default:
								System.out.println("Opção inválida! ");
						   }
					   }
					   if(escolha==3) sair_loja= true;
				   }
				   break;
				   
			   case 4:
				   sair = true;
				   break;
			   case 5:
				   System.out.println("Número bandas: "+bandas.qtdBandas());
				   System.out.println("Nomes bandas: ");
				   bandas.imprimeNomesBandas();
				   break;
				   
			   default:
					System.out.println("Opção inválida! Digite uma das opções: ");
				   
			   }
			   
		   }
		   System.out.println("Parabéns pelo seu progresso " +gerente.getNome()+" !");
		   System.exit(0);
  }
  
}
