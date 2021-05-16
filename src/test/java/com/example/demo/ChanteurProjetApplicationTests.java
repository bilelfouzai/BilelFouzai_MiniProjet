package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.demo.entities.chanteur;
import com.example.demo.repos.chanteurRepo;
import com.example.demo.service.chanteurService;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ChanteurProjetApplicationTests {
	@Autowired
	private chanteurRepo chanteurRepository;
	@Autowired
	private chanteurService chanteurService;

	@Test
	public void testCreateChanteur() {
		chanteur ch = new chanteur("Wassim","abdou",new Date(),"tunis");
		chanteurRepository.save(ch);

}
	
	@Test
	public void testFindchanteur()
	{
		chanteur p = chanteurRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdatechanteur()
	{
	chanteur p = chanteurRepository.findById(1L).get();
	p.setNom("salah");
	chanteurRepository.save(p);
	}
	@Test
	public void testDeletechanteur(){
		chanteurRepository.deleteById(1L);;
	}

	@Test
	public void testListerTouschanteurs()
	{
	List<chanteur> prods = chanteurRepository.findAll();
	for (chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	
	
	
	@Test
	public void testFindByNomChanteurContains()
	{
		
		
	Page<chanteur> prods = chanteurService.getAllChanteurParPage(0,2);
	System.out.println(prods.getSize());
	System.out.println(prods.getTotalElements());
	System.out.println(prods.getTotalPages());
	prods.getContent().forEach(p -> {System.out.println(p.toString());
	 });
	/*ou bien
	for (chanteur p : prods)
	{
	System.out.println(p);
	} */
	}

	@Test
	public void testFindByNomchanteur()
	{
	List<chanteur> prods = chanteurRepository.findBynom("firas");
	for (chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomchanteurContains ()
	{
	List<chanteur> prods=chanteurRepository.findBynomContains("Wassim");
	for (chanteur p : prods)
	{
	System.out.println(p);
	} 
	}
	
	@Test
	public void testfindByNomseul ()
	{
	List<chanteur> prods = chanteurRepository.findByNomseul("wassim");
	for (chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	
	 	
	

}
