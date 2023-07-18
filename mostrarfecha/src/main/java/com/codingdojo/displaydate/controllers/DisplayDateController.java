package com.codingdojo.displaydate.controllers;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d 'de' MMMM, yyyy");
	    String formattedDate = sdf.format(date);
	    model.addAttribute("date", formattedDate);
		return "date.jsp";

	}
	@RequestMapping("/time")
	public String time(Model model) {
	    Date date = new Date();
	    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	    String formattedTime = timeFormat.format(date);
	    model.addAttribute("time", formattedTime);
		return "time.jsp";
		
	}
	
}
