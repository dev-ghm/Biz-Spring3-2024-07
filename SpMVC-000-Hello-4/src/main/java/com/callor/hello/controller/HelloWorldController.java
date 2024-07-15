package com.callor.hello.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.service.HelloService;

	
	@Controller
	public class HelloWorldController {

		@RequestMapping("/helloworld")
		public String helloWorld(){
			return "helloworld";
		}
		
	

}
