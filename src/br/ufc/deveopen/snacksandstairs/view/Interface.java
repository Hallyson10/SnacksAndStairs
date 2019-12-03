package br.ufc.deveopen.snacksandstairs.view;

import java.util.Scanner;

public class Interface {
	Scanner scan = new Scanner(System.in);
	public Interface() {
		
	}

	public void IniciarJog() {
		int opcao = 0;
		boolean valida = true;
        while(valida) {
        	System.out.println("1 : Cadastrar Jogadores\n2 : Iniciar Jogo\n3 : Ver pontuações");
    		opcao = scan.nextInt();
    		if(opcao == 1) {
    			CadastrarJogador();
    		}else if(opcao == 2) {
    			Start();
    		}else {
    			valida = false;
    		}
        }
	}

	public void Start() {
		InterfaceJogadorTabuleiro tabuleiro = new InterfaceJogadorTabuleiro();
		tabuleiro.IniciarJogo();
	}

	public void CadastrarJogador() {
		InterfaceCadastro cadastro = new InterfaceCadastro();
		cadastro.CadastrarJogador();
	}

}
