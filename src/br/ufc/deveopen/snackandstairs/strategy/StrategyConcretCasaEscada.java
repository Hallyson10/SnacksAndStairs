package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.deveopen.snackandstairs.objetos.Coordenada;

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
		System.out.println("Opa uma escada");
		this.numeroCasaAtual = numero;
	}

	@Override
	public Coordenada getCoordenadaAtual() {
		if(this.numeroCasaAtual == 6) {
			this.numeroCasaAtual = 10;
			System.out.println("Avançou "+this.numeroCasaAtual+" casas" );
			this.coordenada.setX(250);
			this.coordenada.setY(240);
		}
		if(this.numeroCasaAtual == 1) {
			this.numeroCasaAtual = 5;
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
