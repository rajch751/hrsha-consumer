package com.example.insuranceconsumer.consumerinsdemo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.insuranceconsumer.consumerinsdemo.dao.TransLifeRepository;
import com.example.insuranceconsumer.consumerinsdemo.model.Employee;
import com.example.insuranceconsumer.consumerinsdemo.model.TransLifeRequest;
import com.example.insuranceconsumer.consumerinsdemo.model.TransLifeRequestEntity;

@Component
public class Consumer {
	
	@Autowired
	private TransLifeRepository trans;
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(TransLifeRequest company) {
        System.out.println(company.getStartDate());
		
		TransLifeRequestEntity tr=new TransLifeRequestEntity();
		tr.setBillNumber(company.getHoliding().getPoolNumber());
		tr.setPaymentAmount(company.getHoliding().getFn().getAmt());
		tr.setPaymentType(company.getHoliding().getFn().getPaymentMethod().getPaymentForm());
		tr.setEffectiveDate(company.getStartDate());
		trans.save(tr);
    }
}
