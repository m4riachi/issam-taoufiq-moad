package com.fst.gestionstockapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.bean.CommandeLigne;
import com.fst.gestionstockapi.dao.CommandeLigneRepository;

@Service
public class CommandeLigneService {
	@Autowired
	private CommandeLigneRepository commandeLigneRepository;

	public int save(CommandeLigne commandeLigne) {
		commandeLigneRepository.save(commandeLigne);
		return 1;
	}
}
