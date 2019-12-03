package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.devopen.snackandstairs.objetos.Coordenada;

public class StrategyCasasAbstract implements StrategyCasas{
	protected int numeroCasaAtual;
	private Coordenada coordenada;
	
	public StrategyCasasAbstract(int numeroCasaAtual,double x, double y) {
		this.numeroCasaAtual = numeroCasaAtual;
		this.coordenada = new Coordenada(x,y);
	}

	public StrategyCasasAbstract() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StrategyCasasAbstract [numeroCasaAtual=" + numeroCasaAtual + ", coordenada=" + coordenada + "]";
	}

	@Override
	public void setCoordenadaAndar(int numero) {
		this.numeroCasaAtual = numero;
		
	}

	@Override
	public Coordenada getCoordenadaAtual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumeroCasaAtual() {
		// TODO Auto-generated method stub
		return this.getNumeroCasaAtual();
	}
	
}
