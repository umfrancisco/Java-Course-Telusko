package com.umfrancisco.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.umfrancisco.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
