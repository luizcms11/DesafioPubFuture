package br.com.pubf.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Receitas extends Model {
	
	@NotNull
	private Double recebimento;
	
	private String datareceb;
	
	private String datarecebesperado;
	
	private String descricao;
	
	@NotEmpty
	private String fin;
	
	@NotEmpty
	private String conta;
	
	@NotEmpty
	private String tiporeceita;

	public Double getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Double recebimento) {
		this.recebimento = recebimento;
	}

	public String getDatareceb() {
		return datareceb;
	}

	public void setDatareceb(String datareceb) {
		this.datareceb = datareceb;
	}

	public String getDatarecebesperado() {
		return datarecebesperado;
	}

	public void setDatarecebesperado(String datarecebesperado) {
		this.datarecebesperado = datarecebesperado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getTiporeceita() {
		return tiporeceita;
	}

	public void setTiporeceita(String tiporeceita) {
		this.tiporeceita = tiporeceita;
	}
	
	
	

}
