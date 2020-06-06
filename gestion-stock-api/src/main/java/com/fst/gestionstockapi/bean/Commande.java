package com.fst.gestionstockapi.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	private Date dateCreation;
	private double totale;
	/*
	@OneToMany(mappedBy = "commande")
	private List<CommandeLigne> commandeLignes;
	*/
	
	public Commande(Long id, String reference, Date dateCreation, double totale) {
		super();
		this.id = id;
		this.reference = reference;
		this.dateCreation = dateCreation;
		this.totale = totale;
	}
	
	public Commande() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getTotale() {
		return totale;
	}

	public void setTotale(double totale) {
		this.totale = totale;
	}
/*
	public List<CommandeLigne> getCommandeLignes() {
		return commandeLignes;
	}

	public void setCommandeLignes(List<CommandeLigne> commandeLignes) {
		this.commandeLignes = commandeLignes;
	}
	
	*/
	
}
