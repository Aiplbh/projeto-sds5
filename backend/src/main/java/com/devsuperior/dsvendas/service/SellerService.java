/*
 * Esta classe implementa a camada de serviço (ver diagrama) para a acessar o 
 * repositório criado para a entidade Seller
 * 
 */

package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service  // registra a classe como um component que poderá ser reutilizado
public class SellerService {
	
	// como a camada service conversa com a camada de acesso a dados
	// vamos criar uma dependencia entre as duas
	
	
	@Autowired // Permite ao Framework injetar esta instância de forma transparente
	private SellerRepository repository;
	
	// metodo para retornar um List de Sellers e converte esta Lista em SellerDTO
	// Converte os elementos de result (Lista de Seller) em objeto SellerDTO usando a função map
	// A função map converte a coleção original para uma nova coleção
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
