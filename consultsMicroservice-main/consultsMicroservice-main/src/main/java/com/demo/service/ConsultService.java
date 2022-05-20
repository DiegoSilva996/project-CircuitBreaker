package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.ClientDto;
import com.demo.dto.ProductDto;
import com.demo.repository.ClientRepository;
import com.demo.repository.ProductRepository;
import com.demo.utils.AppUtils;

import reactor.core.publisher.Mono;

@Service
public class ConsultService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Mono<ProductDto> getProduct(String id){
		return productRepository.findById(id).map(AppUtils::productEntitytoDto);
	}
	
	public Mono<ProductDto> saveProduct(Mono<ProductDto> productDtoMono){
		return productDtoMono.map(AppUtils::DtoToproductEntity)
		.flatMap(productRepository::insert)
		.map(AppUtils::productEntitytoDto);
		 
	}
	
	public Mono<ProductDto> updateProduct(Mono<ProductDto> productDtoMono, String id){
		return productRepository.findById(id)
		.flatMap(p->productDtoMono.map(AppUtils::DtoToproductEntity)
		.doOnNext(e->e.setId(id)))
		.flatMap(productRepository::save)
		.map(AppUtils::productEntitytoDto);
	}
	
	public Mono<Void> deleteProduct(String id){
		return productRepository.deleteById(id);
	}
	
	
	public Mono<ClientDto> getClient(String id){
		return  clientRepository.findById(id).map(AppUtils::clientEntitytoDto);
	}
	
	public Mono<ClientDto> saveClient(Mono<ClientDto> clientDtoMono){
		return clientDtoMono.map(AppUtils::DtoToclientEntity)
		.flatMap(clientRepository::insert)
		.map(AppUtils::clientEntitytoDto);
		 
	}
	
	public Mono<ClientDto> updateClient(Mono<ClientDto> clientDtoMono, String id){
		return clientRepository.findById(id)
		.flatMap(p->clientDtoMono.map(AppUtils::DtoToclientEntity)
		.doOnNext(e->e.setId(id)))
		.flatMap(clientRepository::save)
		.map(AppUtils::clientEntitytoDto);
	}
	
	public Mono<Void> deleteClient(String id){
		return clientRepository.deleteById(id);
	}

}
