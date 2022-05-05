package com.farmacialegal.farmacialegal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacialegal.farmacialegal.model.Produtos;


public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	
	public List<Produtos> findAllByNomeContainingIgnoreCase (String nome );
	
}
