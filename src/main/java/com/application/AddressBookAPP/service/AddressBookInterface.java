package com.application.AddressBookAPP.service;

import java.util.List;

import com.application.AddressBookAPP.dto.ContactDTO;
import com.application.AddressBookAPP.model.ContactData;
/**
 * Service layer Interface
 */
public interface AddressBookInterface {
    List<ContactData> getContactData();
    ContactData getContactDataById(Long contactID);
    ContactData createContactData(ContactDTO contactDTO);
    ContactData updateContactData(Long contactID, ContactDTO contactDTO);
    void deleteContactData(Long contactID);
}