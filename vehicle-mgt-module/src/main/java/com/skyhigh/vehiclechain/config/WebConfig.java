package com.skyhigh.vehiclechain.config;

import com.skyhigh.vehiclechain.util.UserToUserDtoConvertor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new UserToUserDtoConvertor());
        WebMvcConfigurer.super.addFormatters(registry);
    }
}
