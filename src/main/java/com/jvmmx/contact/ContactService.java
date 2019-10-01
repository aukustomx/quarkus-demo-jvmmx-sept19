package com.jvmmx.contact;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ContactService {

    public List<Contact> all() {
        return Contact.listAll();
    }

    public Contact byId(long id) {
        return Contact.findById(id);
    }

    @Transactional
    public Contact add(Contact contact) {
        Contact entity = new Contact();
        entity.name = contact.name;
        entity.phone = contact.phone;
        entity.persist();
        return entity;
    }

    @Transactional
    public Contact update(long id, Contact contact) {
        Contact entity = Contact.findById(id);
        entity.name = contact.name;
        entity.phone = contact.phone;
        return entity;
    }

    @Transactional
    public void delete(long id) {
        Contact.delete("id", id);
    }
}
