package br.com.fiap.teste;

import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Padaria;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar os objetos (aluno, padaria e rm)
		Aluno aluno = new Aluno();
		Padaria padaria = new Padaria();
		Orm orm = new Orm();
		
		//Exibir os SQL gerados
		System.out.println(orm.gerarSql(aluno));
		System.out.println(orm.gerarSql(padaria));
		
	}
	
}





