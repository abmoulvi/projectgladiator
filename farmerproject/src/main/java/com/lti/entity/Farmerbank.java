package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FARMERBANK database table.
 * 
 */
@Entity
@NamedQuery(name="Farmerbank.findAll", query="SELECT f FROM Farmerbank f")
public class Farmerbank implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long fbaccno;

	private BigDecimal fbamount;

	private String fbifsc;

	public Farmerbank() {
	}

	public long getFbaccno() {
		return this.fbaccno;
	}

	public void setFbaccno(long fbaccno) {
		this.fbaccno = fbaccno;
	}

	public BigDecimal getFbamount() {
		return this.fbamount;
	}

	public void setFbamount(BigDecimal fbamount) {
		this.fbamount = fbamount;
	}

	public String getFbifsc() {
		return this.fbifsc;
	}

	public void setFbifsc(String fbifsc) {
		this.fbifsc = fbifsc;
	}

}