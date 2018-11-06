package com.example.insuranceconsumer.consumerinsdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="BITSCORE_T_REMITTANCERECORD")
public class TransLifeRequestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="RR_REMITTANCE_ID")
    private Long id;
	@Column(name="RR_BILL_SEQ_NUMBER")
	private String billNumber;
    @Column(name="RR_PAYMENT_TYPE")
	private String paymentType;
    @Column(name="RR_PAYMENT_AMOUNT")
    private Double paymentAmount;
    @Column(name="RR_PAYMENT_EFFECTIVE_DATE")
    @Temporal(TemporalType.DATE)
    private Date effectiveDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
    
    

}
