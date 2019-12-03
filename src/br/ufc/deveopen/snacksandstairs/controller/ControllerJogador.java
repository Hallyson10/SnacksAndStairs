package br.ufc.deveopen.snacksandstairs.controller;

import java.util.ArrayList;

import br.ufc.devopen.snackandstairs.objetos.Jogador;
import br.ufc.devopen.snacksandstairs.model.ModelJogador;

public class ControllerJogador {
	private ModelJogador modelJog;
	public ControllerJogador() {
		this.modelJog = new ModelJogador();
	}
	public boolean CadastrarJogador(Jogador jogador) {
		try {
			if(this.modelJog.CadastrarJogador(jogador)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
		
	}
	
	public Jogador SelecionarJogador(Jogador jog) {
		if(this.modelJog.SelecionarJogador(jog)!= null) {
			return this.modelJog.SelecionarJogador(jog);
		}
		return null;
	}
	public int getQuantidadeJogadores() {
		return modelJog.getQuantidadeJogadores();
	}
	
	public ArrayList<Jogador> getJogadores(){
		return this.modelJog.getJogadores();
	}
}
