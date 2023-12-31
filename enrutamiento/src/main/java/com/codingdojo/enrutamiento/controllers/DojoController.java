package com.codingdojo.enrutamiento.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String showLesson(@PathVariable("location") String location) {
		if (location.equals("dojo")) {
			return "¡El Dojo es increíble!";
		}
		if (location.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
		if (location.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "";
	}
}
