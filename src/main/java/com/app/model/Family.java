package com.app.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document( collection ="familyv6")
public class Family implements Serializable {
   
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String idStudent;
	private String  relation;
	private String surnames;
	private String names;
	private String gender;
	private String typeDocument;
	private String numDocument;
	private LocalDate dateBirth;
	
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getNumDocument() {
		return numDocument;
	}
	public void setNumDocument(String numDocument) {
		this.numDocument = numDocument;
	}
	public LocalDate getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
	
	
}
