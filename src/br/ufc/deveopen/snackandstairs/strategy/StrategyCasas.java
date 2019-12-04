package br.ufc.deveopen.snackandstairs.strategy;

import br.ufc.deveopen.snackandstairs.objetos.Coordenada;

public abstract interface StrategyCasas {
	public abstract void setCoordenadaAndar(int numero);
	public abstract Coordenada getCoordenadaAtual();
	public abstract int getNumeroCasaAtual();
}
