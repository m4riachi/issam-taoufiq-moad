package com.fst.gestionstockapi.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/reference/{reference}")
	public CommandeLigne findByReference(@PathVariable("reference") String reference) {
		return commandeLigneService.findByReference(reference);
	}
	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable("reference") String reference) {
		return commandeLigneService.deleteByReference(reference);
	}
	@PostMapping("/")
	public int save(@RequestBody CommandeLigne commandeLigne) {
		return commandeLigneService.save(commandeLigne);
	}
	@GetMapping("/")
	public List<CommandeLigne> findAll() {
		return commandeLigneService.findAll();
	}
}
