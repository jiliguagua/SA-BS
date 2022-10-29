package com.jiliguagua.controller;

import com.jiliguagua.entity.Contact;
import com.jiliguagua.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;
import java.util.List;


@Controller
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping({"/","/contacts"})
    public String contactsList(HttpServletRequest req) {
        List<Contact> contacts = null;
        contacts = contactService.getContacts();
        HttpSession session = req.getSession();
        session.setAttribute("contacts", contacts);
        return "list.jsp";
    }

    @RequestMapping("/contactAdd")
    public String contactAdd(@RequestParam(defaultValue = "")String vName, @RequestParam(defaultValue = "")String cSex,
                             @RequestParam(defaultValue = "")String dBirth, @RequestParam(defaultValue = "")String cPhone,
                             @RequestParam(defaultValue = "")String vEmail, HttpServletRequest req) {
        Contact contact = new Contact(vName, cSex, dBirth, cPhone, vEmail);
        contactService.insertContact(contact);
        return "redirect:/contacts";
    }

    @RequestMapping("/contactChange")
    public String contactChange(@RequestParam(defaultValue = "")String cNo,
                                @RequestParam(defaultValue = "")String vName, @RequestParam(defaultValue = "")String cSex,
                                @RequestParam(defaultValue = "")String dBirth, @RequestParam(defaultValue = "")String cPhone,
                                @RequestParam(defaultValue = "")String vEmail, HttpServletRequest req) {
        boolean flag = true;
        int id = 0;
        try {
            id = Integer.parseInt(cNo);
        } catch (Exception e) {
            flag = false;
        }
        if(!flag)
            return "change.jsp";
        flag = false;
        for (Contact contact: contactService.getContacts()) {
            if (contact.getcNo() == id) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return "change.jsp";


        Contact contact = new Contact(id, vName, cSex, dBirth, cPhone, vEmail);
        contactService.changeContact(contact);
        return "redirect:/contacts";
    }

    @RequestMapping("/contactDelete")
    public String contactDelete(@RequestParam(defaultValue = "")String cNo) {
        boolean flag = true;
        int id = 0;
        try {
            id = Integer.parseInt(cNo);
        } catch (Exception e) {
            flag = false;
        }
        if(!flag)
            return "change.jsp";
        flag = false;
        for (Contact contact: contactService.getContacts()) {
            if (contact.getcNo() == id) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return "change.jsp";
        contactService.deleteContact(id);
        return "redirect:/contacts";
    }
}
