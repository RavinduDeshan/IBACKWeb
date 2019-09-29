package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/getIndex")
	public String home111() {
		System.out.println("Home Called");
		
		return "index.html";
	}
	
	@RequestMapping("/eventManagements")
	public String dashhboar1d() {
		
		return "eventManagement.html";
	}
}
