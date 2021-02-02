package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CROPDETAILS database table.
 * 
 */
@Entity
@Table(name="CROPDETAILS")
@NamedQuery(name="Cropdetail.findAll", query="SELECT c FROM Cropdetail c")
public class Cropdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cid;

	private String cfert;

	private String cname;

	private BigDecimal csoilph;

	private String ctype;

	//bi-directional many-to-one association to Bidding
	@OneToMany(mappedBy="cropdetail")
	private List<Bidding> biddings;

	//bi-directional many-to-one association to Farmerreg
	@ManyToOne
	@JoinColumn(name="FEMAIL")
	private Farmerreg farmerreg;

	//bi-directional many-to-one association to Insuranceapply
	@OneToMany(mappedBy="cropdetail")
	private List<Insuranceapply> insuranceapplies;

	public Cropdetail() {
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCfert() {
		return this.cfert;
	}

	public void setCfert(String cfert) {
		this.cfert = cfert;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public BigDecimal getCsoilph() {
		return this.csoilph;
	}

	public void setCsoilph(BigDecimal csoilph) {
		this.csoilph = csoilph;
	}

	public String getCtype() {
		return this.ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public List<Bidding> getBiddings() {
		return this.biddings;
	}

	public void setBiddings(List<Bidding> biddings) {
		this.biddings = biddings;
	}

	public Bidding addBidding(Bidding bidding) {
		getBiddings().add(bidding);
		bidding.setCropdetail(this);

		return bidding;
	}

	public Bidding removeBidding(Bidding bidding) {
		getBiddings().remove(bidding);
		bidding.setCropdetail(null);

		return bidding;
	}

	public Farmerreg getFarmerreg() {
		return this.farmerreg;
	}

	public void setFarmerreg(Farmerreg farmerreg) {
		this.farmerreg = farmerreg;
	}

	public List<Insuranceapply> getInsuranceapplies() {
		return this.insuranceapplies;
	}

	public void setInsuranceapplies(List<Insuranceapply> insuranceapplies) {
		this.insuranceapplies = insuranceapplies;
	}

	public Insuranceapply addInsuranceapply(Insuranceapply insuranceapply) {
		getInsuranceapplies().add(insuranceapply);
		insuranceapply.setCropdetail(this);

		return insuranceapply;
	}

	public Insuranceapply removeInsuranceapply(Insuranceapply insuranceapply) {
		getInsuranceapplies().remove(insuranceapply);
		insuranceapply.setCropdetail(null);

		return insuranceapply;
	}

}