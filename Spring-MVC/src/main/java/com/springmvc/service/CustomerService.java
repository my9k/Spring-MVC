package com.springmvc.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

public interface CustomerService {
	
	ModelAndView getCustomers();
	ModelAndView showForm();
	ModelAndView addCustomer(HttpServletRequest req);
	String delete(Long id);
	

}
