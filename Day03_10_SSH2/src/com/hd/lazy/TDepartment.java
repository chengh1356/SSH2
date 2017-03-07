package com.hd.lazy;

/**
 * TDepartment entity. @author MyEclipse Persistence Tools
 */

public class TDepartment implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private String ddecx;

	// Constructors

	/** default constructor */
	public TDepartment() {
	}

	/** minimal constructor */
	public TDepartment(Integer did) {
		this.did = did;
	}

	/** full constructor */
	public TDepartment(Integer did, String dname, String ddecx) {
		this.did = did;
		this.dname = dname;
		this.ddecx = ddecx;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdecx() {
		return this.ddecx;
	}

	public void setDdecx(String ddecx) {
		this.ddecx = ddecx;
	}

}