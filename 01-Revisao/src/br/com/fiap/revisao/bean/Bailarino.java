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
	 * Polimorfismo: v�rias formas
	 * Sobrescrita do m�todo: mesmo m�todo na classe filha
	 */
	@Override
	public void dancar() {
		
	}

	@Override
	public void pular() {
		
	}
	
}