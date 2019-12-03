package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.devopen.snackandstairs.objetos.Coordenada;

public class StrategyConcretCasaNormal  extends StrategyCasasAbstract  {
	private int numeroCasaAtual = 0;
	public Coordenada coordenada;
	
	public StrategyConcretCasaNormal(int numeroCasaAtual, double x, double y) {
		super(numeroCasaAtual, x, y);
		this.coordenada = new Coordenada(x, y);
		this.numeroCasaAtual = numeroCasaAtual;
	}

	public StrategyConcretCasaNormal() {
		super();
	}

	@Override
	public void setCoordenadaAndar(int numero) {
		System.out.println("Avançou "+numero +" casa(s)");
		this.numeroCasaAtual = numero;
		
	}
//
	@Override
	public Coordenada getCoordenadaAtual() {
		return this.coordenada;
	}
//
	@Override
	public int getNumeroCasaAtual() {
		// TODO Auto-generated method stub
		return this.numeroCasaAtual;
	}
//
//	@Override
	public String toString() {
		return "StrategyConcretCasaNormal [numeroCasaAtual=" + numeroCasaAtual + ", coordenada=" + "]";
	}
	

}
