package br.edu.ufca.Negocio;

import java.util.Random;

import java.util.Scanner;

import br.edu.ufca.Dados.*;

public class Loja {public static String comprarVocalista(Gerente gerente, int categoria, int posicao) {
	
	RepositorioMusicos vocalistas_lendarios = new RepositorioMusicos();
	RepositorioMusicos vocalistas_bons = new RepositorioMusicos();
	RepositorioMusicos vocalistas_medios = new RepositorioMusicos();
	
	String[] nomes_lendarios = {"Freddie Mercury","Elvis Presley","Paul McCartney"};
	String[] nomes_bons = {"Mike Patton","Steven Tyler","Mick Jagger"};
	String[] nomes_medios = {"Ozzy Osbourne","David Coverdale","Bruce Dickinson"};
	
	Random random = new Random();
	
	for(int i = 0 ; i < 3 ; i++) {
		vocalistas_lendarios.adiciona(new Vocalista(nomes_lendarios[i],random.nextInt(99-90)+90, 10000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		vocalistas_bons.adiciona(new Vocalista(nomes_bons[i],random.nextInt(89-80)+80, 5000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		vocalistas_medios.adiciona(new Vocalista(nomes_medios[i],random.nextInt(79-70)+70, 3000));
	}
	
	if(categoria == 1) {
		//Vocalistas Lendários:

		//vocalistas_lendarios.imprimirMusicos();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= vocalistas_lendarios.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_lendarios.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;

				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)(vocalistas_lendarios.getMusicos().get(0)));
				return "Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= vocalistas_lendarios.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_lendarios.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_lendarios.getMusicos().get(1));
				return "Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= vocalistas_lendarios.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_lendarios.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_lendarios.getMusicos().get(2));
				return "Parabéns,você comprou "+vocalistas_lendarios.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
	}
	
	
	
	else if(categoria == 2) {
		//Vocalistas bons
		
		//vocalistas_bons.imprimirMusicos();
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= vocalistas_bons.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_bons.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(0));
				return "Parabéns,você comprou "+vocalistas_bons.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= vocalistas_bons.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_bons.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(1));
				return "Parabéns,você comprou "+vocalistas_bons.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= vocalistas_bons.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_bons.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_bons.getMusicos().get(2));
				return "Parabéns,você comprou "+vocalistas_bons.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		//vocalistas_medios.imprimirMusicos();
		
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= vocalistas_medios.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_medios.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(0));
				return "Parabéns,você comprou "+vocalistas_medios.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= vocalistas_medios.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_medios.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(1));
				return "Parabéns,você comprou "+vocalistas_medios.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= vocalistas_medios.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = vocalistas_medios.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setVocalista((Vocalista)vocalistas_medios.getMusicos().get(2));
				return "Parabéns,você comprou "+vocalistas_medios.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
	}
	
	else {
		return "Opção inválida!";
	}
	return "";
}
		
public static String comprarTecladista(Gerente gerente, int categoria, int posicao) {
	
	RepositorioMusicos tecladistas_lendarios = new RepositorioMusicos();
	RepositorioMusicos tecladistas_bons = new RepositorioMusicos();
	RepositorioMusicos tecladistas_medios = new RepositorioMusicos();
	
	String[] nomes_lendarios = {"Rick Wakeman","Jon Lord","Keith Emerson"};
	String[] nomes_bons = {"Josh Silver","Geddy Lee","Trent Reznor"};
	String[] nomes_medios = {"Jon Oliva","Per Wiberg","Steven Wilson"};
	
	Random random = new Random();
	
	for(int i = 0 ; i < 3 ; i++) {
		tecladistas_lendarios.adiciona(new Tecladista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		tecladistas_bons.adiciona(new Tecladista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
	}
	
	for(int i = 0 ; i < 3 ; i++) {
		tecladistas_medios.adiciona(new Tecladista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
	}
	
	
	
	if(categoria == 1) {
		//Vocalistas Lendários:

		//tecladistas_lendarios.imprimirMusicos();
		
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= tecladistas_lendarios.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_lendarios.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;

				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)(tecladistas_lendarios.getMusicos().get(0)));
				return "Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= tecladistas_lendarios.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_lendarios.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_lendarios.getMusicos().get(1));
				return "Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= tecladistas_lendarios.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_lendarios.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_lendarios.getMusicos().get(2));
				return "Parabéns,você comprou "+tecladistas_lendarios.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
	}
	
	
	
	else if(categoria == 2) {
		//Vocalistas bons
		
		//tecladistas_bons.imprimirMusicos();
		
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= tecladistas_bons.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int  preco = tecladistas_bons.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(0));
				return "Parabéns,você comprou "+tecladistas_bons.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= tecladistas_bons.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_bons.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(1));
				return "Parabéns,você comprou "+tecladistas_bons.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= tecladistas_bons.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_bons.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_bons.getMusicos().get(2));
				return "Parabéns,você comprou "+tecladistas_bons.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
	}
	
	
	else if(categoria == 3) {
		//Vocalistas médios
	
		//tecladistas_medios.imprimirMusicos();
		
		
		if(posicao == 1) {
			
			if(gerente.getDinheiro() >= tecladistas_medios.getMusicos().get(0).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_medios.getMusicos().get(0).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(0));
				return "Parabéns,você comprou "+tecladistas_medios.getMusicos().get(0).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
			
		}
		
		if(posicao == 2) {
			
			if(gerente.getDinheiro() >= tecladistas_medios.getMusicos().get(1).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_medios.getMusicos().get(1).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(1));
				return "Parabéns,você comprou "+tecladistas_medios.getMusicos().get(1).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
		
		if(posicao == 3) {
			
			if(gerente.getDinheiro() >= tecladistas_medios.getMusicos().get(2).getPreco()) {
				
				double dinheiro_gerente = gerente.getDinheiro();
				int preco = tecladistas_medios.getMusicos().get(2).getPreco();
				double novo_saldo = dinheiro_gerente - preco;
				
				gerente.setDinheiro(novo_saldo);
				gerente.getBanda().setTecladista((Tecladista)tecladistas_medios.getMusicos().get(2));
				return "Parabéns,você comprou "+tecladistas_medios.getMusicos().get(2).getNome();
				
			}
			else {
				return "Saldo insuficiente!";
			}
		}
	}
	
	else {
		return "Opção inválida!";
	}
	return "";
}	

