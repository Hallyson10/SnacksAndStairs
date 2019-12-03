package br.ufc.deveopen.snackandstairs.singleton;

import java.util.ArrayList;

import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaCobra;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaEscada;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaNormal;
import br.ufc.devopen.snackandstairs.objetos.Coordenada;

public class SingletonTabuleiro {
	private static SingletonTabuleiro uniqueInstance = null;
	private ArrayList<StrategyCasas> bd;
	
	private SingletonTabuleiro() {
		bd = new ArrayList<StrategyCasas>();
		StrategyCasas c1 = new StrategyConcretCasaCobra(0,23,45);
		this.bd.add(c1);
		StrategyCasas c2 = new StrategyConcretCasaEscada(6,26,49);
		this.bd.add(c2);
		StrategyCasas c3 = new StrategyConcretCasaCobra(5,29,95);
		this.bd.add(c3);
		StrategyCasas c4 = new StrategyConcretCasaNormal(1,30,60);
		this.bd.add(c4);
	}
	public static SingletonTabuleiro getInstanceSingletonTabuleiro() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonTabuleiro();
		}
		return uniqueInstance;
	}
	public StrategyCasas getCoordenada(int posicao) {
		for(int i = 0 ; i < bd.size(); i++) {
			if(bd.get(i).getNumeroCasaAtual() == posicao) {
				return bd.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<StrategyCasas> getBd() {
		return bd;
	}

	public void setBd(ArrayList<StrategyCasas> bd) {
		this.bd = bd;
	}

	@Override
	public String toString() {
		return "SingletonTabuleiro [bd=" + bd + "]";
	}
	
}
