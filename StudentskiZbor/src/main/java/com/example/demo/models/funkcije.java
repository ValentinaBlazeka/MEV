package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="funkcije")
public class funkcije {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funkcije;
	
	@Column
	private String opis_funkcije;

	public int getId_funkcije() {
		return id_funkcije;
	}

	public void setId_funkcije(int id_funkcije) {
		this.id_funkcije = id_funkcije;
	}

	public String getOpis_funkcije() {
		return opis_funkcije;
	}

	public void setOpis_funkcije(String opis_funkcije) {
		this.opis_funkcije = opis_funkcije;
	}
	

}
