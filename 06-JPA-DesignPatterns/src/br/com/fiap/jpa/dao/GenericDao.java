package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;

public interface GenericDao<T, K> {
	
	void cadastrar(T entity);
	void atualizar(T entity);
	T ler(K id);
	void deletar(K id) throws KeyNotFoundException;
	void commit() throws CommitException;
	
}
