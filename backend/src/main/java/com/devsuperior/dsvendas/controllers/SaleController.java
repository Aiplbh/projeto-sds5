/*
 * Esta camada implementa o Controlador Rest que contém o endpoint  (webservice)
 * que vamos chamar para acessar a nossa api do back end
 */

package com.devsuperior.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.service.SaleService;

@RestController // Indica que esta classe contém um controlador REST
@RequestMapping (value = "/sales") // Indica o caminho deste recurso Web
public class SaleController {

	// Como o controlador REST depende da camada de Serviço (Modelo) vamos
	// implementar um atributo para representar este associação
	
	@Autowired
	private SaleService service;
	
	// Método para representar um endpoint
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
				
	}
	
	
	

}
