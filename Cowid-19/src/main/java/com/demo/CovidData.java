package com.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class CovidData {
	@RequestMapping("/total_cases_CountryWise")
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.total_cases_CountryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
}
	
	
	@RequestMapping("/total_cases")
	public ModelAndView add2(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		
		String Result=d.total_cases();
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		
		mv.addObject("result",Result);
		 return mv;
	}
	
	@RequestMapping("/newCases_countryWise")
	public ModelAndView add3(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.newCases_countryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
	}
	
	@RequestMapping("/total_newCases")
	public ModelAndView add4(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		
		String Result=d.total_newCases();
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		
		mv.addObject("result",Result);
		 return mv;
	}
	
	@RequestMapping("/total_deaths_CountryWise")
	public ModelAndView add5(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.total_deaths_CountryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
		 }
	
	@RequestMapping("/new_deaths_CountryWise")
	public ModelAndView add6(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.new_deaths_CountryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
	}
	
	@RequestMapping("/new_tests_CountryWise")
	public ModelAndView add7(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.new_tests_CountryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
	}
	
	@RequestMapping("/total_tests_CountryWise")
	public ModelAndView add8(HttpServletRequest request, HttpServletResponse response) {
		
		DataFetch d=new DataFetch();
		Map<String,String> map=d.total_tests_CountryWise();
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",map);
		
		 return mv;
	}
	
	
}