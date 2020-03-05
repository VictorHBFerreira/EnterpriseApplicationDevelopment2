package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_ESCOLA")
//sequenceName -> nome da sequence no banco de dados
//name -> nome no java (utilizado no @GeneratedValue)
//allocationSize -> incremento 
@SequenceGenerator(sequenceName = "SQ_TB_ESCOLA", name = "escola", allocationSize = 1)
public class Escola {

	@Id
	@Column(name = "cd_escola")
	@GeneratedValue(generator = "escola", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_escola", nullable = false, length = 200)
	private String nome;

	@Column(name = "ds_endereco")
	private String endereco;

	@Column(name = "qt_alunos")
	private int quantidadeAlunos;

	@Column(name = "vl_matricula")
	private double preco;

	// Atributo que não será uma coluna na tabela
	@Transient
	private double faturamentoMatricula;

	@Column(name = "dt_inicio")
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;

	// Gravar uma imagem no banco
	@Lob // mapea um campo do tipo BLOB no oracle
	@Column(name = "fl_logo")
	private byte[] logo;

	// Grava o texto da enum e não a posição
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_tipo")
	private Tipo tipo;

	public Escola() {
		super();
	}
	
	public Escola(String nome, String endereco, int quantidadeAlunos, double preco, Calendar dataInicio, byte[] logo,
			Tipo tipo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.quantidadeAlunos = quantidadeAlunos;
		this.preco = preco;
		this.dataInicio = dataInicio;
		this.logo = logo;
		this.tipo = tipo;
	}
	
	//método que será executado após a pesquisa no banco
	@PostLoad
	public void carregar() {
		System.out.println("Método acionado após a pesquisa no bd");
		faturamentoMatricula = preco * quantidadeAlunos;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getFaturamentoMatricula() {
		return faturamentoMatricula;
	}

	public void setFaturamentoMatricula(double faturamentoMatricula) {
		this.faturamentoMatricula = faturamentoMatricula;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
