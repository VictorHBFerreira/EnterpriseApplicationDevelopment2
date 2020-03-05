package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CIDADE")
@SequenceGenerator(name="cidade", sequenceName = "SQ_TB_CIDADE", allocationSize = 1)
public class Cidade {

	@Id
	@GeneratedValue(generator = "cidade", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_cidade")
	private int codigo;
	@Column(name="nm_cidade")
	private String nome;
	@Enumerated
	@Column(name="ds_estado")
	private Estado estado;
	
	
	public Cidade() {
		super();
	}
	public Cidade(String nome, Estado estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
