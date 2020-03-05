package br.com.fiap.jpa.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Filme;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.DadoNaoEncontradoException;

public class FilmeDaoImpl implements FilmeDao {

	private EntityManager em;
	
	//Construtor que recebe o entity manager
	public FilmeDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void cadastrar(Filme filme) {
		em.persist(filme);
	}

	@Override
	public Filme ler(int chave) {
		return em.find(Filme.class, chave);
	}

	@Override
	public void atualizar(Filme filme) {
		em.merge(filme);
	}

	@Override
	public void deletar(int chave) throws DadoNaoEncontradoException {
		Filme filme = em.find(Filme.class, chave);
		//valida se encontrou o filme para remover
		if (filme == null)
			throw new DadoNaoEncontradoException();
		em.remove(filme);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}
