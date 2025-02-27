package com.xworkz.bag.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses is invoked");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses is invoked");
        return new Class[]{SpringBagConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings is invoked");
        return new String[]{"/"};
    }
}
