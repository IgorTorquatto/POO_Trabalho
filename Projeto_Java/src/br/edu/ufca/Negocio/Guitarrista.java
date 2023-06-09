package br.edu.ufca.Negocio;

public class Guitarrista extends MusicoAbstrato implements IMusico{
	
	private double expMax = 99.45;

	public double getExpMax() {
		return expMax;
	}
	
	public Guitarrista(String nome,double exp,int preco) {
		super(nome,exp,preco);
	}
	
	@Override
	public boolean alcancarExpMax(MusicoAbstrato musico) {
		if(this.expMax > musico.getExp()) {
			System.out.printf("GUITARRISTA: ");
			return true;
		}
		else 
			System.out.printf("GUITARRISTA: ");
			return false;
	}
	
	@Override
	public double receberCache(double exp){
		double valor;
		valor = exp * 20;
		return valor;
	}
	
}
