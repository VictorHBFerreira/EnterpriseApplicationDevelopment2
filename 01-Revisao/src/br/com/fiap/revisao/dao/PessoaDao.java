package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Pessoa;

public interface PessoaDao {

	void cadastrar(Pessoa pessoa);
	
	void deletar(String nome);
	
}