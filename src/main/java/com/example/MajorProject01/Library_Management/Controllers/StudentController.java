package com.example.MajorProject01.Library_Management.Controllers;


import com.example.MajorProject01.Library_Management.Models.Student;
import com.example.MajorProject01.Library_Management.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//this is the layer in which client made request for fetching the data
//in this layer we write the REST API's

@RestController
@RequestMapping
public class StudentController {


    @Autowired  //it autowired the service class objects means automatically create object of the service class
    StudentService studentService;


    //request for adding the student
    @PostMapping("/add")
    public String createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }
}
