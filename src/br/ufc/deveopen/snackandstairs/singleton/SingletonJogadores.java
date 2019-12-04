package br.ufc.deveopen.snackandstairs.singleton;

import java.util.ArrayList;

import br.ufc.deveopen.snackandstairs.objetos.Jogador;

public class SingletonJogadores {
	private static SingletonJogadores uniqueInstance = null;
	private ArrayList<Jogador> bd;
	
	private SingletonJogadores() {
		bd = new ArrayList<Jogador>();
	}
	
	public void CadastrarJogador(Jogador jog) {
		bd.add(jog);
	}
	public int QuantidadeJogadores() {
		return bd.size();
	}
	public Jogador getJogadores(int id) {
		for(int i = 0; i < bd.size();i++) {
			if(bd.get(i).getID() == id) {
				return bd.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Jogador> ListarJogadores(){
		return bd;
	}
	
	public static SingletonJogadores getInstanceSingletonJogador() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonJogadores();
		}
		return uniqueInstance;
	}

	@Override
	public String toString() {
		return "SingletonJogadores [bd=" + bd + "]";
	}
	
}
