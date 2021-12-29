package com.application.AddressBookAPP.service;

import java.util.List;
import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.model.ContactData;
import com.application.AddressBookAPP.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.AddressBookAPP.exception.ContactNotFoundEXception;

/**
* @Service : creating service layer
* @Override : Overriding implemented methods from interface
*/
@Service
public class AddressService implements AddressBookInterface{

    @Autowired
    AddressBookRepository addressBookRepository;
    /**
     * method to Show all Contact Details in AddressBook
     * @return : Entered Contact Data
     */
    @Override
    public List<ContactData> getContactData() {
        return addressBookRepository.findAll();
    }

    /**
     * method to return Contact Details by ID
     * @param : contactID
     * @return : Contact details of particular ID
     */
    @Override
    public ContactData getContactDataById(Long contactID) {
        return addressBookRepository.findById(contactID).orElseThrow(() -> new ContactNotFoundEXception("Contact not found"));
    }

    /**
     * method to create a Contact in Address Book
     * @param : contactDTO
     * @return : Entered Contact Data
     */
    @Override
    public ContactData createContactData(ContactDTO contactDTO) {
        ContactData contactData = new ContactData(contactDTO);
        return addressBookRepository.save(contactData);
    }

    /**
     * method to Update Contact Data
     * @param : contactDTO
     * @return : Updated Contact Data
     */
    @Override
    public ContactData updateContactData(Long contactID,ContactDTO contactDTO) {
        ContactData contactData = this.getContactDataById(contactID);
        contactData.updateContactDate(contactDTO);
        return addressBookRepository.save(contactData);
    }

    /**
     * method to delete contact
     * @param : contactID
     */
    @Override
    public void deleteContactData(Long contactID) {
        addressBookRepository.deleteById(contactID);
    }
}
