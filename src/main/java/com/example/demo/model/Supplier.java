package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supplier_name")
    private String supplierName;
    @Column(name = "supplier_phone")
    private String supplierPhone;
    @Column(name = "supplier_country")
    private String supplierCountry;
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
