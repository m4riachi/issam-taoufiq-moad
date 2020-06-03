package com.fst.gestionstockapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.gestionstockapi.bean.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
