package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;

	// Construtor sem parametros
	
	public SaleSuccessDTO () {
		
	}


	// O método construtor public SaleSuccessDTO(String sellerName, Double sum) originalmente 
	// criado assim foi modificado trocando-se String sellername pelo objeto Seller seller. 
	// Isto é devido à impossibilidade de agrupar por nome na consulta, somente por
	// seller. No Postgress não funciona.
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	
	
	// Getters and Setters

	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeals() {
		return deals;
	}


	public void setDeals(Long deals) {
		this.deals = deals;
	}


	
	
	
}