public static String comprarGuitarrista(Gerente gerente, int categoria, int posicao) {

RepositorioMusicos guitarristas_lendarios = new RepositorioMusicos();
RepositorioMusicos guitarristas_bons = new RepositorioMusicos();
RepositorioMusicos guitarristas_medios = new RepositorioMusicos();

String[] nomes_lendarios = {"Jimmy Hendrix","Duane Allman"," B. B. King"};
String[] nomes_bons = {"Angus Young","Steve Vai","George Harrison"};
String[] nomes_medios = {"Santana","David Gilmour","Eddie Van Halen"};

Random random = new Random();

for(int i = 0 ; i < 3 ; i++) {
	guitarristas_lendarios.adiciona(new Guitarrista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
}

for(int i = 0 ; i < 3 ; i++) {
	guitarristas_bons.adiciona(new Guitarrista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
}

for(int i = 0 ; i < 3 ; i++) {
	guitarristas_medios.adiciona(new Guitarrista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
}



if(categoria == 1) {
	//Vocalistas Lendários:

	//guitarristas_lendarios.imprimirMusicos();
	
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= guitarristas_lendarios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_lendarios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;

			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)(guitarristas_lendarios.getMusicos().get(0)));
			return "Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= guitarristas_lendarios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_lendarios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_lendarios.getMusicos().get(1));
			return "Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= guitarristas_lendarios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_lendarios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_lendarios.getMusicos().get(2));
			return "Parabéns,você comprou "+guitarristas_lendarios.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
}



else if(categoria == 2) {
	//Vocalistas bons
	
	//guitarristas_bons.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= guitarristas_bons.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int  preco = guitarristas_bons.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(0));
			return "Parabéns,você comprou "+guitarristas_bons.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= guitarristas_bons.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_bons.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(1));
			return "Parabéns,você comprou "+guitarristas_bons.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= guitarristas_bons.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_bons.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_bons.getMusicos().get(2));
			return "Parabéns,você comprou "+guitarristas_bons.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
}


else if(categoria == 3) {
	//Vocalistas médios

	//guitarristas_medios.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= guitarristas_medios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_medios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(0));
			return "Parabéns,você comprou "+guitarristas_medios.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= guitarristas_medios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_medios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(1));
			return "Parabéns,você comprou "+guitarristas_medios.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= guitarristas_medios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = guitarristas_medios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setGuitarrista((Guitarrista)guitarristas_medios.getMusicos().get(2));
			return "Parabéns,você comprou "+guitarristas_medios.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
}

else {
	return "Opção inválida!";
}
return "";
}	

public static String comprarBaixista(Gerente gerente, int categoria, int posicao) {

RepositorioMusicos baixistas_lendarios = new RepositorioMusicos();
RepositorioMusicos baixistas_bons = new RepositorioMusicos();
RepositorioMusicos baixistas_medios = new RepositorioMusicos();

String[] nomes_lendarios = {"James Jamerson","Charles Mingus","John Entwistle"};
String[] nomes_bons = {"Justin Chancellor","John Myung","Joe Dart"};
String[] nomes_medios = {"Paz Lenchantin","Mike Kerr","Matt Freeman"};

Random random = new Random();

for(int i = 0 ; i < 3 ; i++) {
	baixistas_lendarios.adiciona(new Baixista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
}

for(int i = 0 ; i < 3 ; i++) {
	baixistas_bons.adiciona(new Baixista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
}

for(int i = 0 ; i < 3 ; i++) {
	baixistas_medios.adiciona(new Baixista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
}



if(categoria == 1) {
	//Vocalistas Lendários:

	//baixistas_lendarios.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= baixistas_lendarios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_lendarios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;

			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)(baixistas_lendarios.getMusicos().get(0)));
			return "Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= baixistas_lendarios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_lendarios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_lendarios.getMusicos().get(1));
			return "Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= baixistas_lendarios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_lendarios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_lendarios.getMusicos().get(2));
			return "Parabéns,você comprou "+baixistas_lendarios.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
}



else if(categoria == 2) {
	//Vocalistas bons
	
	//baixistas_bons.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= baixistas_bons.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int  preco = baixistas_bons.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(0));
			return "Parabéns,você comprou "+baixistas_bons.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= baixistas_bons.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_bons.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(1));
			return "Parabéns,você comprou "+baixistas_bons.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= baixistas_bons.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_bons.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_bons.getMusicos().get(2));
			return "Parabéns,você comprou "+baixistas_bons.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
}


