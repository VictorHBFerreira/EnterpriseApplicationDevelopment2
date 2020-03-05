package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.CidadeDao;
import br.com.fiap.jpa.entity.Cidade;

public class CidadeDaoImpl extends GenericDaoImpl<Cidade, Integer> implements CidadeDao{

	public CidadeDaoImpl(EntityManager em) {
		super(em);
	}

}
