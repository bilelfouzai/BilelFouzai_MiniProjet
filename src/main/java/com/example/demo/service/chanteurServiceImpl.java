package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.chanteur;
import com.example.demo.repos.chanteurRepo;


@Service
public class chanteurServiceImpl implements chanteurService {
	
	@Autowired
	chanteurRepo chanteurRepository;
	
	@Override
	public chanteur updatechanteur(chanteur p) {
	return chanteurRepository.save(p);
	}
	
	@Override
	public Page<chanteur> getAllChanteurParPage(int page, int size) {
	return chanteurRepository.findAll(PageRequest.of(page, size));
	}
	
	@Override
	public void deletechanteur(chanteur p) {
	chanteurRepository.delete(p);
	}
	 @Override
	public void deletechanteurById(Long id) {
	chanteurRepository.deleteById(id);
	}
	@Override
	public chanteur getchanteur(Long id) {
	return chanteurRepository.findById(id).get();
	}
	@Override
	public List<chanteur> getAllchanteur() {
	return chanteurRepository.findAll();
	}
	@Override
	public chanteur saveChanteur(chanteur p) {
		return chanteurRepository.save(p);

	}
	
	@Override
	public List<chanteur> findBynom(String nom) {
	return chanteurRepository.findBynom(nom);
	}
	@Override
	public List<chanteur> findBynomContains(String nom) {
	return chanteurRepository.findBynomContains(nom);
	}
	
	
	}


