package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Filme;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.DadoNaoEncontradoException;

public interface FilmeDao {

	void cadastrar(Filme filme);
	
	Filme ler(int chave);
	
	void atualizar(Filme filme);
	
	void deletar(int chave) throws DadoNaoEncontradoException;
	
	void commit() throws CommitException;
	
}

