package com.jonathan.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
	@RequestMapping("/") 
		public String index() {
		return "Hello Client! How are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings!";
	}
}
