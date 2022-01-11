package br.com.pubf.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.com.olimposistema.aipa.model.Model;

@Entity
public class Despesas extends Model{

	@NotNull
	private Double valordespesa;
	
	private String datapag;
	
	private String datapagesperado;
	
	private String tipodespesa;
	
	private String fin;
	
	private String conta;

	public Double getValordespesa() {
		return valordespesa;
	}

	public void setValordespesa(Double valordespesa) {
		this.valordespesa = valordespesa;
	}

	public String getDatapag() {
		return datapag;
	}

	public void setDatapag(String datapag) {
		this.datapag = datapag;
	}

	public String getDatapagesperado() {
		return datapagesperado;
	}

	public void setDatapagesperado(String datapagesperado) {
		this.datapagesperado = datapagesperado;
	}

	public String getTipodespesa() {
		return tipodespesa;
	}

	public void setTipodespesa(String tipodespesa) {
		this.tipodespesa = tipodespesa;
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
	
	
	
	
}
