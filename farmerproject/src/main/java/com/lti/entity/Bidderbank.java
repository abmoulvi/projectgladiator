package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BIDDERBANK database table.
 * 
 */
@Entity
@NamedQuery(name="Bidderbank.findAll", query="SELECT b FROM Bidderbank b")
public class Bidderbank implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long bbaccno;

	private BigDecimal bbamount;

	private String bbifsc;

	//bi-directional one-to-one association to Bidderreg
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="BBACCNO", referencedColumnName="BACCNO")
	private Bidderreg bidderreg;

	public Bidderbank() {
	}

	public long getBbaccno() {
		return this.bbaccno;
	}

	public void setBbaccno(long bbaccno) {
		this.bbaccno = bbaccno;
	}

	public BigDecimal getBbamount() {
		return this.bbamount;
	}

	public void setBbamount(BigDecimal bbamount) {
		this.bbamount = bbamount;
	}

	public String getBbifsc() {
		return this.bbifsc;
	}

	public void setBbifsc(String bbifsc) {
		this.bbifsc = bbifsc;
	}

	public Bidderreg getBidderreg() {
		return this.bidderreg;
	}

	public void setBidderreg(Bidderreg bidderreg) {
		this.bidderreg = bidderreg;
	}

}