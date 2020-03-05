package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Motorista;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.DadoNaoEncontradoException;

public class MotoristaDaoImpl implements MotoristaDao {

	private EntityManager em;
	
	public MotoristaDaoImpl(EntityManager em) {
		this.em = em;
	}
	@Override
	public void cadastrar(Motorista motorista) {		
		em.persist(motorista);
	}

	@Override
	public void atualizar(Motorista motorista) {		
		em.merge(motorista);
	}

	@Override
	public Motorista ler(int chave) {
		return em.find(Motorista.class, chave);
	}

	@Override
	public void deletar(int chave) throws DadoNaoEncontradoException {
		Motorista motorista = em.find(Motorista.class, chave);
			if (motorista == null)
				throw new DadoNaoEncontradoException();
			em.remove(motorista);
		
	}

	@Override
	public void commit() throws CommitException {
		try {
		em.getTransaction().begin();
		em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
			throw new CommitException();
			
		}
	}

}
