package com.jiliguagua.services.impl;

import com.jiliguagua.dao.ContactsDao;
import com.jiliguagua.entity.Contact;
import com.jiliguagua.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactsDao contactsDao;

    @Override
    public List<Contact> getContacts() {
        return contactsDao.getContacts();
    }

    @Override
    public void insertContact(Contact contact) {
        contactsDao.insertContact(contact);
    }

    @Override
    public void changeContact(Contact contact) {
        contactsDao.changeContact(contact);
    }

    @Override
    public void deleteContact(int cNo) {
        contactsDao.deleteContact(cNo);
    }
}
