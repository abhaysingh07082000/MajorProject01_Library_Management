package com.example.MajorProject01.Library_Management.Repositories;

import com.example.MajorProject01.Library_Management.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//in this layer we generally write the database  things
@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
