package com.example.insuranceconsumer.consumerinsdemo.model;

import java.util.Date;

public class FinancilaActivity {
	
	private String activityType;
	private double amt;
	private Date effectivedate;
	private Boolean interMediant;
	private Payment paymentMethod;
	private OLMExtension ola;
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public Boolean getInterMediant() {
		return interMediant;
	}
	public void setInterMediant(Boolean interMediant) {
		this.interMediant = interMediant;
	}
	public Payment getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(Payment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public OLMExtension getOla() {
		return ola;
	}
	public void setOla(OLMExtension ola) {
		this.ola = ola;
	}
	
	

}
