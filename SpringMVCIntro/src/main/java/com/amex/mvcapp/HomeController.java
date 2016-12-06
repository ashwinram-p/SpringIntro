package com.amex.mvcapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home!");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/**
	 * TODO: 
	 * 1.Create a new CreditCard class with the following parameters
	 * 		- Name on card
	 * 		- Card Number
	 * 		- Expiration date
	 * 		- CVV
	 * 		- Card type (Personal,Business)
	 * 		- Balance
	 * 2.Create a CreditCard controller class which takes the CreditCard data as a model 
	 *  	and displays a view "CardInfo" which prints all the fields of the bean with a 
	 *  	message at the top and current date in MM/DD/YYYY format.
	 */
}
