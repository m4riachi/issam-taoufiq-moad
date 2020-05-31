package com.fst.gestionstockapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private Number qte;
	private double prix_achat;
	private double prix_vente;
	Categorie categorie;
	public Produit(Long id, String libelle, Number qte, double prix_achat, double prix_vente, Categorie categorie) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.qte = qte;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
		this.categorie = categorie;
	}
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Number getQte() {
		return qte;
	}
	public void setQte(Number qte) {
		this.qte = qte;
	}
	public double getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}
	public double getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}
