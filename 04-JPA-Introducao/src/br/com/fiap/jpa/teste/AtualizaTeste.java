package br.com.fiap.jpa.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Escola;
import br.com.fiap.jpa.entity.Tipo;

public class AtualizaTeste {

	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Criar um objeto escola
		Escola escola = new Escola("Objetivo", "Av Paulista", 5000,
				3000, Calendar.getInstance(), null, Tipo.PARTICULAR);
		
		escola.setCodigo(1);
		
		//Atualizar no banco de dados
		em.merge(escola);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as parada
		em.close();
		fabrica.close();
	}
	
}