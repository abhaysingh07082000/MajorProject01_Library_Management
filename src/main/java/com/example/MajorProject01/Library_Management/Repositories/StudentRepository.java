package com.example.MajorProject01.Library_Management.Repositories;

import com.example.MajorProject01.Library_Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
