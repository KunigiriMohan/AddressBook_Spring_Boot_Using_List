package com.application.AddressBookAPP.dto;

import lombok.Data;
/**
 * @Data : Using Lombok to auto generate Getters and Setters
 */
public @Data class ResponseDTO {
    private String message;
    private Object contactDTO;
    
    /**
     * Defining Constructer 
     * @param message
     * @param contactDTO
     */
    public ResponseDTO(String message, Object contactDTO) {
        this.message = message;
        this.contactDTO = contactDTO;
    }

}
