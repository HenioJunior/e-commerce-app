package com.heniojr.customer;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document
public class Customer {

    @Id
    private String id = UUID.randomUUID().toString();
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
