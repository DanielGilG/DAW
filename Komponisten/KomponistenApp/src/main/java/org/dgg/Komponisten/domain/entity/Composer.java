package org.dgg.Komponisten.domain.entity;

public class Composer {
    private int id;
    private String name;
    private String country;

    public Composer(){}

    public Composer(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Composer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}