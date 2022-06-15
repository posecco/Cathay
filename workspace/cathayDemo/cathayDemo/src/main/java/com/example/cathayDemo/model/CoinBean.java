package com.example.cathayDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coindesk")
public class CoinBean {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="specificcurrency")
	private String specificcurrency;
	
	@Column(name="specificcurrencyChName")
	private String specificcurrencyChName;
	
	@Column(name="exchangeRate")
	private String exchangeRate;
	
	public CoinBean() {
		
	}

	
	
	public CoinBean(int id, String specificcurrency, String specificcurrencyChName, String exchangeRate) {
		super();
		this.id = id;
		this.specificcurrency = specificcurrency;
		this.specificcurrencyChName = specificcurrencyChName;
		this.exchangeRate = exchangeRate;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecificcurrency() {
		return specificcurrency;
	}

	public void setSpecificcurrency(String specificcurrency) {
		this.specificcurrency = specificcurrency;
	}

	public String getSpecificcurrencyChName() {
		return specificcurrencyChName;
	}

	public void setSpecificcurrencyChName(String specificcurrencyChName) {
		this.specificcurrencyChName = specificcurrencyChName;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
}
