package br.edu.ufca.dados;

public class Tecladista extends MusicoAbstrato{
	
	private double expMax = 99.67;

	public double getExpMax() {
		return expMax;
	}
	
	public Tecladista(String nome,double exp,int preco) {
		super(nome,exp,preco);
	}
	
	@Override
	public boolean alcancarExpMax(MusicoAbstrato musico) {
		if(this.expMax > musico.getExp()) {
			System.out.printf("TECLADISTA: ");
			return true;
		}
		else 
			System.out.printf("TECLADISTA: ");
			return false;
	}
	
}
