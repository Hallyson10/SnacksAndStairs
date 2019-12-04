package br.ufc.deveopen.snackandstairs.objetos;

public class Jogador {
	public static int ID = 0;
	private String nome;
	private int id;
	private int numCasaTabuleiro;
	private Coordenada coordenadaAtualNoTabuleiro;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.id = ID++;
		this.coordenadaAtualNoTabuleiro = new Coordenada(0,0);
		this.numCasaTabuleiro = 0;
	}
	
	public void LancarDado() {
		
	}
	
	public void AvancarCasas(int numCasas) {
		
	}

	public static int getID() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCasaTabuleiro() {
		return numCasaTabuleiro;
	}

	public void setNumCasaTabuleiro(int numCasaTabuleiro) {
		this.numCasaTabuleiro += numCasaTabuleiro;
	}

	public Coordenada getCoordenadaAtualNoTabuleiro() {
		return coordenadaAtualNoTabuleiro;
	}

	public void setCoordenadaAtualNoTabuleiro(Coordenada coordenadaAtualNoTabuleiro) {
		this.coordenadaAtualNoTabuleiro = coordenadaAtualNoTabuleiro;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", numCasaTabuleiro=" + numCasaTabuleiro + ", coordenadaAtualNoTabuleiro="
				+ coordenadaAtualNoTabuleiro + " : id "+id+"]";
	}
	
	
}
