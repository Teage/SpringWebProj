package com.mia.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class myAppIntializer implements WebApplicationInitializer {
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        //creating object of ApplicationContext
        AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
        //Register Configuration class...
          webAppContext.register(SpringWebProjConfig.class);

        System.out.println("Web Application Initializer ======== Teage");
       DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);
       ServletRegistration.Dynamic  customServlet =  servletContext.addServlet("dispatcherServlet",dispatcherServlet);

       customServlet.setLoadOnStartup(1);
       customServlet.addMapping("/ngowebsite.com/*");

    }
}
