package com.application.AddressBookAPP.model;

import com.application.AddressBookAPP.dto.ContactDTO;

import lombok.Data;
/**
 * @Data : To Generate Getters and Setters
 */

public @Data class ContactData {
    
    private int contactId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private String mobileNo;
    private String email;
    public ContactData(){}
    
    /**
     * Defining Constructer
     * @param iD
     * @param contactDTO
     */
    public ContactData(int contactId, ContactDTO contactDTO) {
        this.contactId= contactId;
        this.name=contactDTO.name;
        this.address=contactDTO.address;
        this.city=contactDTO.city;
        this.state=contactDTO.state;
        this.pinCode=contactDTO.pinCode;
        this.mobileNo=contactDTO.mobileNo;
        this.email=contactDTO.email;
    }
}
