package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Escola;

public class PesquisaTeste {

	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar uma escola
		Escola escola = em.find(Escola.class, 21);
		
		//Exibir os dados da escola
		System.out.println(escola.getNome());
		System.out.println(escola.getFaturamentoMatricula());
		
		//Alterar o valor de uma propriedade
		escola.setNome("Copi");
		
		//Fazer o commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}




