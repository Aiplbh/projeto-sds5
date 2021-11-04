/*
 * Esta classe é implementada para se ter um instância das entidades 
 * de forma mais simplificada, sem os controles impostos pelas annotations
 * da classe Seller. Basicamente é a classe Seller sem as annotations;
 */

package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

// 

public class SellerDTO  implements Serializable {
	
	/*
	 * Serializable nesta classe permite que os objetos possam ser convertidos em
     * bytes para serem enviados pela rede, serem salvos em arquivo, etc.
	 */
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	// Construtor vazio
	
	public SellerDTO () {
		
	}

	// Construtor padrão criado pela IDE
	
	public SellerDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	// Este outro construtor pode ser chamado passando-se a entidade completa
	// para agilizar o processo.
	
	public SellerDTO (Seller entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	
	// Getters and Setters padrão
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
