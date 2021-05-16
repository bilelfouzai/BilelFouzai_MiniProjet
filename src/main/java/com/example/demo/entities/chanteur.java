package com.example.demo.entities;


	
	import java.util.Date;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

	@Entity
	public class chanteur {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idchanteur;
	@NotNull
	@Size (min = 4,max = 15)

	private String nom;
	
	@NotNull
	@Size (min = 4,max = 15)
	private String prenom;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date datenaiss;
	@NotNull
	@Size (min = 4,max = 15)
	private String ville;
	@ManyToOne
	private concert conc;


	public Long getId() {
		return idchanteur;
	}

	public void setId(Long idchanteur) {
		this.idchanteur = idchanteur;
	}

	public String getNom() {
		return nom;
	}
	 
	public chanteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public chanteur (String nom,String prenom,Date datenaiss,String ville) {
		this.nom = nom;
		this.prenom= prenom;
		this.datenaiss=datenaiss;
		this.ville=ville;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenaiss() {
		return datenaiss;
	}
	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Chanteur [nom=" + nom + ", prenom=" + prenom + ", datenaiss=" + datenaiss + ", ville=" + ville + "]";
	} 




	}

