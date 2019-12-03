package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.devopen.snackandstairs.objetos.Coordenada;

public class StrategyConcretCasaEscada  extends StrategyCasasAbstract {
	private int numeroCasaAtual;
	public Coordenada coordenada;
	
	public StrategyConcretCasaEscada() {
		super();
	}
	
	public StrategyConcretCasaEscada(int numeroCasaAtual, double x, double y) {
		super(numeroCasaAtual, x, y);
		this.coordenada = new Coordenada(x, y);
		this.numeroCasaAtual = numeroCasaAtual;
	}

	@Override
	public void setCoordenadaAndar(int numero) {
		System.out.println("Parabéns você subiu na escada, avançou "+numero+" casas");
		this.numeroCasaAtual = numero;
	}

	@Override
	public Coordenada getCoordenadaAtual() {
		if(this.numeroCasaAtual == 6) {
			this.numeroCasaAtual = 10;
			this.coordenada.setX(250);
			this.coordenada.setY(240);
		}
		return this.coordenada;
	}
//
	@Override
	public int getNumeroCasaAtual() {
		// TODO Auto-generated method stub
		return this.numeroCasaAtual;
	}

	@Override
	public String toString() {
		return "StrategyConcretCasaEscada [numeroCasaAtual=" + numeroCasaAtual + ", coordenada=" + coordenada + "]";
	}
	

}
