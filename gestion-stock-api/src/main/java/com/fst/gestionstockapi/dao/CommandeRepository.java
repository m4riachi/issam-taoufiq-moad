package com.fst.gestionstockapi.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.gestionstockapi.bean.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
	public Commande findByReference(String reference);
	
	public List<Commande> findByDate(Date dateCreation);
	
}
