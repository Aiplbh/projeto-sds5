/*
 * Esta classe implementa a camada de serviço (ver diagrama) para a acessar o 
 * repositório criado para a entidade Sale
 * 
 */

package com.devsuperior.dsvendas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service  // registra a classe como um component que poderá ser reutilizado
public class SaleService {
	
	// como a camada service conversa com a camada de acesso a dados
	// vamos criar uma dependencia entre as duas
	
	
	@Autowired // Permite ao Framework injetar esta instância de forma transparente
	private SaleRepository repository;
	
	// metodo para retornar um List de Sales e converte esta Lista em SaleDTO
	// Converte os elementos de result (Lista de Sale) em objeto SaleDTO usando a função map
	// A função map converte a coleção original para uma nova coleção
	
	
	// Dependencia declarada para buscar todos os vendedores e deixá-los em memória
	@Autowired
	private SellerRepository sellerRepository;
	
	
	// A annotation Transactional(readOnly = true) garante que toda transação
	// seja resolvida no código de acesso da camada service e o read=true é para
	// que não seja feito lock no banco já que se trata de uma operação de leitura
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
	
	
}
