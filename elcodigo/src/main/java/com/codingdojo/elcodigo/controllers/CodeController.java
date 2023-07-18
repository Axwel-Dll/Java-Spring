package com.codingdojo.elcodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/code")
	public String code(@RequestParam(value="code") String code, RedirectAttributes msj) {
		if (code.equals("bushido")) {
			return "code.jsp";
		}
		else {
			msj.addFlashAttribute("error" , "You must train harder!");
			return "redirect:/";
		}
	}
}
