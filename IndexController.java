package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("mu")
	  public ModelAndView index(@RequestParam("name") String st)
	  {
	    ModelAndView mv = new ModelAndView(); 
	    mv.addObject("username", st);
	    mv.setViewName("mukilan.jsp");
	    return mv; 
//	    System.out.println("*** "+ st + " *** ");
//	    return "mukilan.jsp";
	  
	  }
}
