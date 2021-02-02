package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the BIDDERREG database table.
 * 
 */
@Entity
@NamedQuery(name="Bidderreg.findAll", query="SELECT b FROM Bidderreg b")
public class Bidderreg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String bemail;

	private BigDecimal baadhar;

	private String baddress;

	private String bapproved;

	private String bcity;

	private BigDecimal bmobile;

	private String bname;

	private String bpan;

	private String bpass;

	private BigDecimal bpincode;

	private String bstate;

	private String btradel;

	//bi-directional one-to-one association to Bidderbank
	@OneToOne(mappedBy="bidderreg", cascade={CascadeType.ALL})
	private Bidderbank bidderbank;

	//bi-directional many-to-one association to Bidding
	@OneToMany(mappedBy="bidderreg")
	private List<Bidding> biddings;

	public Bidderreg() {
	}

	public String getBemail() {
		return this.bemail;
	}

	public void setBemail(String bemail) {
		this.bemail = bemail;
	}

	public BigDecimal getBaadhar() {
		return this.baadhar;
	}

	public void setBaadhar(BigDecimal baadhar) {
		this.baadhar = baadhar;
	}

	public String getBaddress() {
		return this.baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	public String getBapproved() {
		return this.bapproved;
	}

	public void setBapproved(String bapproved) {
		this.bapproved = bapproved;
	}

	public String getBcity() {
		return this.bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	public BigDecimal getBmobile() {
		return this.bmobile;
	}

	public void setBmobile(BigDecimal bmobile) {
		this.bmobile = bmobile;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBpan() {
		return this.bpan;
	}

	public void setBpan(String bpan) {
		this.bpan = bpan;
	}

	public String getBpass() {
		return this.bpass;
	}

	public void setBpass(String bpass) {
		this.bpass = bpass;
	}

	public BigDecimal getBpincode() {
		return this.bpincode;
	}

	public void setBpincode(BigDecimal bpincode) {
		this.bpincode = bpincode;
	}

	public String getBstate() {
		return this.bstate;
	}

	public void setBstate(String bstate) {
		this.bstate = bstate;
	}

	public String getBtradel() {
		return this.btradel;
	}

	public void setBtradel(String btradel) {
		this.btradel = btradel;
	}

	public Bidderbank getBidderbank() {
		return this.bidderbank;
	}

	public void setBidderbank(Bidderbank bidderbank) {
		this.bidderbank = bidderbank;
	}

	public List<Bidding> getBiddings() {
		return this.biddings;
	}

	public void setBiddings(List<Bidding> biddings) {
		this.biddings = biddings;
	}

	public Bidding addBidding(Bidding bidding) {
		getBiddings().add(bidding);
		bidding.setBidderreg(this);

		return bidding;
	}

	public Bidding removeBidding(Bidding bidding) {
		getBiddings().remove(bidding);
		bidding.setBidderreg(null);

		return bidding;
	}

}