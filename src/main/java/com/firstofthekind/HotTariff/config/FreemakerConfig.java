package com.firstofthekind.HotTariff.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@ComponentScan("com.firstofthekind.HotTariff")
@EnableWebMvc
public class FreemakerConfig implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    @Autowired
    public FreemakerConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean(name = "viewResolver")
    public ViewResolver getViewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();

        viewResolver.setCache(true);/*
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".ftl");*/
        viewResolver.setOrder(1);
        return viewResolver;
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/resources/");
    }
    @Bean(name = "freemarkerConfig")
    public FreeMarkerConfigurer getFreemarkerConfig() {
        FreeMarkerConfigurer config = new FreeMarkerConfigurer();

        // Folder containing FreeMarker templates.
        // 1 - "/WEB-INF/views/"
        // 2 - "classpath:/templates"
        config.setTemplateLoaderPath("/WEB-INF/views/");
        return config;
    }
}
