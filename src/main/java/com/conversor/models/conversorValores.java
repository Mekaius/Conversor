package com.conversor.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class conversorValores implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cValID;
	
	private BigDecimal valorEspecie;
	private BigDecimal valorConversao;
	private BigDecimal conversaoDoValor;

	public BigDecimal getValorEspecie() {
		return valorEspecie;
	}

	public void setValorEspecie(BigDecimal valorEspecie) {
		this.valorEspecie = valorEspecie;
	}

	public BigDecimal getValorConversao() {
		return valorConversao;
	}

	public void setValorConversao(BigDecimal valorConversao) {
		this.valorConversao = valorConversao;
	}

	public BigDecimal getConversaoDoValor() {
		return conversaoDoValor;
	}
	public void setConversaoDoValor(BigDecimal conversaoDoValor) {
		this.conversaoDoValor = conversaoDoValor;
	}

	public long getcValID() {
		return cValID;
	}

	public void setcValID(long cValID) {
		this.cValID = cValID;
	}

}
