package br.ufc.deveopen.snackandstairs.factory;

import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.devopen.snackandstairs.objetos.Coordenada;

public class FactoryCasas {
	
	public void setInstance(StrategyCasas casaAtual,int posicao) {
		//System.out.println(casaAtual.getClass().getSimpleName());
		casaAtual.setCoordenadaAndar(posicao);
	}
	public Coordenada getInstance(StrategyCasas casaAtual) {
		return casaAtual.getCoordenadaAtual();
	}
	public int posicaoAtual(StrategyCasas casaAtual) {
		return casaAtual.getNumeroCasaAtual();
	}

}
