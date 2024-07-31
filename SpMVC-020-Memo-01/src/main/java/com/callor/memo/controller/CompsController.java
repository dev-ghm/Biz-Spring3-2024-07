package com.callor.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="/comps")
public class CompsController {

	@RequestMapping(value="/input",method=RequestMethod.GET)
	public String input() {
		return null;
	}
	
	
	@RequestMapping(value="/update/{m_seq}",method=RequestMethod.GET)
	public String update(String m_seq) {
		log.debug("PK: {}",m_seq);
		return "comps/input";
	}
	
	@RequestMapping(value="/input",method=RequestMethod.GET)
	public String input() {
		return;
	}
	
}
