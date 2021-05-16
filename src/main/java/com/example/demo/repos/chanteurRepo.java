package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.chanteur;

public interface chanteurRepo extends JpaRepository<chanteur, Long> {
List<chanteur> findBynom(String nom);
 List<chanteur> findBynomContains(String nom);

 @Query("select p from chanteur p where p.nom like %?1 ")
 List<chanteur> findByNomseul (String nom);
 

}	




