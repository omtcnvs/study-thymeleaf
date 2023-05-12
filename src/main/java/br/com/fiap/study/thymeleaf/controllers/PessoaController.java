package br.com.fiap.study.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.study.thymeleaf.models.Pessoa;

@Controller
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		return "pessoas/form.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Pessoa pessoa) {
		return "pessoa/form.html";
	}
	
}
