package com.jiliguagua.services;

import com.jiliguagua.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContacts();
    void insertContact(Contact contact);

    void changeContact(Contact contact);

    void deleteContact(int cNo);
}
