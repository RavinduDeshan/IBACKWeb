package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import com.eventmgr.controller.EveeentController;
import com.eventmgr.model.Event;


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
	
	@RequestMapping("/adminEventDtls")
	public String adminEventDtls( HttpServletRequest request,Model model,ModelAndView testModel) {
		System.out.println("test");
        String emailId1 = (String)model.asMap().get("customerEmail");
        EveeentController ev= new EveeentController();
        Event evlst=new Event();
        //name=(ename.replaceAll("\\p{P}",""));
        evlst=ev.geteventDetails(emailId1.replaceAll("\\p{P}",""));		
	
		
		//evlst.setEname("aaaaaaaaaaaaa");
		//evlst.setElocation("eeee");
		//edirectAttributes.addFlashAttribute("message", evlst);
       // Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
       // String emailId2 =  (String) flashMap.get("customerEmail");
       // model2.put("message",emailId2 );
        model.addAttribute("event", evlst);
        //Map<String, Object> modeil = new HashMap<String, Object>();
		
        //modeil.put("numberOfMovies", "1234");

        System.out.println("testmeeeeeeeeee"+emailId1);
        
		return "Admin Event Details.jsp";
	}
}
