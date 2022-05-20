package com.demo.utils;

import org.springframework.beans.BeanUtils;

import com.demo.dto.ClientDto;
import com.demo.dto.ProductDto;
import com.demo.models.Product;
import com.demo.models.Client;

public class AppUtils {

	public static ProductDto productEntitytoDto(Product product) {
		ProductDto productDto=new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}
	
	public static Product DtoToproductEntity(ProductDto productDto) {
		Product product=new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
	
	public static ClientDto clientEntitytoDto(Client client) {
		ClientDto clientDto=new ClientDto();
		BeanUtils.copyProperties(client, clientDto);
		return clientDto;
	}
	
	public static Client DtoToclientEntity(ClientDto clientdto) {
		Client client=new Client();
		BeanUtils.copyProperties(clientdto, client);
		return client;
	}
	
	
}
