package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome = "TB_PADARIA")
public class Padaria {
	
	@Coluna(nome="nm_razao_social")
	private String razaoSocial;
	
	@Coluna(nome="nr_cnpj", unique = true)
	private long cnpj;
	
	@Coluna(nome="ds_endereco")
	private String endereco;
	
	@Coluna(nome="qt_funcionario")
	private int funcionarios;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}