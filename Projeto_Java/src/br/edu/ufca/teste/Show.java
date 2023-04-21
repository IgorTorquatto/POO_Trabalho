package br.edu.ufca.teste;
import java.util.Random;
import br.edu.ufca.dados.Banda;

public class Show {
	int notasPublico, exp;
	Random notas = new Random();
	public void realizarShow(Banda banda){
		//1 - musicos ganham 30% de experiência; 2 - musicos ganham 40% de experiência; 3 - musicos ganham 50% de experiência 
		notasPublico = notas.nextInt(3-1)+1;
		exp = banda.calcularExp();
		System.out.println(exp);
	}
}
