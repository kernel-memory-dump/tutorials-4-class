package com.geowarin.hibernate.jpa.standalone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

	// 0 - 128
	// 
	/**
	 *  long x1 = 7L;
	 *  long x2 = 8L;
	 *  Long x3 = 10L;
	 *  
	 *   x1 == x2 
	 *   x2 == x3
	 *   x1 == x3
	 *   
	 * 
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="kurs_naziv")
	private String kursNaziv;
	
	@Column(name="kurs_web")
	private boolean kursWeb; 
	
	@Column(name="kurs_oblast")
	private String kursOblast; 
	
	@Column(name="napomena")
	private String napomena;
	
	@Column(name="kurs_trajanje")
	private Long kursTrajanje; 
	
	public Course() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKursNaziv() {
		return kursNaziv;
	}

	public void setKursNaziv(String kursNaziv) {
		this.kursNaziv = kursNaziv;
	}

	public boolean isKursWeb() {
		return kursWeb;
	}

	public void setKursWeb(boolean kursWeb) {
		this.kursWeb = kursWeb;
	}

	public String getKursOblast() {
		return kursOblast;
	}

	public void setKursOblast(String kursOblast) {
		this.kursOblast = kursOblast;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Long getKursTrajanje() {
		return kursTrajanje;
	}

	public void setKursTrajanje(Long kursTrajanje) {
		this.kursTrajanje = kursTrajanje;
	}	
	
}
