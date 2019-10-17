package org.hotelSunshine.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quarto {

	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Integer qtdPessoas;
	private String tipoDeCama;
	private Integer status;
	
	public Quarto () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public String getTipoDeCama() {
		return tipoDeCama;
	}

	public void setTipoDeCama(String tipoDeCama) {
		this.tipoDeCama = tipoDeCama;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
	
}