else if(categoria == 3) {
	//Vocalistas médios

	//baixistas_medios.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= baixistas_medios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_medios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(0));
			return "Parabéns,você comprou "+baixistas_medios.getMusicos().get(0).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= baixistas_medios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_medios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(1));
			return "Parabéns,você comprou "+baixistas_medios.getMusicos().get(1).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= baixistas_medios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = baixistas_medios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaixista((Baixista)baixistas_medios.getMusicos().get(2));
			return "Parabéns,você comprou "+baixistas_medios.getMusicos().get(2).getNome();
			
		}
		else {
			return "Saldo insuficiente!";
		}
	}
}

else {
	return "Opção inválida!";
}
return "";
}

public static String comprarBaterista(Gerente gerente, int categoria, int posicao) {

RepositorioMusicos bateristas_lendarios = new RepositorioMusicos();
RepositorioMusicos bateristas_bons = new RepositorioMusicos();
RepositorioMusicos bateristas_medios = new RepositorioMusicos();

String[] nomes_lendarios = {"John Bonham","Keith Moon","Ginger Baker"};
String[] nomes_bons = {"Lars Ulrich","Mike Portnoy","Ginger Baker"};
String[] nomes_medios = {"Ringo Starr","Stewars Copeland","John Freese"};

Random random = new Random();

for(int i = 0 ; i < 3 ; i++) {
	bateristas_lendarios.adiciona(new Baterista(nomes_lendarios[i],random.nextInt(99-90)+90, 5000));
}

for(int i = 0 ; i < 3 ; i++) {
	bateristas_bons.adiciona(new Baterista(nomes_bons[i],random.nextInt(89-80)+80, 3000));
}

for(int i = 0 ; i < 3 ; i++) {
	bateristas_medios.adiciona(new Baterista(nomes_medios[i],random.nextInt(79-70)+70, 2000));
}



if(categoria == 1) {
	//Vocalistas Lendários:

	//bateristas_lendarios.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= bateristas_lendarios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_lendarios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;

			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)(bateristas_lendarios.getMusicos().get(0)));
			return"Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(0).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= bateristas_lendarios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_lendarios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_lendarios.getMusicos().get(1));
			return"Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(1).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= bateristas_lendarios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_lendarios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_lendarios.getMusicos().get(2));
			return"Parabéns,você comprou "+bateristas_lendarios.getMusicos().get(2).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
}



else if(categoria == 2) {
	//Vocalistas bons
	
	//bateristas_bons.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= bateristas_bons.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int  preco = bateristas_bons.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(0));
			return"Parabéns,você comprou "+bateristas_bons.getMusicos().get(0).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= bateristas_bons.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_bons.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(1));
			return"Parabéns,você comprou "+bateristas_bons.getMusicos().get(1).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= bateristas_bons.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_bons.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_bons.getMusicos().get(2));
			return"Parabéns,você comprou "+bateristas_bons.getMusicos().get(2).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
	
}


else if(categoria == 3) {
	//Vocalistas médios

	//bateristas_medios.imprimirMusicos();
	
	
	if(posicao == 1) {
		
		if(gerente.getDinheiro() >= bateristas_medios.getMusicos().get(0).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_medios.getMusicos().get(0).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(0));
			return"Parabéns,você comprou "+bateristas_medios.getMusicos().get(0).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
		
	}
	
	if(posicao == 2) {
		
		if(gerente.getDinheiro() >= bateristas_medios.getMusicos().get(1).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_medios.getMusicos().get(1).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(1));
			return"Parabéns,você comprou "+bateristas_medios.getMusicos().get(1).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
	
	if(posicao == 3) {
		
		if(gerente.getDinheiro() >= bateristas_medios.getMusicos().get(2).getPreco()) {
			
			double dinheiro_gerente = gerente.getDinheiro();
			int preco = bateristas_medios.getMusicos().get(2).getPreco();
			double novo_saldo = dinheiro_gerente - preco;
			
			gerente.setDinheiro(novo_saldo);
			gerente.getBanda().setBaterista((Baterista)bateristas_medios.getMusicos().get(2));
			return"Parabéns,você comprou "+bateristas_medios.getMusicos().get(2).getNome();
			
		}
		else {
			return"Saldo insuficiente!";
		}
	}
}

else {
	return"Opção inválida!";
}
return "";
}
}
