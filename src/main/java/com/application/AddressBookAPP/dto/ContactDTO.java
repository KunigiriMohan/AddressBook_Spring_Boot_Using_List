package com.application.AddressBookAPP.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.ToString;

/**
 * @Data : Using Lombok to auto Generate Getters and Setters
 * @Pattern : Validating Variable using Regex
 * @NotNull : Show error message when variable is not Defined
 */
public @ToString class  ContactDTO {

    @Pattern(regexp= "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "C0ntact name is not valid")
    public String name;
    
    @NotNull(message = "Address Should not be Empty")
    public String address;
    
    @NotNull(message = "City Should not Empty")
    public String city;
    
    @NotNull(message = "State should not Empty")
    public String state;
    
    @Pattern(regexp = "^[1-9]{1}[0-9]{5}$",message = "Entered Wrong Pincode")
    public String pinCode;
    
    @Pattern(regexp = "^[6789]{1}[0-9]{9}",message = "Entered wrong mobile Number")
    public String mobileNo;
    
    @NotNull(message = "Email Should not Empty")
    public String email;
}
