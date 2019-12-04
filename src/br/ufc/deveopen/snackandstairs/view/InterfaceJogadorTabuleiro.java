package br.ufc.deveopen.snackandstairs.view;

import br.ufc.deveopen.snackandstairs.controller.ControllerCoordenada;
import br.ufc.deveopen.snackandstairs.controller.ControllerDado;
import br.ufc.deveopen.snackandstairs.controller.ControllerJogador;
import br.ufc.deveopen.snackandstairs.controller.ControllerJogo;
import br.ufc.deveopen.snackandstairs.controller.ControllerTabuleiro;


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
		while(tabuleiro.VerificarVencedor()) {
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
		
	}
	public void MostraJogadores() {
		jogadores.getJogadores().forEach(item->System.out.println(item));
	}
}
