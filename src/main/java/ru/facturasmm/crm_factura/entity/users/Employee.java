package ru.facturasmm.crm_factura.entity.users;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.facturasmm.crm_factura.entity.GroupOFCompany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   private String name;

   private String surname;

   private String department;

   private String phoneNumber;

   private String email;

   private String country;

   private  String city;

   private String urlVK;

   private int salary;

   private int percentBonus;

   private String wallet;

//  private Map<String,String> payWallets;
//
//  private Map<String,String>customers;


   private List<GroupOFCompany> groupOFCompanyList;

  private String urlimage;

   private boolean admin;


}
