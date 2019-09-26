package com.ssi;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServelet extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ProjectConf.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
