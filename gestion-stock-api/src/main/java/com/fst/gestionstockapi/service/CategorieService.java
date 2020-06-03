package com.fst.gestionstockapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.bean.Categorie;
import com.fst.gestionstockapi.dao.CategorieRepository;

@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository categorieRepository; 
	
	public int save(Categorie categorie) {
		
		if (categorieRepository.findByName(categorie.getName()) != null) {
			return -1;
		} else {
			categorieRepository.save(categorie);
			return 1;
		}
		
	}
	
	@Transactional
	public int delete(Long id) {
		categorieRepository.deleteById(id);
		return 1;
	}

	public int update(Categorie categorie) {
		if (categorieRepository.findByNameAndId(categorie.getName(), categorie.getId()) !=null ) {
			return -1;
		} else {
			categorieRepository.save(categorie);
			return 1;
		}
	}

	public List<Categorie> getAll() {
		return categorieRepository.findAll();
	}

}
