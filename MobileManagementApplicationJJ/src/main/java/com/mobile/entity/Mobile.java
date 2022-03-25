package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobileapp")
public class Mobile {
	
	// Encapsulated class
	@Id
	@Column(name="mid",length=10)
	private int mobileId;
	@Column(name="mname",length=10)
	private String mobileName;
	@Column(name="mtype",length=10)
	private String mobileType;
	@Column(name="mprice",length=10)
	private int mobilePrice;
	@Column(name="mwarranty",length=10)
	private String mobileWarranty;
	@Column(name="mimei",length=10)
	private int mobileIMEI;
	
	// Getters and setters
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileWarranty() {
		return mobileWarranty;
	}
	public void setMobileWarranty(String mobileWarranty) {
		this.mobileWarranty = mobileWarranty;
	}
	public int getMobileIMEI() {
		return mobileIMEI;
	}
	public void setMobileIMEI(int mobileIMEI) {
		this.mobileIMEI = mobileIMEI;
	}
	
	// Default Constructor
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Constructor using fields
	public Mobile(int mobileId, String mobileName, String mobileType, int mobilePrice, String mobileWarranty,
			int mobileIMEI) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarranty = mobileWarranty;
		this.mobileIMEI = mobileIMEI;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileType=" + mobileType
				+ ", mobilePrice=" + mobilePrice + ", mobileWarranty=" + mobileWarranty + ", mobileIMEI=" + mobileIMEI
				+ "]";
	}
	
	

}