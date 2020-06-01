package com.fst.gestionstockapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.gestionstockapi.bean.CommandeLigne;

public interface CommandeLigneRepository extends JpaRepository<CommandeLigne , Long>{
	public CommandeLigne findByReference(String reference);
	
	public int deleteByReference(String reference);
}
