package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clan")
public class clan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_clana;
	
	@Column
	private String ime_clana;
	@Column
	private String prezime_clana;
	@Column
	private String studijski_program;
	@Column
	private String mail;
	@Column
	private String status;
	@Column
	private String funkcija;
	@Column
	private String lozinka;
	@Column
	private int trajanje_mandata;
	
	
	public int getId_clana() {
		return id_clana;
	}
	public void setId_clana(int id_clana) {
		this.id_clana = id_clana;
	}
	public String getIme_clana() {
		return ime_clana;
	}
	public void setIme_clana(String ime_clana) {
		this.ime_clana = ime_clana;
	}
	public String getPrezime_clana() {
		return prezime_clana;
	}
	public void setPrezime_clana(String prezime_clana) {
		this.prezime_clana = prezime_clana;
	}
	public String getStudijski_program() {
		return studijski_program;
	}
	public void setStudijski_program(String studijski_program) {
		this.studijski_program = studijski_program;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFunkcija() {
		return funkcija;
	}
	public void setFunkcija(String funkcija) {
		this.funkcija = funkcija;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public int getTrajanje_mandata() {
		return trajanje_mandata;
	}
	public void setTrajanje_mandata(int trajanje_mandata) {
		this.trajanje_mandata = trajanje_mandata;
	}


	
	
}
