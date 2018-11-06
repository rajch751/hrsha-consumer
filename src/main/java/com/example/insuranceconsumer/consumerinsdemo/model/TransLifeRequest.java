package com.example.insuranceconsumer.consumerinsdemo.model;

import java.util.Date;

public class TransLifeRequest {
	
	
	private Date transEffDate;
	private Date startDate;
	private Date endDate;
	private String refGuid;
	private Holding holiding;
	public Date getTransEffDate() {
		return transEffDate;
	}
	public void setTransEffDate(Date transEffDate) {
		this.transEffDate = transEffDate;
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
	public String getRefGuid() {
		return refGuid;
	}
	public void setRefGuid(String refGuid) {
		this.refGuid = refGuid;
	}
	public Holding getHoliding() {
		return holiding;
	}
	public void setHoliding(Holding holiding) {
		this.holiding = holiding;
	}
	
	
	

}
