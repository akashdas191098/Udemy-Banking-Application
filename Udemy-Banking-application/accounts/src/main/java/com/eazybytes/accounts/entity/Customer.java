package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator ="native")
    @Column(name = "customer_id")
    private Long coustomerId;

    private String name;


    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
