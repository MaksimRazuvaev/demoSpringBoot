package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;
    @Column(name = "is_liquid")
    private Boolean isLiquid;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}
