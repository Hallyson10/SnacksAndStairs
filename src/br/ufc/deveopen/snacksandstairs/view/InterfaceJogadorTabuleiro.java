package br.ufc.deveopen.snacksandstairs.view;

import br.ufc.deveopen.snacksandstairs.controller.ControllerDado;
import br.ufc.deveopen.snacksandstairs.controller.ControllerJogador;
import br.ufc.deveopen.snacksandstairs.controller.ControllerJogo;


public class InterfaceJogadorTabuleiro {
	private ControllerJogador jogadores ;
	private ControllerDado dado;
	private ControllerJogo tabuleiro;
	
	public InterfaceJogadorTabuleiro() {
		jogadores = new ControllerJogador();
		dado = new ControllerDado();
		tabuleiro = new ControllerJogo();
		
	}
	public void IniciarJogo() {
		if(jogadores.getJogadores().size() == 0) {
			System.out.println("Ainda não tem jogadores");
			return;
		}
		for(int i = 0 ; i < jogadores.getQuantidadeJogadores();i++) {
			InterfaceDado InterDado = new InterfaceDado();
			int numDado = InterDado.jogarDado(jogadores.getJogadores().get(i));
			
			tabuleiro.AvancarCasas(jogadores.getJogadores().get(i), numDado);
		}
	}
	public void MostraJogadores() {
		jogadores.getJogadores().forEach(item->System.out.println(item));
	}
}
