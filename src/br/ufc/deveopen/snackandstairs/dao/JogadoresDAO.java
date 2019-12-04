package br.ufc.deveopen.snackandstairs.dao;

import java.util.ArrayList;

import br.ufc.deveopen.snackandstairs.singleton.SingletonJogadores;
import br.ufc.deveopen.snackandstairs.objetos.Jogador;

public class JogadoresDAO {
	private static SingletonJogadores uniqueInstance = null;
	private SingletonJogadores jogadores;
	private ArrayList<Jogador> bd;
	
	public JogadoresDAO() {
		this.jogadores = this.jogadores.getInstanceSingletonJogador();
	}
	
	public boolean CadastrarJogador(Jogador jogador) {
		if(jogadores.QuantidadeJogadores() <= 4) {
			jogadores.CadastrarJogador(jogador);
			System.out.println(jogador.getNome() + " Cadastrado com sucesso!");
		}else {
			System.out.println("Quantidade de jogadores não permitida!");
		}
		return false;
	}
	
	public Jogador SelecionarJogador(Jogador jog) {
		if(jogadores.getJogadores(jog.getID()) != null) {
			return jogadores.getJogadores(jog.getID());
		}else {
			return null;
		}
	}
	public ArrayList<Jogador> getJogadores(){
		return jogadores.ListarJogadores();
	}
	public int QuantidadeJogadores() {
		return jogadores.QuantidadeJogadores();
	}
}
