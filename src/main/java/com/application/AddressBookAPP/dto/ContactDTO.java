package com.application.AddressBookAPP.dto;
/**
 * @Data : Using Lombok to auto Generate Getters and Setters
 */
public class @Data ContactDTO {

    private String name;
    private String address;
    private String city;
    private String state;
    private String pinCode;
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