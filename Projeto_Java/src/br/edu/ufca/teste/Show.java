package br.edu.ufca.teste;
import java.util.Random;
import br.edu.ufca.dados.Banda;

public class Show {
	int notasPublico;
	double exp;
	Random notas = new Random();
	
	public void realizarShow(Banda banda){
		//Abaixo é especificando o total de experiência ganha, de acordo com o nível da banda e de sua nota no respectivo show
		double experiencia = 0;
		experiencia = banda.calcularExp();
		System.out.println(experiencia);
		notasPublico = notas.nextInt(4-1)+1;
		//quanto maior a média de expeciência de uma banda, maior será a experiência ganha em cada show
		if(experiencia <= 69) {
			//1: 10% de experiência; 2: 15% de experiência; 3: 20% de experiência
			System.out.println("ESTÁGIO 1");
			switch(notasPublico){
				case 1:
					exp = 0.10;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 2:
					exp = 0.15;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 3:
					exp = 0.20;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}else if(experiencia <= 79) {
			//1: 25% de experiência; 2: 30% de experiência; 3: 35% de experiência
			System.out.println("ESTÁGIO 2");
			switch(notasPublico){
				case 1:
					exp = 0.25;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 2:
					exp = 0.30;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 3:
					exp = 0.35;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}else if(experiencia <= 89) {
			//1: 40% de experiência; 2: 45% de experiência; 3: 50% de experiência
			System.out.println("ESTÁGIO 3");
			switch(notasPublico){
				case 1:
					exp = 0.40;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 2:
					exp = 0.45;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 3:
					exp = 0.50;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}else {
			//1: 55% de experiência; 2: 60% de experiência; 3: 65% de experiência
			System.out.println("ESTÁGIO 4");
			switch(notasPublico){
				case 1:
					exp = 0.55;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 2:
					exp = 0.60;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 3:
					exp = 0.65;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}
	}
	
}
