package com.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ClientDto {
  
	   private String id;
	   private String clientType;
	    private String name;
	    private String lastName;
	    private String RUC;
	    private String address;
	    private String email;
	    private String status; 

}