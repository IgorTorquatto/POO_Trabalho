package br.edu.ufca.Negocio;
import java.util.Random;

public class Show {
	int notasPublico;
	double exp, despesaArtista;
	Random notas = new Random();
	
	public void realizarShow(Banda banda, Gerente gerente){
		//Abaixo é especificando o total de experiência ganha, de acordo com o nível da banda e de sua nota no respectivo show
		double dinheiro;
		double experiencia = 0;
		experiencia = banda.calcularExp();
		notasPublico = notas.nextInt(4-1)+1;
		//quanto maior a expeciência de uma banda, maior será a experiência e dinheiro ganho em cada show.
		if(experiencia <= 69) {
			//1: 10% de experiência; 2: 15% de experiência; 3: 20% de experiência
			//1: 1.000; 2: 2.000 e 3: 3.000
			System.out.println("ESTÁGIO 1");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 1000;
					gerente.setDinheiro(dinheiro);
					exp = 0.10;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 2000;
					gerente.setDinheiro(dinheiro);
					exp = 0.15;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 3000;
					gerente.setDinheiro(dinheiro);
					exp = 0.20;
					banda.atualizarExp(exp);
					break;
			}
		}else if(experiencia <= 79) {
			//1: 25% de experiência; 2: 30% de experiência; 3: 35% de experiência
			//1: 4.000; 2: 5.000 e 3: 6.000
			System.out.println("ESTÁGIO 2");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 4000;
					gerente.setDinheiro(dinheiro);
					exp = 0.25;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 5000;
					gerente.setDinheiro(dinheiro);
					exp = 0.30;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 6000;
					gerente.setDinheiro(dinheiro);
					exp = 0.35;
					banda.atualizarExp(exp);
					break;
			}
		}else if(experiencia <= 89) {
			//1: 40% de experiência; 2: 45% de experiência; 3: 50% de experiência
			//1: 7.000; 2: 8.000 e 3: 9.000
			System.out.println("ESTÁGIO 3");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 7000;
					gerente.setDinheiro(dinheiro);
					exp = 0.40;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 8000;
					gerente.setDinheiro(dinheiro);
					exp = 0.45;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 9000;
					gerente.setDinheiro(dinheiro);
					exp = 0.50;
					banda.atualizarExp(exp);
					break;
			}
		}else {
			//1: 55% de experiência; 2: 60% de experiência; 3: 65% de experiência
			//1: 10.000; 2: 15.000 e 3: 20.000
			System.out.println("ESTÁGIO 4");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 10000;
					gerente.setDinheiro(dinheiro);
					exp = 0.55;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 15000;
					gerente.setDinheiro(dinheiro);
					exp = 0.60;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico+"\n");
					dinheiro = gerente.getDinheiro();
					dinheiro += 20000;
					gerente.setDinheiro(dinheiro);
					exp = 0.65;
					banda.atualizarExp(exp);
					break;
			}
		}
	}
	
	public void pagarDespesas(Banda banda, Gerente gerente) {
		banda.pagarBanda(gerente);
	}
	
}
