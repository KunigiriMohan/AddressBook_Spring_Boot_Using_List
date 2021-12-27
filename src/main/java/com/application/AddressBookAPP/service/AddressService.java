package com.application.AddressBookAPP.service;

import java.util.ArrayList;
import java.util.List;
import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.model.ContactData;
import org.springframework.stereotype.Service;
import com.application.AddressBookAPP.exception.ContactNotFoundEXception;

/**
* @Service : creating service layer
* @Override : Overriding implemented methods from interface
*/
@Service
public class AddressService implements AddressBookInterface{

    List<ContactData> contactDatas = new ArrayList<>();
    /**
     * method to Show all Contact Details in AddressBook
     * @return : Entered Contact Data
     */
    @Override
    public List<ContactData> getContactData() {
        return contactDatas;
    }

    /**
     * method to return Contact Details by ID
     * @param : contactID
     * @return : Contact details of particular ID
     */
    @Override
    public ContactData getContactDataById(int contactID) {
        return contactDatas.stream().filter(contactData -> contactData.getID() == contactID).findFirst().orElseThrow(() -> new ContactNotFoundEXception("Contact not found"));
    }

    /**
     * method to create a Contact in Address Book
     * @param : contactDTO
     * @return : Entered Contact Data
     */
    @Override
    public ContactData createContactData(ContactDTO contactDTO) {
        ContactData contactData = new ContactData(contactDatas.size()+1, contactDTO);
        contactDatas.add(contactData);
        return contactData;
    }

    /**
     * method to Update Contact Data
     * @param : contactDTO
     * @return : Updated Contact Data
     */
    @Override
    public ContactData updateContactData(int contactID,ContactDTO contactDTO) {
        ContactData contactData = new ContactData(contactDatas.size()+1, contactDTO);
        contactDatas.set(contactID,contactData);
        return contactData;
    }

    /**
     * method to delete contact
     * @param : contactID
     */
    @Override
    public void deleteContactData(int contactID) {
        contactDatas.remove(contactID);
    }
    
}
