package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;

	
	public SaleSumDTO () {
		
	}


	// public SaleSumDTO(String sellerName, Double sum) originalmente criado assim
	// Isto é devido à impossibilidade de agrupar por nome na consulta, somente por
	// seller. No Postgress não funciona.
	
	public SaleSumDTO(Seller seller, Double sum) {
		
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	
	// Getters and Setters
	

	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
	
	
}
