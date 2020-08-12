package com.indika.displaydate;

//import new java.util.Date();
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		java.util.Date time=new java.util.Date();
		DateFormat format = new SimpleDateFormat("h:mm a");
		String str = format.format(time);
		model.addAttribute("time", str);
		return "time.jsp";
	}
	
	
	@RequestMapping("/date")
	public String date(Model model) {
	
		java.util.Date date=new java.util.Date();
		DateFormat format = new SimpleDateFormat("MM-dd-YYYY");
		String str = format.format(date);
		model.addAttribute("date", str);
		return "Date.jsp";
		
		
		
	}
	
	
	
	
//	@RequestMapping("/date")
//	public java.util.Date Date(@PathVariable("date") String date) {
//		return new java.util.Date();
//	}
		
		
		


	
	
	
	
	
	
}
