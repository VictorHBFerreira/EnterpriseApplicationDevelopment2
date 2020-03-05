package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	//Recebe um objeto e retorna no select
	public String gerarSql(Object o) {
		//Recuperar a anota��o @Tabela
		Tabela anotacao = o.getClass().getAnnotation(Tabela.class);
		return "SELECT * FROM " + anotacao.nome();
	}
	
}