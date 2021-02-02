package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INSURANCECLAIM database table.
 * 
 */
@Entity
@NamedQuery(name="Insuranceclaim.findAll", query="SELECT i FROM Insuranceclaim i")
public class Insuranceclaim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String claimid;

	private String cause;

	private String cldate;

	private String clstatus;

	//bi-directional one-to-one association to Insuranceapply
	@OneToOne(mappedBy="insuranceclaim")
	private Insuranceapply insuranceapply;

	public Insuranceclaim() {
	}

	public String getClaimid() {
		return this.claimid;
	}

	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getCldate() {
		return this.cldate;
	}

	public void setCldate(String cldate) {
		this.cldate = cldate;
	}

	public String getClstatus() {
		return this.clstatus;
	}

	public void setClstatus(String clstatus) {
		this.clstatus = clstatus;
	}

	public Insuranceapply getInsuranceapply() {
		return this.insuranceapply;
	}

	public void setInsuranceapply(Insuranceapply insuranceapply) {
		this.insuranceapply = insuranceapply;
	}

}