
package com.mobileday.interview.tminke.mynotes.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * SpringConfiguration Class
 * 
 * This class allows for "XML free" configuration of the Spring DI / MVC.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mobileday.interview.tminke.mynotes")
public class SpringConfiguration
{
    /**
     * Define Spring InternalResourceViewResolver
     * 
     * Specifies location of .jsp templates.
     * 
     * @return InternalResourceViewResolver
     */
    @Bean
    public InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
