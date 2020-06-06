package com.fst.gestionstockapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.gestionstockapi.bean.CommandeLigne;

@Repository
public interface CommandeLigneRepository extends JpaRepository<CommandeLigne , Long>{

	
}
