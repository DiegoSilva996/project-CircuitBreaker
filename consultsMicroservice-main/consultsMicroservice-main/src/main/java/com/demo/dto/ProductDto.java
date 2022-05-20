package com.demo.dto;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {
   
    private String id;
    private String clientId;
    private Date creationDate;
    private String transactionDate; 
    private int maximumTransactionLimit;
    private Double maintenanceCommission;
    private Double amount;
    private String productType;
    private String status;
    private List<String> owners;
    private List<String> authorizedSigner;
}