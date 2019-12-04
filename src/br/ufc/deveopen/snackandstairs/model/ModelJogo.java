package br.ufc.deveopen.snackandstairs.model;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import br.ufc.deveopen.snackandstairs.factory.FactoryCasas;
import br.ufc.deveopen.snackandstairs.singleton.SingletonJogadores;
import br.ufc.deveopen.snackandstairs.singleton.SingletonTabuleiro;
import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.deveopen.snackandstairs.dao.JogadoresDAO;
import br.ufc.deveopen.snackandstairs.dao.TabuleiroDAO;
import br.ufc.deveopen.snackandstairs.objetos.Coordenada;
import br.ufc.deveopen.snackandstairs.objetos.Dado;
import br.ufc.deveopen.snackandstairs.objetos.Jogador;

public class ModelJogo {
	private JogadoresDAO jogadores ;
	private TabuleiroDAO tabuleiro ;
	private Dado dado ;
	FactoryCasas factoryCasas;
	
	public ModelJogo() {
		jogadores = new JogadoresDAO();
		tabuleiro = new TabuleiroDAO();
		dado = new Dado();
		factoryCasas = new FactoryCasas();
	}
	
	public int JogarDado() {
		return this.dado.geraNumero();
	}
	
	public boolean VerificaVencedor() {
		System.out.println("verificado");
		for(Jogador jogadorAtual : jogadores.getJogadores()) {
			
			System.out.println(jogadorAtual.getNumCasaTabuleiro()+"\n");
			System.out.println(jogadorAtual.getCoordenadaAtualNoTabuleiro());
			if(jogadorAtual.getNumCasaTabuleiro() == 100) {
				System.out.println(jogadorAtual.getNome() + "venceu!");
				return false;
			}
		}
		return true;
	}
	
	public void AvancarCasas(Jogador jogadorAtual,int numeroDado) {
		if(VerificaVencedor()) {
			if(jogadorAtual.getNumCasaTabuleiro() + numeroDado > 100) {
				System.out.println("você não pode andar pois o número ultrapassa a posição final");
			}else if(jogadorAtual.getNumCasaTabuleiro() + numeroDado < 100) {
				StrategyCasas casa = tabuleiro.getCoordenada(jogadorAtual.getNumCasaTabuleiro() + numeroDado);
				try {
					jogadorAtual.setNumCasaTabuleiro(numeroDado);
					factoryCasas.setInstance(casa, numeroDado);
					jogadorAtual.setCoordenadaAtualNoTabuleiro(factoryCasas.getInstance(casa));
				} catch (Exception e) {
				
				}
			}else if(jogadorAtual.getNumCasaTabuleiro() + numeroDado == 100) {
				StrategyCasas casa = tabuleiro.getCoordenada(jogadorAtual.getNumCasaTabuleiro() + numeroDado);
				factoryCasas.setInstance(casa, numeroDado);
				jogadorAtual.setCoordenadaAtualNoTabuleiro(factoryCasas.getInstance(casa));
				jogadorAtual.setNumCasaTabuleiro(factoryCasas.posicaoAtual(casa));
				System.out.println(jogadorAtual.getNome()+" você venceu " + "position = "+jogadorAtual.getNumCasaTabuleiro());
			}
		}
	}
	
	
	
	public void SairJogo() {
		
	}
	
}
