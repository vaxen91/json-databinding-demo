package com.vaxen.jackson.json.demo;

import lombok.Data;

@Data
public class Address {


    private String street;
    private String city;
    private String state;
    private int zip;
    private String country;

}
