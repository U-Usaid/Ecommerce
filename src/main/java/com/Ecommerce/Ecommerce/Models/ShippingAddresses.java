package com.Ecommerce.Ecommerce.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Entity
public class ShippingAddresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
}
