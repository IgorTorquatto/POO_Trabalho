package br.edu.ufca.dados;

public class Baixista extends MusicoAbstrato {
	
	private double expMax = 99.30;

	public double getExpMax() {
		return expMax;
	}

	public Baixista(String nome,double exp,int preco) {
		super(nome,exp,preco);
	}
	

	@Override
	public boolean alcancarExpMax(MusicoAbstrato musico) {
		if(this.expMax > musico.getExp()) {
			System.out.printf("BAIXISTA: ");
			return true;
		}
		else 
			System.out.printf("BAIXISTA: ");
			return false;
	}
	
	@Override
	public double receberCache(double exp){
		double valor;
		valor = exp * 15;
		return valor;
	}
	
}
