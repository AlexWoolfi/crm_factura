package ru.facturasmm.crm_factura.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class GroupOFCompany {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
