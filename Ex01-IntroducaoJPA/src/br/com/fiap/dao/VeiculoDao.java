package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.DadoNaoEncontradoException;

public interface VeiculoDao {
	
	void cadastrar(Veiculo veiculo);
	
	void atualizar(Veiculo veiculo);
	
	Veiculo ler(int chave);
	
	void deletar(int chave) throws DadoNaoEncontradoException;
	
	void commit() throws CommitException;

}
