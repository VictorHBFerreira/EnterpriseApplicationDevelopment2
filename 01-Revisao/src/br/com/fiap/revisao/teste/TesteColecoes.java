package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.revisao.bean.Bailarino;

public class TesteColecoes {

	public static void main(String[] args) {
		//Lista de bailarino
		List<Bailarino> bailarinos = new ArrayList<Bailarino>();
		//Adiciona valores na lista		
		bailarinos.add(new Bailarino("Thiago"));
		bailarinos.add(new Bailarino("Bruna"));
		
		//Exibir os bailarinos da lista
		for (Bailarino item : bailarinos) {
			System.out.println(item.getNome());
		}
		
		//Mapa de bailarinos
		Map<Integer,Bailarino> mapa = new HashMap<Integer, Bailarino>();
		mapa.put(123, new Bailarino("Thais"));
		mapa.put(4, new Bailarino("Lucas"));
		
		//Recuperar um bailarino do mapa
		Bailarino b = mapa.get(4);
		System.out.println(b.getNome());	
		
	}
	
}






