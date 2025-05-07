package com.bancochile.microserviceclient.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancochile.microserviceclient.entities.Client;

public interface IMicroserviceDAO extends CrudRepository<Client, Long> {

}
