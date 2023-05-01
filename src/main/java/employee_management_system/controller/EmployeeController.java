package employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import employee_management_system.dao.EmployeeDao;
import employee_management_system.dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("employee", new Employee());
		mav.setViewName("saveEmployee.jsp");
		return mav;
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		dao.saveEmployee(employee);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addEmployee.jsp");
		return mav;
		
	}
	
}
