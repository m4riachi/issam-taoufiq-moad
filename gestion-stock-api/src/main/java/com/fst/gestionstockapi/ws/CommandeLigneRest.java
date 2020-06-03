package com.fst.gestionstockapi.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fst.gestionstockapi.bean.CommandeLigne;
import com.fst.gestionstockapi.service.CommandeLigneService;

@RestController
@RequestMapping("/gestion-stock/commande-ligne")
public class CommandeLigneRest {
	@Autowired 
	private CommandeLigneService commandeLigneService;

	@PostMapping("/")
	public int save(@RequestBody CommandeLigne commandeLigne) {
		return commandeLigneService.save(commandeLigne);
	}
}
