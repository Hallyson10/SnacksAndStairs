package br.ufc.deveopen.snackandstairs.controller;

import br.ufc.deveopen.snackandstairs.objetos.Jogador;
import br.ufc.deveopen.snackandstairs.model.ModelJogo;

public class ControllerJogo {
	//iniciar jogo
	//avançar casas
	//voltar casas
	//vencedorjogo
	//lançar dado //dado do tipo da classe dado que apenas retorna um número random
	//selecionar o primeiro jogador a jogar : todos jogam o dado um por vez e guarda o número de cada um,
	// armazena
	private ModelJogo modelJogo;
	
	public ControllerJogo() {
		 modelJogo = new ModelJogo();
	}
	
	
	public void AvancarCasas(Jogador jog, int numeroDado) {
		modelJogo.AvancarCasas(jog,numeroDado);
	}
	
	public boolean VerificarVencedor() {
		return modelJogo.VerificaVencedor();
	}
	public void SairJogo() {
		
	}
	
}
