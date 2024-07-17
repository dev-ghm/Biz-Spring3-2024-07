package com.callor.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/bbs")
public class BBSController {
	
	// localhost:8080/student/bbs/
	// localhost:8080/student/bbs 배열을 만들어서 뒤에 슬래시를 하거나 안 하거나 똑같은 경로로 간다
	@RequestMapping(value = {"/",""},method = RequestMethod.GET)
	public String bbs() {
		return "bbs/list";
	}
	
	@RequestMapping(value = "/notice",method = RequestMethod.GET)
	public String notice() {
		
		
		return null;
	}
}
