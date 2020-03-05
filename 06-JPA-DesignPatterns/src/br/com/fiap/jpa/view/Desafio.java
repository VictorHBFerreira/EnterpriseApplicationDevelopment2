package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Desafio {
	
	 EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
	 EntityManager em = fabrica.createEntityManager();
	 
	 

}
