package com.example.rjd_spring_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "technic")
public class Tram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "code")
    private String Code;

    @Column(name = "name")
    private String Name;

    public Tram(int id, String code, String name) {
        Id = id;
        Code = code;
        Name = name;
    }

    public Tram() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
