package com.fst.gestionstockapi.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.bean.Commande;
import com.fst.gestionstockapi.dao.CommandeRepository;

@Service
public class CommandeService {
	@Autowired
	private CommandeRepository commandeRepository;

	public Commande findByReference(String reference) {
		return commandeRepository.findByReference(reference);
	}

	public Commande findByDate(Date dateCreation) {
		return commandeRepository.findByDate(dateCreation);
	}
	@Transactional
	public int deleteByReference(String reference) {
		 commandeRepository.deleteByReference(reference);
		 return 1;
	}

	public int save(Commande commande) {
		 commandeRepository.save(commande);
		 return 1;
	}

	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}
	
	
}
