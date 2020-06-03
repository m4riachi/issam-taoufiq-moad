package com.fst.gestionstockapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.dao.CategorieRepository;

@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository categorieRepository; 
}
