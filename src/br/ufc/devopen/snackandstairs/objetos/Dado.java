package br.ufc.devopen.snackandstairs.objetos;

import java.util.Random;

public class Dado {
	public int num = 1;
	private Random gerador; 
	
	public Dado() {
		this.gerador = new Random();
	}
	
	public int geraNumero() {
		System.out.println("girando dado...");
		return this.gerador.nextInt(6)+1;
	}
}
