package br.com.fiap.view;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Veiculo;

public class ConsoleView {
	
	public static void main(String[] args) throws Exception {		
		
		Scanner scan = new Scanner(System.in);
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		
		//Cria Objeto Veiculo
		Veiculo veiculo = new Veiculo("COE5983","Verde",1951);
		
		//Cadastro Veiculo		
		em.persist(veiculo);		
		em.getTransaction().begin();
		em.getTransaction().commit();
		/**
		
		//Atualiza Veiculo
		em.merge(veiculo);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Pesquisa Veiculo
		Veiculo pVeiculo = em.find(Veiculo.class, 1);
		System.out.println(pVeiculo.getPlaca());
		System.out.println(pVeiculo.getCor());
		System.out.println(pVeiculo.getAno());
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		//Deleta Veiculo
		Veiculo dVeiculo = em.find(Veiculo.class, 1);
		
		//Remove a escola
		em.remove(dVeiculo);
		
		//Faz commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		**/
		
		
		//Fechar tudo
		em.close();
		fabrica.close();
		scan.close();
	}
}
