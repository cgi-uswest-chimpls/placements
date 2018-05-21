package com.cgi.uswest.chimpls.placements.objects;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Episode {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;

	
	@NotEmpty
	private String idepsd;
	private String idprsn;
	private BigDecimal amrate;
	private String idprvdorg;
	
	Episode() {}

	public Episode(String idepsd, String idprsn, BigDecimal amrate, String idprvdorg) {
		super();
		this.idepsd = idepsd;
		this.idprsn = idprsn;
		this.amrate = amrate;
		this.idprvdorg = idprvdorg;
	}
	
	public String getIdepsd() {
		return idepsd;
	}
	public void setIdEpsd(String idepsd) {
		this.idepsd = idepsd;
	}
	public String getIdprsn() {
		return idprsn;
	}
	public void setIdprsn(String idprsn) {
		this.idprsn = idprsn;
	}
	public BigDecimal getAmrate() {
		return amrate;
	}
	public void setAmrate(BigDecimal amrate) {
		this.amrate = amrate;
	}

	public String getIdprvdorg() {
		return idprvdorg;
	}

	public void setIdprvdorg(String idprvdorg) {
		this.idprvdorg = idprvdorg;
	}
	
}
