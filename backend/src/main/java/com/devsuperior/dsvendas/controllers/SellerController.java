/*
 * Esta camada implementa o Controlador Rest que contém o endpoint  (webservice)
 * que vamos chamar para acessar a nossa api do back end
 */

package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;

@RestController // Indica que esta classe contém um controlador REST
@RequestMapping (value = "/sellers") // Indica o caminho deste recurso Web
public class SellerController {

	// Como o controlador REST depende da camada de Serviço (Modelo) vamos
	// implementar um atributo para representar este associação
	
	@Autowired
	private SellerService service;
	
	// Método para representar um endpoint
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
				
	}
	
	
	

}
