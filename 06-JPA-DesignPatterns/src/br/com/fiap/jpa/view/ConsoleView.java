package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.CidadeDao;
import br.com.fiap.jpa.dao.impl.CidadeDaoImpl;
import br.com.fiap.jpa.entity.Cidade;
import br.com.fiap.jpa.entity.Estado;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ConsoleView {
	
	public static void main(String[] args) {
		
		 EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		 EntityManager em = fabrica.createEntityManager();
		 
		 //Cadastrar uma cidade
		 Cidade cidade = new Cidade("Bauru", Estado.SP);
		 
		 //Criar o dao para cadastrar a cidade
		 CidadeDao dao = new CidadeDaoImpl(em);
		 
		 //Cadastrar cidade
		 dao.cadastrar(cidade);
		 
		 //Commit
		 try {
			 dao.commit();
			 System.out.println("Cidade cadastrada!");
		 }catch(CommitException e) {
			 System.err.println(e.getMessage());
		 }
		
		 
		 em.close();
		 fabrica.close();
	}

}
