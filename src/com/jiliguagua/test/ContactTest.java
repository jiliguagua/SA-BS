package com.jiliguagua.test;


import com.jiliguagua.entity.Contact;
import com.jiliguagua.services.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ContactTest {
    @Autowired
    ContactService contactService;

    @Test
    public void testGetContacts() {
        List<Contact> contacts = contactService.getContacts();
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    @Test
    public void testInsertContact() {
        Contact contact = new Contact("zl", "男", "2000-03-07", "13350225407", "2889035174@qq.com");
        contactService.insertContact(contact);
    }

    @Test
    public void testChangeContact() {
        Contact contact = new Contact(13, "hhh", "男", "2020.10.29", "12388471269", "13871203@asd.com");
        contactService.changeContact(contact);
    }

    @Test
    public void testDeleteContact() {
        contactService.deleteContact(19);
    }
}
