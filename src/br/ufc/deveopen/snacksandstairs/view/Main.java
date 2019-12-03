package br.ufc.deveopen.snacksandstairs.view;
import jplay.Window;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufc.deveopen.snackandstairs.factory.FactoryCasas;
import br.ufc.deveopen.snackandstairs.singleton.SingletonJogadores;
import br.ufc.deveopen.snackandstairs.singleton.SingletonTabuleiro;
import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.deveopen.snackandstairs.strategy.StrategyCasasAbstract;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaCobra;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaEscada;
import br.ufc.deveopen.snacksandstairs.controller.ControllerDado;
import br.ufc.deveopen.snacksandstairs.controller.ControllerJogador;
import br.ufc.deveopen.snacksandstairs.dao.TabuleiroDAO;
import br.ufc.devopen.snackandstairs.objetos.Coordenada;
import br.ufc.devopen.snackandstairs.objetos.Dado;
import br.ufc.devopen.snackandstairs.objetos.Jogador;
import br.ufc.devopen.snacksandstairs.model.ModelJogo;
import jplay.GameImage;
import jplay.URL;
public class Main {

	public static void main(String[] args) {
		Interface inter = new Interface();
		inter.IniciarJog();
	}
}
