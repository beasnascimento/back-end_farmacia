package com.farmacialegal.farmacialegal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacialegal.farmacialegal.model.Categorias;


public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

	public List<Categorias> findAllByTipoContainingIgnoreCase (String Tipo );
	
}