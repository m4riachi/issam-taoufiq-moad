package com.fst.gestionstockapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.gestionstockapi.bean.Produit;
import com.fst.gestionstockapi.dao.ProduitRepository;

@Service
public class ProduitService{
	
	@Autowired
	private ProduitRepository produitRepository;
	
	public int save(Produit produit) {
		if (produitRepository.findByName(produit.getname()) !=null) {
			return -1;
		} else {
			produitRepository.save(produit);
			return 1;
		}
	}

	@Transactional
	public int delete(Long id) {
		produitRepository.deleteById(id);
		return 1;
	}

	public int update(Produit produit) {
		
		if (produitRepository.findByNameAndId(produit.getname(), produit.getId()) !=null) {
			return -1;
		} else {
			produitRepository.save(produit);
		}   return 1;
	}

	public List<Produit> getAll(){
		return produitRepository.findAll();
	}

}
