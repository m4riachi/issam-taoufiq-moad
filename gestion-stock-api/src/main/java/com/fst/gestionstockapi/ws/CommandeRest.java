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

import com.fst.gestionstockapi.bean.Commande;
import com.fst.gestionstockapi.service.CommandeService;

@RestController
@RequestMapping("/gestion-stock/commande")
public class CommandeRest {
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping("/reference/{reference}")
	public Commande findByReference(@PathVariable("reference") String reference) {
		return commandeService.findByReference(reference);
	}
	@DeleteMapping ("/reference/{reference}")
	public int deleteByReference(@PathVariable("reference") String reference) {
		return commandeService.deleteByReference(reference);
	}
	@PostMapping("/")
	public int save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}
	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}
	
}
