package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Padaria;

public class Teste {

	public static void main(String[] args) {
		
		Padaria p = new Padaria();
		//Recuperar as informa��es da classe		
		//Recuperar os atributos da classe Padaria
		Field[] atributos = p.getClass().getDeclaredFields();
		for (Field f : atributos) {
			//Recuperar a anota��o @Coluna
			Coluna anotacao = f.getAnnotation(Coluna.class);
			//Exibir o nome dos atributos
			System.out.println(f.getName() + " - " + 
				anotacao.nome() + " Unique: " + anotacao.unique());
		}
		
		//Recuperar os m�todos da classe Padaria
		Method[] metodos = p.getClass().getDeclaredMethods();
		for (Method m : metodos) {
			//Exibir o nome dos m�todos
			System.out.println(m.getName());
		}
		
	}
}

