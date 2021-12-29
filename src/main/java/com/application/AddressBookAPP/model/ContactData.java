package com.application.AddressBookAPP.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.application.AddressBookAPP.dto.ContactDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Data : To Generate Getters and Setters
 * @Entity : To Create Entity of Table
 * @Table : Setting Table name
 * @Id : Generating Id
 * @GeneratedValue : Auto Generating Id Value
 * @Column : Setting Column of the table
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "contact_list")
public class ContactData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contactId")
    private Long contactId;
    @Column(name = "name")
    private String name;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private String mobileNo;
    private String email;
    
    
    /**
     * Creating Custom Constructer 
     * @param: contactDTO
     */
    public ContactData(ContactDTO contactDTO){
        this.updateContactDate( contactDTO);
    }
    
    /**
     *method to define Variables
     * @param contactDTO
     */
    public void updateContactDate( ContactDTO contactDTO) {
        this.name=contactDTO.name;
        this.address=contactDTO.address;
        this.city=contactDTO.city;
        this.state=contactDTO.state;
        this.pinCode=contactDTO.pinCode;
        this.mobileNo=contactDTO.mobileNo;
        this.email=contactDTO.email;
    }
}
