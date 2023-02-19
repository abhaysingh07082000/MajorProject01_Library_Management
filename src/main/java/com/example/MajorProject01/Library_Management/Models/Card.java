package com.example.MajorProject01.Library_Management.Models;


import com.example.MajorProject01.Library_Management.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


//this card class is child class with respect to parent (student)class

@Entity      //this annotation ensure that this student entity connected to table
@Table(name="card")   //define the name of the table ("student")
public class Card {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;  //it will automatically generated

    //it will automatically create time when the card is created
    @CreationTimestamp
    private Date createdOn;//it will automatically generated


    //it will automatically update  time when the card is created
    @UpdateTimestamp
    private Date updatedOn;//it will automatically generated


    //this ensure the status of the card
    //enumeration means these are the advance data types which have fixed values
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;//we need to set the card status


    //this is the entity mapping
    //OneToOne means first one is represents the current class mapping and second one is parent class mapping
    //beacause here card is onetoOne mapped with the parent class(student)
    //@Joincloumn means add the column in table

    @OneToOne
    @JoinColumn
    private Student studentVariableName;  //this is the variable name which is used in the parent class mappedBy


    //default constructor
    public Card() {
    }


    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }
}
