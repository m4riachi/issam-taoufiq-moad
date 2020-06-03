package com.fst.gestionstockapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.gestionstockapi.bean.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{
	Produit findByName(String name);
	Produit findByNameAndId(String name, Long id);
}
