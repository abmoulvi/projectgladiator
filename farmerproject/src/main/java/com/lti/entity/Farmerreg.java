package com.lti.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FARMERREG database table.
 * 
 */
@Entity
@NamedQuery(name="Farmerreg.findAll", query="SELECT f FROM Farmerreg f")
public class Farmerreg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String femail;

	private BigDecimal faadhar;

	private BigDecimal faccno;

	private String faddress;

	private String fapproved;

	private String fcity;

	private String fladdress;

	private String flarea;

	private BigDecimal flpincode;

	private BigDecimal fmobile;

	private String fname;

	private String fpan;

	private String fpass;

	private BigDecimal fpincode;

	private String fstate;

	//bi-directional many-to-one association to Cropdetail
	@OneToMany(mappedBy="farmerreg")
	private List<Cropdetail> cropdetails;

	public Farmerreg() {
	}

	public String getFemail() {
		return this.femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}

	public BigDecimal getFaadhar() {
		return this.faadhar;
	}

	public void setFaadhar(BigDecimal faadhar) {
		this.faadhar = faadhar;
	}

	public BigDecimal getFaccno() {
		return this.faccno;
	}

	public void setFaccno(BigDecimal faccno) {
		this.faccno = faccno;
	}

	public String getFaddress() {
		return this.faddress;
	}

	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}

	public String getFapproved() {
		return this.fapproved;
	}

	public void setFapproved(String fapproved) {
		this.fapproved = fapproved;
	}

	public String getFcity() {
		return this.fcity;
	}

	public void setFcity(String fcity) {
		this.fcity = fcity;
	}

	public String getFladdress() {
		return this.fladdress;
	}

	public void setFladdress(String fladdress) {
		this.fladdress = fladdress;
	}

	public String getFlarea() {
		return this.flarea;
	}

	public void setFlarea(String flarea) {
		this.flarea = flarea;
	}

	public BigDecimal getFlpincode() {
		return this.flpincode;
	}

	public void setFlpincode(BigDecimal flpincode) {
		this.flpincode = flpincode;
	}

	public BigDecimal getFmobile() {
		return this.fmobile;
	}

	public void setFmobile(BigDecimal fmobile) {
		this.fmobile = fmobile;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFpan() {
		return this.fpan;
	}

	public void setFpan(String fpan) {
		this.fpan = fpan;
	}

	public String getFpass() {
		return this.fpass;
	}

	public void setFpass(String fpass) {
		this.fpass = fpass;
	}

	public BigDecimal getFpincode() {
		return this.fpincode;
	}

	public void setFpincode(BigDecimal fpincode) {
		this.fpincode = fpincode;
	}

	public String getFstate() {
		return this.fstate;
	}

	public void setFstate(String fstate) {
		this.fstate = fstate;
	}

	public List<Cropdetail> getCropdetails() {
		return this.cropdetails;
	}

	public void setCropdetails(List<Cropdetail> cropdetails) {
		this.cropdetails = cropdetails;
	}

	public Cropdetail addCropdetail(Cropdetail cropdetail) {
		getCropdetails().add(cropdetail);
		cropdetail.setFarmerreg(this);

		return cropdetail;
	}

	public Cropdetail removeCropdetail(Cropdetail cropdetail) {
		getCropdetails().remove(cropdetail);
		cropdetail.setFarmerreg(null);

		return cropdetail;
	}

}