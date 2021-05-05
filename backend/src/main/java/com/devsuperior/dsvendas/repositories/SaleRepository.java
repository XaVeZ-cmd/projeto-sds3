package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entidades.Sale;

//camada de acesso ao banco de dados

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
