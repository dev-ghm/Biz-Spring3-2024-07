package com.callor.hello;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.hello.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/*
	 * 의존성 주입 
	 * 일번적인 Java 코드에서 다른 클래스에 선언된
	 * method, 변수 등을 사용하기 위해서
	 * 클래스의 생성자를 호출하여 객체를 생성한 후 사용해야한다
	 * spring 에서는 클래스의 생성자를 호출하여 객체를 생성하는 경우가 극히 드물다
	 * Service 클래스를 Controller 등에서 사용하기 위해서는
	 * 먼저 Service 클래스에 @Service Annotation 을 부착하여 Spring Server 가 시작될때, Scan 하도록 하여두고
	 * 필요한 곳에서 생성자를 통하여 주입받아서 쓴다.
	 */
	private final HomeService homeService;
	public HomeController(HomeService homeService) {
		super();
		this.homeService = homeService;
	}


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/next",method=RequestMethod.GET)
			public String next(Model model) {
		model.addAttribute("List",homeService.getList());
			return "next";
	}
	
	@RequestMapping(value="/next",method = RequestMethod.POST)
	public String next(String c_name, String c_tel) {
		
	}
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/home",method = RequestMethod.POST)
	public Stirng home(HomeVO homeVo, Model model) {
		List<String> list = new ArrayList<String>();
		list.add(homeVo.getC_name());
		list.add(homeVo.getC_tel());
		model.addAttribute(list);
		
	}
	
	
}
