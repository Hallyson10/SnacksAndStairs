package br.ufc.devopen.snacksandstairs.model;

import java.util.ArrayList;

import br.ufc.deveopen.snacksandstairs.dao.JogadoresDAO;
import br.ufc.devopen.snackandstairs.objetos.Jogador;

public class ModelJogador {
	private JogadoresDAO daoJogador;
	
	public ModelJogador() {
		daoJogador = new JogadoresDAO();
	}
	public boolean CadastrarJogador(Jogador jogador) {
		try {
			if(daoJogador.QuantidadeJogadores() < 4) {
				this.daoJogador.CadastrarJogador(jogador); 
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
		if(this.daoJogador.SelecionarJogador(jog)!= null) {
			return this.daoJogador.SelecionarJogador(jog);
		}else {
			return null;
		}
	}
	
	public int getQuantidadeJogadores() {
		return daoJogador.QuantidadeJogadores();
	}
	
	public ArrayList<Jogador> getJogadores(){
		return this.daoJogador.getJogadores();
	}
}
