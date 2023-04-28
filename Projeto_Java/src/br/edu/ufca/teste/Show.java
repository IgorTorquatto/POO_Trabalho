package br.edu.ufca.teste;
import java.util.Random;
import br.edu.ufca.dados.Banda;
import br.edu.ufca.dados.Gerente;

public class Show {
	int notasPublico;
	double exp;
	Random notas = new Random();
	
	public void realizarShow(Banda banda, Gerente gerente){
		//Abaixo é especificando o total de experiência ganha, de acordo com o nível da banda e de sua nota no respectivo show
		double dinheiro;
		double experiencia = 0;
		experiencia = banda.calcularExp();
		System.out.println(experiencia);
		notasPublico = notas.nextInt(4-1)+1;
		//quanto maior a expeciência de uma banda, maior será a experiência e dinheiro ganho em cada show.
		if(experiencia <= 69) {
			//1: 10% de experiência; 2: 15% de experiência; 3: 20% de experiência
			//1: 10.000; 2: 15.000 e 3: 20.000
			System.out.println("ESTÁGIO 1");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = gerente.getDinheiro();
					dinheiro += 10000;
					gerente.setDinheiro(dinheiro);
					exp = 0.10;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = gerente.getDinheiro();
					dinheiro += 15000;
					gerente.setDinheiro(dinheiro);
					exp = 0.15;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = gerente.getDinheiro();
					dinheiro += 20000;
					gerente.setDinheiro(dinheiro);
					exp = 0.20;
					banda.atualizarExp(exp);
					break;
			}
		}else if(experiencia <= 79) {
			//1: 25% de experiência; 2: 30% de experiência; 3: 35% de experiência
			//1: 30.000; 2: 35.000 e 3: 40.000
			System.out.println("ESTÁGIO 2");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 30000;
					gerente.setDinheiro(dinheiro);
					exp = 0.25;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 35000;
					gerente.setDinheiro(dinheiro);
					exp = 0.30;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 40000;
					gerente.setDinheiro(dinheiro);
					exp = 0.35;
					banda.atualizarExp(exp);
					break;
			}
		}else if(experiencia <= 89) {
			//1: 40% de experiência; 2: 45% de experiência; 3: 50% de experiência
			//1: 50.000; 2: 55.000 e 3: 60.000
			System.out.println("ESTÁGIO 3");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 50000;
					gerente.setDinheiro(dinheiro);
					exp = 0.40;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 55000;
					gerente.setDinheiro(dinheiro);
					exp = 0.45;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 60000;
					gerente.setDinheiro(dinheiro);
					exp = 0.50;
					banda.atualizarExp(exp);
					break;
			}
		}else {
			//1: 55% de experiência; 2: 60% de experiência; 3: 65% de experiência
			//1: 70.000; 2: 75.000 e 3: 80.000
			System.out.println("ESTÁGIO 4");
			switch(notasPublico){
				case 1:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 70000;
					gerente.setDinheiro(dinheiro);
					exp = 0.55;
					banda.atualizarExp(exp);
					break;
				case 2:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 75000;
					gerente.setDinheiro(dinheiro);
					exp = 0.60;
					banda.atualizarExp(exp);
					break;
				case 3:
					System.out.println("Nota dada pelo público: "+notasPublico);
					dinheiro = 80000;
					gerente.setDinheiro(dinheiro);
					exp = 0.65;
					banda.atualizarExp(exp);
					break;
			}
		}
	}
	
}
