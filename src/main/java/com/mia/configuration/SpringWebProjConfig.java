package com.mia.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(@ComponentScan(basePackages = "com.mia.controllers"))
public class SpringWebProjConfig {

}
