package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INSURANCEAPPLY database table.
 * 
 */
@Entity
@NamedQuery(name="Insuranceapply.findAll", query="SELECT i FROM Insuranceapply i")
public class Insuranceapply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String ipolicy;

	private BigDecimal iarea;

	private String icname;

	private String iseason;

	private BigDecimal iyear;

	private BigDecimal sumins;

	//bi-directional many-to-one association to Cropdetail
	@ManyToOne
	@JoinColumn(name="CID")
	private Cropdetail cropdetail;

	//bi-directional one-to-one association to Insuranceclaim
	@OneToOne
	@JoinColumn(name="IPOLICY", referencedColumnName="IPOLICY")
	private Insuranceclaim insuranceclaim;

	public Insuranceapply() {
	}

	public String getIpolicy() {
		return this.ipolicy;
	}

	public void setIpolicy(String ipolicy) {
		this.ipolicy = ipolicy;
	}

	public BigDecimal getIarea() {
		return this.iarea;
	}

	public void setIarea(BigDecimal iarea) {
		this.iarea = iarea;
	}

	public String getIcname() {
		return this.icname;
	}

	public void setIcname(String icname) {
		this.icname = icname;
	}

	public String getIseason() {
		return this.iseason;
	}

	public void setIseason(String iseason) {
		this.iseason = iseason;
	}

	public BigDecimal getIyear() {
		return this.iyear;
	}

	public void setIyear(BigDecimal iyear) {
		this.iyear = iyear;
	}

	public BigDecimal getSumins() {
		return this.sumins;
	}

	public void setSumins(BigDecimal sumins) {
		this.sumins = sumins;
	}

	public Cropdetail getCropdetail() {
		return this.cropdetail;
	}

	public void setCropdetail(Cropdetail cropdetail) {
		this.cropdetail = cropdetail;
	}

	public Insuranceclaim getInsuranceclaim() {
		return this.insuranceclaim;
	}

	public void setInsuranceclaim(Insuranceclaim insuranceclaim) {
		this.insuranceclaim = insuranceclaim;
	}

}