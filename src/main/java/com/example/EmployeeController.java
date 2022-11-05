package com.example;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO dao;

	// Inserting
	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpname(request.getParameter("empname"));
		e.setEmpemail(request.getParameter("empemail"));
		e.setAge(Integer.parseInt(request.getParameter("age")));
		Employee ee=dao.insert(e);
		if(ee!=null) {
			mv.setViewName("success.jsp");
		}

		return mv;
	}

// Retrieving

	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		List<Employee> list= dao.getall();
		mv.setViewName("display.jsp");
		mv.addObject("list",list);

		return mv;
	}
	
	
	// Edit or Update
	
	@RequestMapping("/EditEmployee")
	public ModelAndView Edit(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpno(Integer.parseInt(request.getParameter("empno")));
		e.setEmpname(request.getParameter("empname"));
		e.setEmpemail(request.getParameter("empemail"));
		e.setAge(Integer.parseInt(request.getParameter("age")));
		Employee e2= dao.EditUser(e);
		
		if(e2!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;

   }
	
	// Delete Employee
	@RequestMapping("/DeleteEmployee")
	public ModelAndView Delete(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpno(Integer.parseInt(request.getParameter("empno")));
		String result=dao.DeletebyID(e);
		mv.setViewName("success.jsp");
		mv.addObject(result);
		return mv;	
}
}
