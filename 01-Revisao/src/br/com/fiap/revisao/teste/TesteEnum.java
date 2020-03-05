package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Bailarino;
import br.com.fiap.revisao.bean.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		//Instanciar um bailarino
		Bailarino bailarino = new Bailarino("Robson");
		//Atribuir um valor para o genero
		bailarino.setGenero(Genero.OUTROS);
		
		//Validar se o genero é outros
		if (bailarino.getGenero() == Genero.OUTROS) {
			System.out.println("Entrou no if");
		}
		
	}
	
}





