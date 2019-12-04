package br.ufc.deveopen.snackandstairs.controller;

import br.ufc.deveopen.snackandstairs.objetos.Dado;


public class ControllerDado {
	//lançar dado e retorna um número entre 1 a 6
	private Dado dado;
	
	public ControllerDado() {
		dado = new Dado();
	}
	
	public int getDado() {
		return dado.geraNumero();
	}
}
