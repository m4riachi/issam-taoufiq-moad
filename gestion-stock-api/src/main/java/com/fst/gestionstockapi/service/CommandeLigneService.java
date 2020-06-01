package com.fst.gestionstockapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.bean.CommandeLigne;
import com.fst.gestionstockapi.dao.CommandeLigneRepository;

@Service
public class CommandeLigneService {
	@Autowired
	private CommandeLigneRepository commandeLigneRepository;

	public CommandeLigne findByReference(String reference) {
		return commandeLigneRepository.findByReference(reference);
	}
	
	@Transactional
	public int deleteByReference(String reference) {
		commandeLigneRepository.deleteByReference(reference);
		return 1;
	}

	public int save(CommandeLigne commandeLigne) {
		commandeLigneRepository.save(commandeLigne);
		return 1;
	}

	public List<CommandeLigne> findAll() {
		return commandeLigneRepository.findAll();
	}
}
