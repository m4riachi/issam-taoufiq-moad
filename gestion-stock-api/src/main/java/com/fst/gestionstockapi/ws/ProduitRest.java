package com.fst.gestionstockapi.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fst.gestionstockapi.bean.Produit;
import com.fst.gestionstockapi.service.ProduitService;

@RestController
@RequestMapping()
@CrossOrigin()
public class ProduitRest {
	@Autowired
	private ProduitService produitService;
	
	@PostMapping("/")
	public int save(@RequestBody Produit produit) {
		return produitService.save(produit);
	}
	
	@DeleteMapping("/id/{id}")
	public int delete(@PathVariable Long id) {
		return produitService.delete(id);
	}
	
	@PutMapping("/")
	public int update (@RequestBody Produit produit) {
		return produitService.update(produit);
	}
	
	@GetMapping("/")
	public List<Produit> findAll(){
		return produitService.getAll();
	}
}
