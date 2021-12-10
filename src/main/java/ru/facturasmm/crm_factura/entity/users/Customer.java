package ru.facturasmm.crm_factura.entity.users;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String nameOfCompany;

    private String phoneNumber;

    private String test;

//    Map<String,String> phoneNumbers;

    private String email;

    private String urlAccount;

    private int percentSale;



}