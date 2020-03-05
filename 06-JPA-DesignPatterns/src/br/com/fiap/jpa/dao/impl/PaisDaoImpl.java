package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.PaisDao;
import br.com.fiap.jpa.entity.Pais;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;

public class PaisDaoImpl extends GenericDaoImpl<Pais, Integer> implements PaisDao{

	public PaisDaoImpl(EntityManager em) {
		super(em);
	}
	
}
