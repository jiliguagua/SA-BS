package com.jiliguagua.dao;

import com.jiliguagua.entity.Contact;

import java.util.List;

public interface ContactsDao {
    List<Contact> getContacts();

    void insertContact(Contact contact);
    void changeContact(Contact contact);

    void deleteContact(int cNo);
}
