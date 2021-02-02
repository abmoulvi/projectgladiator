package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BIDDING database table.
 * 
 */
@Entity
@NamedQuery(name="Bidding.findAll", query="SELECT b FROM Bidding b")
public class Bidding implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long bidseq;

	private BigDecimal baseprice;

	private String bidstatus;

	private BigDecimal currbid;

	private BigDecimal soldprice;

	//bi-directional many-to-one association to Cropdetail
	@ManyToOne
	@JoinColumn(name="CID")
	private Cropdetail cropdetail;

	//bi-directional many-to-one association to Bidderreg
	@ManyToOne
	@JoinColumn(name="BEMAIL")
	private Bidderreg bidderreg;

	public Bidding() {
	}

	public long getBidseq() {
		return this.bidseq;
	}

	public void setBidseq(long bidseq) {
		this.bidseq = bidseq;
	}

	public BigDecimal getBaseprice() {
		return this.baseprice;
	}

	public void setBaseprice(BigDecimal baseprice) {
		this.baseprice = baseprice;
	}

	public String getBidstatus() {
		return this.bidstatus;
	}

	public void setBidstatus(String bidstatus) {
		this.bidstatus = bidstatus;
	}

	public BigDecimal getCurrbid() {
		return this.currbid;
	}

	public void setCurrbid(BigDecimal currbid) {
		this.currbid = currbid;
	}

	public BigDecimal getSoldprice() {
		return this.soldprice;
	}

	public void setSoldprice(BigDecimal soldprice) {
		this.soldprice = soldprice;
	}

	public Cropdetail getCropdetail() {
		return this.cropdetail;
	}

	public void setCropdetail(Cropdetail cropdetail) {
		this.cropdetail = cropdetail;
	}

	public Bidderreg getBidderreg() {
		return this.bidderreg;
	}

	public void setBidderreg(Bidderreg bidderreg) {
		this.bidderreg = bidderreg;
	}

}