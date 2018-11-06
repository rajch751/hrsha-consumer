package com.example.insuranceconsumer.consumerinsdemo.dao;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.insuranceconsumer.consumerinsdemo.model.TransLifeRequestEntity;

@Repository
@Transactional
public interface TransLifeRepository extends JpaRepository<TransLifeRequestEntity,Long>,JpaSpecificationExecutor<TransLifeRequestEntity>{

}
