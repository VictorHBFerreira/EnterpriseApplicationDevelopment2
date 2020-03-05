package br.com.fiap.jpa.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Escola;
import br.com.fiap.jpa.entity.Tipo;

public class CadastroTeste {

	public static void main(String[] args) {
		//Criar a fabrica que cria o gerenciador de entidades
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("oracle");
		
		//Criar o gerenciador de entidades
		EntityManager em = fabrica.createEntityManager();

		//Criar um objeto escola
		Escola escola = new Escola("FIAP School", 
			"Av lins de vasconcelos, 1222", 2000, 2000, 
			Calendar.getInstance(), null, Tipo.PARTICULAR);
		
		//Cadastrar uma escola
		em.persist(escola);
		
		//Inicializa uma transação e faz o commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas
		em.close();
		fabrica.close();
		
	}
	
}



