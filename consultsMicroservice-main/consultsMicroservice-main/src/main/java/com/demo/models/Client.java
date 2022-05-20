package com.demo.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Document(collection="clients")
public class Client {
    @Id
    private String id;
    private String clientType;
    private String name;
    private String lastName;
    private String RUC;
    private String address;
    private String email;
    private String status; 
}