package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Escola;

public class RefreshTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar a escola de código 1
		Escola escola = em.find(Escola.class, 1);
		
		//Exibir o nome da escola
		System.out.println(escola.getNome());
		
		//Setar no objeto o nome da escola
		escola.setNome("FIAP School");
		
		//Exibir o nome da escola
		System.out.println(escola.getNome());
		
		//Realizar o refresh
		em.refresh(escola);
		
		//Exibir o nome da escola
		System.out.println(escola.getNome());
		
		em.close();
		fabrica.close();
	}
	
}