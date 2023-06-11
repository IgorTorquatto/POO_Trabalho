package br.edu.ufca.IU;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.edu.ufca.Excecoes.gerenteInexistenteException;
import br.edu.ufca.Negocio.*;

public class TelaLoja {
	private Scanner scanner;
	private Fachada fachada;
	
	public TelaLoja(Fachada fachada) {
		this.fachada = fachada;
		scanner = new Scanner(System.in);
	}

	
	public void iniciar(Gerente gerente) {
		
		System.out.println("Loja: ");
		
		boolean sair_loja = false;
		int escolha;
		DecimalFormat dp = new DecimalFormat("#.000");
		
		while(sair_loja == false) {
			
			   System.out.println(
					  "1- Verificar saldo\n"
			   		+ "2- Comprar novo músico\n"
			   		+ "3- Sair da loja\n");
			   
			   escolha = scanner.nextInt();
			   
			   if(escolha==1) { 
				   try {
					System.out.println("Saldo " +dp.format(fachada.checarSaldoGerente(gerente))+" R$.");
				} catch (gerenteInexistenteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
			   }
			   
			   if(escolha==2) {
				   System.out.println("Qual integrante você deseja comprar? ");
				   System.out.println(
						   "1-Vocalista\n"
						   + "2-Tecladista\n"
						   + "3-Guitarrista\n"
						   + "4-Baterista\n"
						   + "5-Baixista\n");
				   
				   int escolh = scanner.nextInt();
				   
				   switch(escolh) {
				   
				   case 1:
					   System.out.println("Selecione a categoria de vocalistas: ");
					   System.out.println("1-Lendários\n2-Bons\n3-Médios");
					   int categoria = scanner.nextInt();
					   switch(categoria) {
					   case 1:
						   System.out.println("Qual vocalista você quer comprar? 10.000 R$ \n 1 - Freddie Mercury \n 2 - Elvis Presley \n 3 - Paul McCartney");
						   break;
					   case 2:
						   System.out.println("Qual vocalista você quer comprar? 5.000 R$ \n 1 - Mike Patton \n 2 - Steven Tyler \n 3 - Mick Jagger");
						   break;
					   case 3:
						   System.out.println("Qual vocalista você quer comprar? 3.000 R$ \n 1 - Ozzy Osbourne \n 2 - David Coverdale \n 3 - Bruce Dickinson");
						   break;
					   }
					   int posicao = scanner.nextInt();
					   System.out.println(fachada.comprarVocalistaGerente(gerente, categoria, posicao));
					   break;
				   case 2:
					   System.out.println("Selecione a categoria de tecladistas: ");
					   System.out.println("1-Lendários\n2-Bons\n3-Médios");
					   categoria = scanner.nextInt();
					   switch(categoria) {
					   case 1:
						   System.out.println("Qual tecladista você quer comprar? 10000 R$ \n 1 - Rick Wakeman \n 2 - Jon Lord \n 3 - Keith Emerson");
						   break;
					   case 2:
						   System.out.println("Qual tecladista você quer comprar? 5.000 R$ \n 1 - Josh Silver \n 2 - Geddy Lee \n 3 - Trent Reznor");
						   break;
					   case 3:
						   System.out.println("Qual tecladista você quer comprar? 3.000 R$ \n 1 - Jon Oliva \n 2 - Per Wiberg \n 3 - Steven Wilson");
						   break;
					   }
					   posicao = scanner.nextInt();
					   System.out.println(fachada.comprarTecladistaGerente(gerente,  categoria, posicao));
					   break;
				   case 3:
					   System.out.println("Selecione a categoria de guitarrista: ");
					   System.out.println("1-Lendários\n2-Bons\n3-Médios");
					   categoria = scanner.nextInt();
					   switch(categoria) {
					   case 1:
						   System.out.println("Qual guitarrista você quer comprar? 10000 R$ \n 1 - Jimmy Hendrix \n 2 - Duane Allman \n 3 - B. B. King");
						   break;
					   case 2:
						   System.out.println("Qual guitarrista você quer comprar?  5.000 R$ \n 1 - Angus Young \n 2 - Steve Vai \n 3 - George Harrison");
						   break;
					   case 3:
						   System.out.println("Qual guitarrista você quer comprar? 3.000 R$ \n 1 - Santana \n 2 - David Gilmour \n 3 - Eddie Van Halen");
						   break;
					   }
					   posicao = scanner.nextInt();
					   System.out.println(fachada.comprarGuitarristaGerente(gerente,  categoria, posicao));
					   break;
				   case 4:
					   System.out.println("Selecione a categoria de bateristas: ");
					   System.out.println("1-Lendários\n2-Bons\n3-Médios");
					   categoria = scanner.nextInt();
					   switch(categoria) {
					   case 1:
						   System.out.println("Qual baterista você quer comprar? 10000 R$ \n 1 - John Bonham \n 2 - Keith Moon \n 3 - Ginger Baker");
						   break;
					   case 2:
						   System.out.println("Qual baterista você quer comprar?  5.000 R$ \n 1 - Lars Ulrich \n 2 - Mike Portnoy \n 3 - Ginger Baker");
						   break;
					   case 3:
						   System.out.println("Qual baterista você quer comprar? 3.000 R$ \n 1 - Ringo Starr \n 2 - Stewars Copeland \n 3 - John Freese");
						   break;
					   }
					   posicao = scanner.nextInt();
					   System.out.println(fachada.comprarBateristaGerente(gerente,  categoria, posicao));
					   break;
				   case 5:
					   System.out.println("Selecione a categoria de baixistas: ");
					   System.out.println("1-Lendários\n2-Bons\n3-Médios");
					   categoria = scanner.nextInt();
					   switch(categoria) {
					   case 1:
						   System.out.println("Qual baixista você quer comprar? 10000 R$ \n 1 - James Jamerson \n 2 - Charles Mingus \n 3 - John Entwistle");
						   break;
					   case 2:
						   System.out.println("Qual baixista você quer comprar? 5.000 R$ \n 1 - Justin Chancellor \n 2 - John Myung \n 3 - Joe Dart");
						   break;
					   case 3:
						   System.out.println("Qual baixista você quer comprar? 3.000 R$ \n 1 - Paz Lenchantin \n 2 - Mike Kerr \n 3 - Matt Freeman");
						   break;
					   }
					   posicao = scanner.nextInt();
					   System.out.println(fachada.comprarBaixistaGerente(gerente,  categoria, posicao));
					   break;
					
					default:
						System.out.println("Opção inválida! ");
				   }
			   }
			   if(escolha==3) sair_loja= true;
		   }
		  
	}

}
