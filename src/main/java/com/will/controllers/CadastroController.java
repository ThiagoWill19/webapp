package com.will.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.will.entities.Cadastro;
import com.will.repositories.CadastroRepository;

@Controller
@RequestMapping("/login")
public class CadastroController {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public ModelAndView getPage() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("cadastro",new Cadastro());
		return mv;
	}
	
	@PostMapping
	public ModelAndView save(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
		ModelAndView mv = new ModelAndView("thankspage");
		return mv;
	}

}
