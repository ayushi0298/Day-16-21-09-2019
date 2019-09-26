package com.ssi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {

	@Autowired
	private ServiceInterface service;

	@RequestMapping("insertconfirm")
	public ModelAndView enterEmployee(@ModelAttribute("employee") DetailsModel emp) {
		service.insertEmployee(emp);
		ModelAndView mv = new ModelAndView("redirect:viewall");
		return mv;

	}

	@RequestMapping("insertForm")
	public ModelAndView insertEmployee(@ModelAttribute("employee") DetailsModel emp) {
		ModelAndView mv = new ModelAndView("insert");
		return mv;

	}

	@RequestMapping("delete")
	public ModelAndView deleteEmployee(@RequestParam("eno") int eno) {
		service.deleteEmployee(eno);
		ModelAndView mv = new ModelAndView("redirect:viewall");
		return mv;
	}

	@RequestMapping("viewall")
	public ModelAndView showAllRecords() {
		List<DetailsModel> employees = service.getAllEmployee();
		ModelAndView mv = new ModelAndView("view");
		mv.addObject("employees", employees);
		return mv;
	}

	@RequestMapping("update")
	public ModelAndView getEmployee(@RequestParam("eno") int eno) {
		DetailsModel detail = service.getEmployee(eno);
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("updates", detail);
		return mv;
	}

	@RequestMapping("up")
	public ModelAndView updateEmployee(@ModelAttribute("employee") DetailsModel emp) {
		service.updateEmployee(emp);
		ModelAndView mv = new ModelAndView("redirect:viewall");
		return mv;
	}

	@RequestMapping("savemp")
	public ModelAndView insertconfirm(@Valid @ModelAttribute("employee") DetailsModel model, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("insert");
			return mv;

		}

		// saving data
		service.insertEmployee(model);
		ModelAndView mv = new ModelAndView("redirect:viewall");
		
		return mv;

	}

}
