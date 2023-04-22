package br.edu.ufca.teste;
import java.util.Random;
import br.edu.ufca.dados.Banda;

public class Show {
	int notasPublico;
	double exp;
	Random notas = new Random();
	
	public void realizarShow(Banda banda){
		//Abaixo é especificando o total de experiência ganha, de acordo com o nível da banda e de sua nota no respectivo show
		if(banda.calcularExp() <= 69) {
			//1: 10% de experiência; 2: 15% de experiência; 3: 20% de experiência
			notasPublico = notas.nextInt(4-1)+1;
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
		}else if(banda.calcularExp() > 69 && banda.calcularExp() <= 79) {
			//4: 25% de experiência; 5: 30% de experiência; 6: 35% de experiência
			notasPublico = notas.nextInt(7-4)+1;
			switch(notasPublico){
				case 4:
					exp = 0.25;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 5:
					exp = 0.30;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 6:
					exp = 0.35;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}else if(banda.calcularExp() > 79 && banda.calcularExp() <= 89) {
			//7: 40% de experiência; 8: 45% de experiência; 9: 50% de experiência
			notasPublico = notas.nextInt(10-7)+1;
			switch(notasPublico){
				case 7:
					exp = 0.40;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 8:
					exp = 0.45;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 9:
					exp = 0.50;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}else {
			//10: 55% de experiência; 11: 60% de experiência;12: 65% de experiência
			notasPublico = notas.nextInt(13-10)+1;
			switch(notasPublico){
				case 10:
					exp = 0.55;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 11:
					exp = 0.60;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
				case 12:
					exp = 0.65;
					banda.atualizarExp(exp);
					System.out.println("Nota dada pelo público: "+notasPublico);
					break;
			}
		}
	}
	
}
