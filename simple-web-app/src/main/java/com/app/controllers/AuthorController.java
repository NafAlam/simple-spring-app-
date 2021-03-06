package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.AuthorRepository;

@Controller
public class AuthorController {

	@Autowired
	AuthorRepository authorRepository;
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		
		model.addAttribute("authors", authorRepository.findAll());
		
		return "authors/list";
	}
	
}
