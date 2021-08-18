package com.jonathan.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{userinput}")
	public String index(@PathVariable("userinput") String userinput) {
		if (userinput.equals("dojo")) {
			return "The dojo is awesome!";
			
		
			} else if (userinput.equals("burbank-dojo")) {
				return "Burbank Dojo is located in Southern California.";
			} else if (userinput.equals("san-jose")) {
				return "SJ dojo is the headquarters.";
			}
		return "Hello";
		}
}
