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

import com.fst.gestionstockapi.bean.Categorie;
import com.fst.gestionstockapi.service.CategorieService;

@RestController
@RequestMapping("/gestion-stock/categorie")
@CrossOrigin("http://localhost:4200")
public class CategorieRest {
	
	@Autowired
	private CategorieService categorieService;
	
	@PostMapping("/")
	public int save (@RequestBody Categorie categorie) {
		return categorieService.save(categorie);
	}
	
	@DeleteMapping("/id/{id}")
	public int delete(@PathVariable Long id) {
		return categorieService.delete(id);
	}
	
	@PutMapping("/")
	public int update(@RequestBody Categorie categorie) {
		return categorieService.update(categorie);
	}
	
	@GetMapping("/")
	public List<Categorie> findAll(){
		return categorieService.getAll();
	}
	
}
