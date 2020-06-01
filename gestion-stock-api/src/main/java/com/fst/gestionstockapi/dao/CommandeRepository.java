package com.fst.gestionstockapi.dao;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.gestionstockapi.bean.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
	public Commande findByReference(String reference);
	
	public Commande findByDate(Date dateCreation);
	
	public int deleteByReference(String reference);
}
