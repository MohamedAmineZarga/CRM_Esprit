package tn.espritcrm.entities;


import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table (name = "Reclamations")
public class Reclamations  {

	
	
	public enum Type {
		Stage , Finance , Compte , Note , Absence , Autre 
		
		
	}
	
	
	// Variables 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	
	

	private long id_r ; 
	
	
	private Date  date ; 
	
	private String description ; 
	
	private String typeR ;
	
	
	// Constructors 
	
	
	public Reclamations() // default
	{
		
		super();
		
	}
	
	
	public Reclamations(long id_r, Date date, String description, String typeR) {
		super();
		this.id_r = id_r;
		this.date = date;
		this.description = description;
		this.typeR = typeR;
	}
	
	
	// GETTERS ET SETTERS 
	public long getId_r() {
		return id_r;
	}

	public void setId_r(long id_r) {
		this.id_r = id_r;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getTypeR() {
		return typeR;
	}
	public void setTypeR(String typeR) {
		this.typeR = typeR;
	}
	@Override
	public String toString() {
		return "Reclamations [id=" + id_r + ", date=" + date + ", description=" + description + ", typeR=" + typeR
				+ "]";
	} 
	
	

	
	
}