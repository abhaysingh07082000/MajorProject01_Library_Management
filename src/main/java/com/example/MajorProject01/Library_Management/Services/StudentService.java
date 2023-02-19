package com.example.MajorProject01.Library_Management.Services;

import com.example.MajorProject01.Library_Management.Enums.CardStatus;
import com.example.MajorProject01.Library_Management.Models.Card;
import com.example.MajorProject01.Library_Management.Models.Student;
import com.example.MajorProject01.Library_Management.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//in this layer generally business logic is written
@Service
public class StudentService {

    //this will automatically created the object of the repository student  class
    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student)
    {

      //our intention is that when client made request for adding student the card will automatically generate
        //so we made card object and set the card status as active
        //and also bring the student variable name from the class and set to the stident variable name to the card

        Card card=new Card();
        card.setCardStatus(CardStatus.ACTIVE);
        card.setStudentVariableName(student);

        //assign card to the student
        student.setCard(card);

        //we don't need to explicitly save the card it will automatically save
        //we just need to save the student
        studentRepository.save(student);
        return "student and card added successfully";
    }
}
