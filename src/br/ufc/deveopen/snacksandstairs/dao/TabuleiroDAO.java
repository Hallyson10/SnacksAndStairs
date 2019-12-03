package br.ufc.deveopen.snacksandstairs.dao;

import java.util.ArrayList;

import br.ufc.deveopen.snackandstairs.singleton.SingletonJogadores;
import br.ufc.deveopen.snackandstairs.singleton.SingletonTabuleiro;
import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.devopen.snackandstairs.objetos.Coordenada;
public class TabuleiroDAO {
	private SingletonTabuleiro tabuleiro;
	
	
	public TabuleiroDAO() {
		this.tabuleiro = this.tabuleiro.getInstanceSingletonTabuleiro();
	}
	
	public ArrayList<StrategyCasas> CriarTabuleiro() {
		System.out.println("tabuleiro criado com sucesso!");
		return tabuleiro.getBd();
	}
	public StrategyCasas getCoordenada(int posicao) {
		return tabuleiro.getCoordenada(posicao);
	}
}
