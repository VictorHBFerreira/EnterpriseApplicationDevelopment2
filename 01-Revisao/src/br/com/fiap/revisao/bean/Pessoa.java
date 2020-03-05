package br.com.fiap.revisao.bean;

/**
 * Classe abstrata -> não pode instanciar, serve para ser herdada 
 * pode ter métodos abstratos -> método sem implementação
 */
public abstract class Pessoa {

	/**
	 * Modificadores de acesso:
	 * public -> todos
	 * private -> só a classe
	 * protected -> classes filhas, classes no mesmo pacote
	 * default/package -> classes no mesmo pacote
	 */
	private Genero genero;
	
	private String nome;
	
	private int sapato;
	
	/**
	 * Construtores 
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Métodos
	 */
	public abstract void pular();
	
	public void dancar() {
		
	}
	
	/**
	 * Sobrecarga de método: método com parâmetros diferentes 
	 */
	public void dancar(String musica) {
		
	}
	
	/**
	 * Encapsulamento
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getSapato() {
		return sapato;
	}
	
	public void setSapato(int sapato) {
		this.sapato = sapato;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}





