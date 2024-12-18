package org.example.componentscan.byannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.componentscan.byannotation")
public class AppConfig {
}
