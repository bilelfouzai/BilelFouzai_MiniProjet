package com.example.demo.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.chanteur;

public interface chanteurService {
	Page<chanteur> getAllChanteurParPage(int page, int size);

		chanteur saveChanteur(chanteur p);
	chanteur updatechanteur(chanteur p);
	void deletechanteur(chanteur p);
	 void deletechanteurById(Long id);
	chanteur getchanteur(Long id);
	List<chanteur> getAllchanteur();	
	List<chanteur> findBynom(String nom);
	 List<chanteur> findBynomContains(String nom);

	}

