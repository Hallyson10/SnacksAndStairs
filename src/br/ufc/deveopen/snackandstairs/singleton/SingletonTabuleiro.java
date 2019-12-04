package br.ufc.deveopen.snackandstairs.singleton;

import java.util.ArrayList;

import br.ufc.deveopen.snackandstairs.strategy.StrategyCasas;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaCobra;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaEscada;
import br.ufc.deveopen.snackandstairs.strategy.StrategyConcretCasaNormal;
import br.ufc.deveopen.snackandstairs.objetos.Coordenada;

public class SingletonTabuleiro {
	private static SingletonTabuleiro uniqueInstance = null;
	private ArrayList<StrategyCasas> bd;
	
	private SingletonTabuleiro() {
		bd = new ArrayList<StrategyCasas>();
		StrategyCasas c1 = new StrategyConcretCasaCobra(1,23,45);
		this.bd.add(c1);
		StrategyCasas c2 = new StrategyConcretCasaEscada(2,26,49);
		this.bd.add(c2);
		StrategyCasas c3 = new StrategyConcretCasaCobra(3,29,95);
		this.bd.add(c3);
		StrategyCasas c4 = new StrategyConcretCasaNormal(4,30,60);
		this.bd.add(c4);
		StrategyCasas c5 = new StrategyConcretCasaNormal(5,30,60);
		this.bd.add(c5);
		StrategyCasas c6 = new StrategyConcretCasaNormal(6,30,60);
		this.bd.add(c6);
		StrategyCasas c7 = new StrategyConcretCasaNormal(7,30,60);
		this.bd.add(c7);
		StrategyCasas c8 = new StrategyConcretCasaNormal(8,30,60);
		this.bd.add(c8);
		StrategyCasas c9 = new StrategyConcretCasaNormal(9,30,60);
		this.bd.add(c9);
		StrategyCasas c10 = new StrategyConcretCasaNormal(10,30,60);
		this.bd.add(c10);
		StrategyCasas c11 = new StrategyConcretCasaNormal(11,30,60);
		this.bd.add(c11);
		StrategyCasas c12 = new StrategyConcretCasaNormal(12,30,60);
		this.bd.add(c12);
		StrategyCasas c13 = new StrategyConcretCasaNormal(13,30,60);
		this.bd.add(c13);
		StrategyCasas c14 = new StrategyConcretCasaNormal(14,30,60);
		this.bd.add(c14);
		StrategyCasas c15 = new StrategyConcretCasaNormal(15,30,60);
		this.bd.add(c15);
		StrategyCasas c16 = new StrategyConcretCasaNormal(16,30,60);
		this.bd.add(c16);
		StrategyCasas c17 = new StrategyConcretCasaNormal(17,30,60);
		this.bd.add(c17);
		StrategyCasas c18 = new StrategyConcretCasaNormal(18,30,60);
		this.bd.add(c18);
		StrategyCasas c19 = new StrategyConcretCasaNormal(19,30,60);
		this.bd.add(c19);
		StrategyCasas c20 = new StrategyConcretCasaNormal(20,30,60);
		this.bd.add(c20);
		StrategyCasas c21 = new StrategyConcretCasaNormal(21,30,60);
		this.bd.add(c21);
		StrategyCasas c22 = new StrategyConcretCasaNormal(22,30,60);
		this.bd.add(c22);
		StrategyCasas c23 = new StrategyConcretCasaNormal(23,30,60);
		this.bd.add(c23);
		StrategyCasas c24 = new StrategyConcretCasaNormal(24,30,60);
		this.bd.add(c24);
		StrategyCasas c25 = new StrategyConcretCasaNormal(25,30,60);
		this.bd.add(c25);
		StrategyCasas c26 = new StrategyConcretCasaNormal(26,30,60);
		this.bd.add(c26);
		StrategyCasas c27 = new StrategyConcretCasaNormal(27,30,60);
		this.bd.add(c27);
		StrategyCasas c28 = new StrategyConcretCasaNormal(28,30,60);
		this.bd.add(c28);
		StrategyCasas c29 = new StrategyConcretCasaNormal(29,30,60);
		this.bd.add(c29);
		StrategyCasas c30 = new StrategyConcretCasaNormal(30,30,60);
		this.bd.add(c30);
		StrategyCasas c31 = new StrategyConcretCasaNormal(31,30,60);
		this.bd.add(c31);
		StrategyCasas c32 = new StrategyConcretCasaNormal(32,30,60);
		this.bd.add(c32);
		StrategyCasas c33 = new StrategyConcretCasaNormal(33,30,60);
		this.bd.add(c33);
		StrategyCasas c34 = new StrategyConcretCasaNormal(34,30,60);
		this.bd.add(c34);
		StrategyCasas c35 = new StrategyConcretCasaNormal(35,30,60);
		this.bd.add(c35);
		StrategyCasas c36 = new StrategyConcretCasaNormal(36,30,60);
		this.bd.add(c36);
		StrategyCasas c37 = new StrategyConcretCasaNormal(37,30,60);
		this.bd.add(c37);
		StrategyCasas c38 = new StrategyConcretCasaNormal(38,30,60);
		this.bd.add(c38);
		StrategyCasas c39 = new StrategyConcretCasaNormal(39,30,60);
		this.bd.add(c39);
		StrategyCasas c40 = new StrategyConcretCasaNormal(40,30,60);
		this.bd.add(c40);
		StrategyCasas c41 = new StrategyConcretCasaNormal(41,30,60);
		this.bd.add(c41);
		StrategyCasas c42 = new StrategyConcretCasaNormal(42,30,60);
		this.bd.add(c42);
		StrategyCasas c43 = new StrategyConcretCasaNormal(43,30,60);
		this.bd.add(c43);
		StrategyCasas c44 = new StrategyConcretCasaNormal(44,30,60);
		this.bd.add(c44);
		StrategyCasas c45 = new StrategyConcretCasaNormal(45,30,60);
		this.bd.add(c45);
		StrategyCasas c46 = new StrategyConcretCasaNormal(46,30,60);
		this.bd.add(c46);
		StrategyCasas c47= new StrategyConcretCasaNormal(47,30,60);
		this.bd.add(c47);
		StrategyCasas c48 = new StrategyConcretCasaNormal(48,30,60);
		this.bd.add(c48);
		StrategyCasas c49 = new StrategyConcretCasaNormal(49,30,60);
		this.bd.add(c49);
		StrategyCasas c50 = new StrategyConcretCasaNormal(50,30,60);
		this.bd.add(c50);
		StrategyCasas c51 = new StrategyConcretCasaNormal(51,30,60);
		this.bd.add(c51);
		StrategyCasas c52 = new StrategyConcretCasaNormal(52,30,60);
		this.bd.add(c52);
		StrategyCasas c53 = new StrategyConcretCasaNormal(53,30,60);
		this.bd.add(c53);
		StrategyCasas c54 = new StrategyConcretCasaNormal(54,30,60);
		this.bd.add(c54);
		StrategyCasas c55 = new StrategyConcretCasaNormal(55,30,60);
		this.bd.add(c55);
		StrategyCasas c56 = new StrategyConcretCasaNormal(56,30,60);
		this.bd.add(c56);
		StrategyCasas c57 = new StrategyConcretCasaNormal(57,30,60);
		this.bd.add(c57);
		StrategyCasas c58 = new StrategyConcretCasaNormal(58,30,60);
		this.bd.add(c58);
		StrategyCasas c59 = new StrategyConcretCasaNormal(59,30,60);
		this.bd.add(c59);
		StrategyCasas c60 = new StrategyConcretCasaNormal(60,30,60);
		this.bd.add(c60);
		StrategyCasas c61 = new StrategyConcretCasaNormal(61,30,60);
		this.bd.add(c61);
		StrategyCasas c62 = new StrategyConcretCasaNormal(62,30,60);
		this.bd.add(c62);
		StrategyCasas c63 = new StrategyConcretCasaNormal(63,30,60);
		this.bd.add(c63);
		StrategyCasas c64 = new StrategyConcretCasaNormal(64,30,60);
		this.bd.add(c64);
		StrategyCasas c65 = new StrategyConcretCasaNormal(65,30,60);
		this.bd.add(c65);
		StrategyCasas c66 = new StrategyConcretCasaNormal(66,30,60);
		this.bd.add(c66);
		StrategyCasas c67 = new StrategyConcretCasaNormal(67,30,60);
		this.bd.add(c67);
		StrategyCasas c68 = new StrategyConcretCasaNormal(68,30,60);
		this.bd.add(c68);
		StrategyCasas c69 = new StrategyConcretCasaNormal(69,30,60);
		this.bd.add(c69);
		StrategyCasas c70 = new StrategyConcretCasaNormal(70,30,60);
		this.bd.add(c70);
		StrategyCasas c71= new StrategyConcretCasaNormal(71,30,60);
		this.bd.add(c71);
		StrategyCasas c72 = new StrategyConcretCasaNormal(72,30,60);
		this.bd.add(c72);
		StrategyCasas c73 = new StrategyConcretCasaNormal(73,30,60);
		this.bd.add(c73);
		StrategyCasas c74 = new StrategyConcretCasaNormal(74,30,60);
		this.bd.add(c74);
		StrategyCasas c75 = new StrategyConcretCasaNormal(75,30,60);
		this.bd.add(c75);
		StrategyCasas c76 = new StrategyConcretCasaNormal(76,30,60);
		this.bd.add(c76);
		StrategyCasas c77 = new StrategyConcretCasaNormal(77,30,60);
		this.bd.add(c77);
		StrategyCasas c78 = new StrategyConcretCasaNormal(78,30,60);
		this.bd.add(c78);
		StrategyCasas c79 = new StrategyConcretCasaNormal(79,30,60);
		this.bd.add(c4);
		StrategyCasas c80 = new StrategyConcretCasaNormal(80,30,60);
		this.bd.add(c80);
		StrategyCasas c81 = new StrategyConcretCasaNormal(81,30,60);
		this.bd.add(c4);
		StrategyCasas c82 = new StrategyConcretCasaNormal(82,30,60);
		this.bd.add(c82);
		StrategyCasas c83 = new StrategyConcretCasaNormal(83,30,60);
		this.bd.add(c83);
		StrategyCasas c84 = new StrategyConcretCasaNormal(84,30,60);
		this.bd.add(c84);
		StrategyCasas c85 = new StrategyConcretCasaNormal(85,30,60);
		this.bd.add(c85);
		StrategyCasas c86 = new StrategyConcretCasaNormal(86,30,60);
		this.bd.add(c86);
		StrategyCasas c87 = new StrategyConcretCasaNormal(87,30,60);
		this.bd.add(c87);
		StrategyCasas c88 = new StrategyConcretCasaNormal(88,30,60);
		this.bd.add(c88);
		StrategyCasas c89 = new StrategyConcretCasaNormal(89,30,60);
		this.bd.add(c89);
		StrategyCasas c90 = new StrategyConcretCasaNormal(90,30,60);
		this.bd.add(c90);
		StrategyCasas c91 = new StrategyConcretCasaNormal(91,30,60);
		this.bd.add(c91);
		StrategyCasas c92 = new StrategyConcretCasaNormal(92,30,60);
		this.bd.add(c92);
		StrategyCasas c93 = new StrategyConcretCasaNormal(93,30,60);
		this.bd.add(c93);
		StrategyCasas c94 = new StrategyConcretCasaNormal(94,30,60);
		this.bd.add(c94);
		StrategyCasas c95 = new StrategyConcretCasaNormal(95,30,60);
		this.bd.add(c95);
		StrategyCasas c96 = new StrategyConcretCasaNormal(96,30,60);
		this.bd.add(c96);
		StrategyCasas c97 = new StrategyConcretCasaNormal(97,30,60);
		this.bd.add(c97);
		StrategyCasas c98 = new StrategyConcretCasaNormal(98,30,60);
		this.bd.add(c98);
		StrategyCasas c99 = new StrategyConcretCasaNormal(99,30,60);
		this.bd.add(c99);
		StrategyCasas c100 = new StrategyConcretCasaNormal(100,30,60);
		this.bd.add(c100);
		
	}
	public static SingletonTabuleiro getInstanceSingletonTabuleiro() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonTabuleiro();
		}
		return uniqueInstance;
	}
	public StrategyCasas getCoordenada(int posicao) {
		for(int i = 0 ; i < bd.size(); i++) {
			if(bd.get(i).getNumeroCasaAtual() == posicao) {
				return bd.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<StrategyCasas> getBd() {
		return bd;
	}

	public void setBd(ArrayList<StrategyCasas> bd) {
		this.bd = bd;
	}

	@Override
	public String toString() {
		return "SingletonTabuleiro [bd=" + bd + "]";
	}
	
}
