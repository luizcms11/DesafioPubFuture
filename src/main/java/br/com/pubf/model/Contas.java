package br.com.pubf.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Contas extends Model {

	@NotNull
	private Double saldo;
	
	
	@NotEmpty
	private String fin;
	
	@NotEmpty
	private String conta;


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public String getFin() {
		return fin;
	}


	public void setFin(String fin) {
		this.fin = fin;
	}
	
	

	


	
	
	}
	
	

