package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.DadoNaoEncontradoException;

public class VeiculoDaoImpl implements VeiculoDao{

	private EntityManager em;
	
	public VeiculoDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void cadastrar(Veiculo veiculo) {
		em.persist(veiculo);
		
	}

	@Override
	public void atualizar(Veiculo veiculo) {
		em.merge(veiculo);
		
	}

	@Override
	public Veiculo ler(int chave) {		
		return em.find(Veiculo.class, chave);
	}

	@Override
	public void deletar(int chave) throws DadoNaoEncontradoException {
		Veiculo veiculo = em.find(Veiculo.class, chave);
		if(veiculo == null)
			throw new DadoNaoEncontradoException();
		em.remove(veiculo);
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
