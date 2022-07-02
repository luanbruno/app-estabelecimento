package br.edu.infnet.appestabelecimento.model.domain;

import java.util.List;


public class Estabelecimento extends Usuario{

	private String cnpj;
	private String endereco;
	private boolean edTech;
	private List<Funcionario> funcionarios;

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdTech() {
		return edTech;
	}
	public void setEdTech(boolean edTech) {
		this.edTech = edTech;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}