package br.edu.ufca.dados;

public class Baterista extends MusicoAbstrato {
	
	private double expMax = 98.99;

	public double getExpMax() {
		return expMax;
	}
	
	public Baterista(String nome,double exp,int preco) {
		super(nome,exp,preco);
	}
	
	@Override
	public boolean alcancarExpMax(MusicoAbstrato musico) {
		if(this.expMax > musico.getExp()) {
			System.out.printf("BATERISTA: ");
			return true;
		}
		else
			System.out.printf("BATERISTA: ");
			return false;
	}
	
}
