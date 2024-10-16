package com.hexaware.carrental.entity;

import java.sql.Date;

public class Lease {
	private int leaseId;
	private Date startDate;
	private Date endDate;
	private String type;
	public Lease() {
		super();
	}
	public Lease(int leaseId, Date startDate, Date endDate, String type) {
		super();
		this.leaseId = leaseId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
	}
	public int getLeaseId() {
		return leaseId;
	}
	public void setLeaseId(int leaseId) {
		this.leaseId = leaseId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Lease [leaseId=" + leaseId + ", startDate=" + startDate + ", endDate=" + endDate + ", type=" + type
				+ "]";
	}
	
	

}
