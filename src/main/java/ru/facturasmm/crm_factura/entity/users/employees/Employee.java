package ru.facturasmm.crm_factura.entity.users.employees;


import lombok.*;
import ru.facturasmm.crm_factura.entity.groupsvk.GroupOFCompany;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

  @Column(name="name")
   private String name;

   @Column(name="surname")
   private String surname;

   @Column(name="department")
   private String department;

   @Column(name="phoneNumber")
   private String phoneNumber;

   @Column(name="email")
   private String email;

   @Column(name="country")
   private String country;

   @Column(name="city")
   private  String city;

   @Column(name="urlVK")
   private String urlVK;

   @Column(name="salary")
   private int salary;

   @Column(name="percentBonus")
   private int percentBonus;

   @Column(name="wallet")
   private String wallet;

   @Column(name="urlimage")
   private String urlimage;

   @Column(name="adminT")
   private boolean adminT;


}
