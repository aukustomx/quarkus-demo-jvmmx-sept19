package com.jvmmx.contact;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact extends PanacheEntity {

    public String name;
    public String phone;
}
