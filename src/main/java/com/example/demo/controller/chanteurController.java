package com.example.demo.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.chanteur;
import com.example.demo.service.chanteurService;

@Controller
public class chanteurController {
	@Autowired
	chanteurService chanteurService;


	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
	modelMap.addAttribute("chanteur", new chanteur());
	return "createChanteur";
	}

	@RequestMapping("/saveChanteur")
	public String saveChanteur(@Valid chanteur chanteur, BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) 
		return "createChanteur";

	chanteurService.saveChanteur(chanteur);
	return "createChanteur";
	}


	
	
	@RequestMapping("/ListeChanteurs")
	public String listeChanteurs(ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	Page<chanteur> prods = chanteurService.getAllChanteurParPage(page, size);
	modelMap.addAttribute("chanteurs", prods);
	 modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	return "listeChanteurs";
	}
	
	@RequestMapping("/supprimerChanteur")
	public String supprimerChanteur(@RequestParam("id") Long id,
	ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	chanteurService.deletechanteurById(id);
	Page<chanteur> prods = chanteurService.getAllChanteurParPage(page,size);
	modelMap.addAttribute("chanteurs", prods);
	modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	modelMap.addAttribute("size", size);
	return "listeChanteurs";
	}
	
	@RequestMapping("/modifierChanteur")
	public String editerChanteur(@RequestParam("id") Long id,ModelMap modelMap)
	{
	chanteur p= chanteurService.getchanteur(id);
	modelMap.addAttribute("chanteur", p);
	return "editerChanteur";
	}
	@RequestMapping("/updateChanteur")
	public String updateChanteur(@ModelAttribute("chanteur") chanteur chanteur,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		//conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date datenaiss = dateformat.parse(String.valueOf(date));
		 chanteur.setDatenaiss(datenaiss);

		 chanteurService.updatechanteur(chanteur);
		 List<chanteur> prods = chanteurService.getAllchanteur();
		 modelMap.addAttribute("chanteur", prods);
		return "listeChanteurs";
		}
	
	}

