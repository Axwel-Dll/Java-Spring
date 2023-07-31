package com.codingdojo.juego.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class GoldController {
	@RequestMapping("/gold")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
		}
		return "index.jsp";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/findgold", method=RequestMethod.POST)
	public String findGold(HttpSession session, @RequestParam(value="place") String place,Model model) {
		String timeStamp = new SimpleDateFormat("MMMMM dd yyyy HH:mm a").format(new Date());
		
		if(place.equals("farm")) {
			Integer randomGold = getRandomGold(20,10);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randomGold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a farm and earned "+randomGold+" gold. ("+timeStamp+")");

		}else if (place.equals("cave")) {
			Integer randomGold = getRandomGold(10,5);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randomGold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a cave and earned "+randomGold+" gold. ("+timeStamp+")");
		}else if (place.equals("house")) {
			Integer randomGold = getRandomGold(5,2);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randomGold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a house and earned "+randomGold+" gold. ("+timeStamp+")");
		}else if(place.equals("casino")) {
			Integer randomGold = getRandomGold(50,-50);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randomGold);
			if(randomGold<0) {
				((ArrayList<String>) session.getAttribute("activities")).add("You entered a Casino and lost "+randomGold+" gold. Ouch .. ("+timeStamp+")");
			}else {
				((ArrayList<String>) session.getAttribute("activities")).add("You entered a Casino and won "+randomGold+" gold. ("+timeStamp+")");
			}
		}	
		
		return "redirect:/gold";
	}
	
	public int getRandomGold(int max, int min) {
		Random rand = new Random();
		int value = rand.nextInt((max-min)+1)+min;
		return value;
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
	session.removeAttribute("gold");
	return "redirect:/gold";
	}
}
