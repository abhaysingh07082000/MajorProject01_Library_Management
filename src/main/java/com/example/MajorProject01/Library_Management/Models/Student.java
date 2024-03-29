package com.example.MajorProject01.Library_Management.Models;


import jakarta.persistence.*;

//this student class  is parent class with respect to card class


@Entity   //this annotation ensure that this student entity connected to table
@Table(name="student")  //define the name of the table ("student")
public class Student {

    @Id  //primary key of the table will be autogenerated
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy type of identity
    private int id;

    private String name;

    @Column(unique = true) // this annotation ensure that email should be unique
    private  String email;


    private int age;


    private String mobNo;

    private String country;


    //Bidirectional mapping like connected to child table by taking foreign key attribute (studentVariableName)
    //cascade means if we delete in the parent table then it automatically deleted from the child table

    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card card;


    //no arg  constructor
    public Student() {
    }

    //getters and setters
    //encapsulation concept

    public Card getCard() {
        return card;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public void setCard(Card card) {
        this.card = card;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
