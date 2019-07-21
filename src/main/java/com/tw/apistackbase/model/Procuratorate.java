package com.tw.apistackbase.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Procuratorate {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
