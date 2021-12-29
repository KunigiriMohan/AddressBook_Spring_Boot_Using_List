package com.application.AddressBookAPP.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Data : Using Lombok to auto generate Getters and Setters@
 * @NoArgsConstructer: To Generate No Argument Construcer
 * @AllArgsConstructer : To Generate All Argument Constructer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public  class ResponseDTO {
    private String message;
    private Object contactDTO;
}
