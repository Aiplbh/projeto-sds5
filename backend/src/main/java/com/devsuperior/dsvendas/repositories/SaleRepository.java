/* 
 * Este código implementa a camada de acesso a dados 
 * Esta camada executa as operações com o banco 
 * 
 */

package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
