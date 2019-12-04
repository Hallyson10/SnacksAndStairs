package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.deveopen.snackandstairs.objetos.Coordenada;

public class StrategyConcretCasaCobra extends StrategyCasasAbstract{
	private int numeroCasaAtual = 0;
	public Coordenada coordenada;
	
	public StrategyConcretCasaCobra(int numeroCasaAtual, double x, double y) {
		super(numeroCasaAtual, x, y);
		this.coordenada = new Coordenada(x, y);
		this.numeroCasaAtual = numeroCasaAtual;
	}

	public StrategyConcretCasaCobra() {
		super();
	}

	//@Override
	public void setCoordenadaAndar(int numero) {
		this.numeroCasaAtual = numero;
		System.out.println("eita você caiu na cabeça da cobra!");
	}

	//@Override
	public void setCoordenadaVoltar(int numero, double x, double y) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public Coordenada getCoordenadaAtual() {
		if(this.numeroCasaAtual == 5) {
			this.numeroCasaAtual = -3;
			this.coordenada.setX(300);
			this.coordenada.setY(200);
		}
		return this.coordenada;
	}

	//@Override
	public int getNumeroCasaAtual() {
		// TODO Auto-generated method stub
		return this.numeroCasaAtual;
	}

	@Override
	public String toString() {
		return "StrategyConcretCasaCobra [numeroCasaAtual=" + numeroCasaAtual + ", coordenada=" + coordenada + "]";
	}
	

}
