package com.example.swagger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class AddressBookResource {
    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    @ApiOperation(value = "Finds Contacts by id",  //This is optional, it adds description to the document.
            notes = "Provide an id to look up specific contact from the address book",
            response = Contact.class)
    public Contact getContact(@ApiParam(value = "ID value for the contact you need to retrieve", required = true)
            @PathVariable String id){
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
