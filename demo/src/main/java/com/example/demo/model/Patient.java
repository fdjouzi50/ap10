package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Patient {
	
	@Id	
	private ObjectId _id;
	private String nom;
	private String prenom;
	private String date;
	private String sexe;
	
	public Patient() {		
	}

	public Patient(ObjectId _id, String nom, String prenom, String sexe, String date) {
		this._id = _id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date = date;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNom() {
		return nom;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
}
