package br.edu.ufca.dados;

public class Vocalista extends MusicoAbstrato implements IMusico{
	
	private double expMax = 99.99;

	public double getExpMax() {
		return expMax;
	}
	
	public Vocalista(String nome,double exp,int preco) {
		super(nome,exp,preco);
	}
	
	@Override
	public boolean alcancarExpMax(MusicoAbstrato musico) {
		if(this.expMax > musico.getExp()) {
			System.out.printf("VOCALISTA: ");
			return true;
		}
		else 
			System.out.printf("VOCALISTA: ");
			return false;
	}
	
	@Override
	public double receberCache(double exp){
		double valor;
		valor = exp * 40;
		return valor;
	}
	
	
}
