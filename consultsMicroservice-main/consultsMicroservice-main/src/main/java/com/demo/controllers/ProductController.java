package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.ClientDto;
import com.demo.dto.ProductDto;
import com.demo.service.ConsultService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consults")
public class ProductController {

	@Autowired
	private ConsultService service;
	
	@GetMapping("/products/{id}")
	public Mono<ProductDto> getProduct(@PathVariable String id){
		return service.getProduct(id);
	}
	@PostMapping("/products/save")
	public Mono<ProductDto> saveProduct(@RequestBody Mono<ProductDto> productDtoMono){
		return service.saveProduct(productDtoMono);
	}
	
	@PutMapping("/products/update/{id}")
	public Mono<ProductDto> saveProduct(@RequestBody Mono<ProductDto> productDtoMono,@PathVariable String id){
		return service.updateProduct(productDtoMono, id);
	}
	
	@DeleteMapping("/products/delete/{id}")
	public Mono<Void> deleteProduct(@PathVariable String id){
		return service.deleteProduct(id);
	}
	
	
	@GetMapping("/client/{id}")
	public Mono<ClientDto> getClient(@PathVariable String id){
		return service.getClient(id);
	}
	
	@PostMapping("/client/save")
	public Mono<ClientDto> saveClient(@RequestBody Mono<ClientDto> clientDtoMono){
		return service.saveClient(clientDtoMono);
	}
	
	@PutMapping("/client/update/{id}")
	public Mono<ClientDto> editClient(@RequestBody Mono<ClientDto> clientDtoMono,@PathVariable String id){
		return service.updateClient(clientDtoMono, id);
	}
	
	@DeleteMapping("/client/delete/{id}")
	public Mono<Void> deleteClient(@PathVariable String id){
		return service.deleteClient(id);
	}
	
}
