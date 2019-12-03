package br.ufc.deveopen.snacksandstairs.view;

import java.util.Scanner;

import br.ufc.deveopen.snacksandstairs.controller.ControllerJogador;
import br.ufc.devopen.snackandstairs.objetos.Jogador;

public class InterfaceCadastro {
		private ControllerJogador controller;
		public InterfaceCadastro() {
			controller = new ControllerJogador();
		}
		public boolean CadastrarJogador() {
			 Scanner s = new Scanner(System.in);
			 String nome;
			 int numero;
			 System.out.println("Quantos jogadores irão jogar?");
			 numero = s.nextInt();
			 for(int i = 1 ;i <= numero;i++) {
				 System.out.println("Digite o nome do jogador "+ i);
				 nome = s.next();
				 Jogador jogador = new Jogador(nome);
				 controller.CadastrarJogador(jogador);
			 }
			 controller.getJogadores().forEach(item->System.out.println(item));
			 return true;
		}
		
}
