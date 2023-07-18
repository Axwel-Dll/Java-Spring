package com.codingdojo.contador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String contador(HttpSession session) {
		// session.setMaxInactiveInterval(5);
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);

		return "index.jsp";

	}
	@RequestMapping("/contador")
	public String count(HttpSession session) {
		// session.setMaxInactiveInterval(5);
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);

		return "contador.jsp";

	}

	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();

		return "index.jsp";
	}

	@RequestMapping("/double")
	public String contador2(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer count = (Integer) session.getAttribute("count");
		count += 2;
		session.setAttribute("count", count);
		return "double.jsp";
	}

}
