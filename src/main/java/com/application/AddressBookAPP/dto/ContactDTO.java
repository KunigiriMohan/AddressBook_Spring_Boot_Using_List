package com.application.AddressBookAPP.dto;

import javax.validation.constraints.Pattern;

import lombok.Data;

/**
 * @Data : Using Lombok to auto Generate Getters and Setters
 */
public @Data class  ContactDTO {

    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "C0ntact name is not valid")
    private String name;
    private String address;
    private String city;
    private String state;
    @Pattern(regexp = "^[1-9]{1}[0-9]{5}$",message = "Entered Wrong Pincode")
    private String pinCode;
    @Pattern(regexp = "^[6789]{1}[0-9]{9}",message = "Entered wrong mobile Number")
    private String mobileNo;
    private String email;
    
    /**
     * Defining Constructer
     * @param name
     * @param address
     * @param city
     * @param state
     * @param pinCode
     * @param mobileNo
     * @param email
     */
    public ContactDTO( String name, String address, String city, String state, String pinCode, String mobileNo,
            String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.mobileNo = mobileNo;
        this.email = email;
    }
}