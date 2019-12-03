package br.ufc.deveopen.snacksandstairs.view;

import java.util.Scanner;

import br.ufc.deveopen.snacksandstairs.controller.ControllerDado;
import br.ufc.devopen.snackandstairs.objetos.Jogador;

public class InterfaceDado {
	private ControllerDado controller;
	Scanner scan = new Scanner(System.in);
	
	public InterfaceDado() {
		controller = new ControllerDado();
	}
	
	public int jogarDado(Jogador jog) {
		System.out.println("Olá "+jog.getNome()+"é sua vez de jogar");
		int op = 0;
		System.out.println("Digite 1 para jogar o dado");
		op = scan.nextInt();
		if(op == 1) {
			int numeroDado = controller.getDado();
			System.out.println(numeroDado);
			return numeroDado;
		}
		return 0;
		
	}
}
