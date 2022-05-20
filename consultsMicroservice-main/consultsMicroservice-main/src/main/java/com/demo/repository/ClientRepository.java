package com.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.models.Client;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String>{

}
