package com.will.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.will.entities.Cadastro;
import com.will.services.MailService;

@Controller
@RequestMapping("/login")
public class CadastroController {
	
	@Autowired
	private MailService mailService;
	
	@GetMapping
	public ModelAndView getPage() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("cadastro",new Cadastro());
		return mv;
	}
	
	@PostMapping
	public ModelAndView save(Cadastro cadastro) {
		mailService.send(cadastro);
		ModelAndView mv = new ModelAndView("thanksPage");
		return mv;
	}

}
