package br.com.fiap.study.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.study.thymeleaf.models.Pessoa;
import br.com.fiap.study.thymeleaf.repositories.PessoaMockup;

@Controller
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("pessoa", new Pessoa());
		return "pessoas/form.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		return "pessoas/form.html";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("pessoas", PessoaMockup.getAll());
		return "pessoas/list.html";
	}
	
}
