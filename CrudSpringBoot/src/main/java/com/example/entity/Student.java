package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity 
public class Student {
    @Id 
    private long id;

    private String name;
    private String email;
    private int age;
    private int rollno;
    private String subject;
    private Boolean isDeleted = false;
    private Boolean gay;


    public void getGay(Boolean gay) {
        this.gay = gay;
    }
    public Boolean setGay() {
        return gay;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getRollno() {
        return rollno;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }

}
