package br.com.fiap.revisao.bean;

public class Bailarino extends Pessoa {
	
	/**
	 * Constante
	 */
	public static final int IDADE_MINIMA = 18;

	/**
	 * Construtor
	 */
	public Bailarino(String nome) {
		super(nome);
	}
	
	/**
	 * Polimorfismo: várias formas
	 * Sobrescrita do método: mesmo método na classe filha
	 */
	@Override
	public void dancar() {
		
	}

	@Override
	public void pular() {
		
	}
	
}