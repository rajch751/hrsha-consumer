package com.example.insuranceconsumer.consumerinsdemo.empcontroller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.insuranceconsumer.consumerinsdemo.consumer.Consumer;
import com.example.insuranceconsumer.consumerinsdemo.dao.TransLifeRepository;
import com.example.insuranceconsumer.consumerinsdemo.model.Employee;
import com.example.insuranceconsumer.consumerinsdemo.model.TransLifeRequest;
import com.example.insuranceconsumer.consumerinsdemo.model.TransLifeRequestEntity;


@RestController
@RequestMapping(value = "/consumer-rabbitmq/")
public class EmpController {
	
	/*@Autowired
	private Consumer cons;*/
	
	@Autowired
	private TransLifeRepository trans;

	
	@GetMapping(value = "/consumerCont")
	//@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void Test() {
       // System.out.println("Recieved Message: " + company.);
		
		Consumer c=new Consumer();
    }
}
