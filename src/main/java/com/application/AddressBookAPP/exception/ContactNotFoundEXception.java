package com.application.AddressBookAPP.exception;
/**
 * Defining Custom Exception
 */

public class ContactNotFoundEXception extends RuntimeException {
    public ContactNotFoundEXception(String message){
        super(message);
    }
}
