package com.split.configuration;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 System.out.println("calling getRootConfigClasses");
		  return new Class[] {
				   ApplicationConfiguration.class
				    };
		 
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 System.out.println("calling getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("calling getServletMappings");
		  return new String[] {
				   "/rest/*"
				  };
	}
	@Override
	public void onStartup(ServletContext servletContext) 
			throws ServletException {
		System.out.println("onStartup");
		super.onStartup(servletContext);
		
	}

}
