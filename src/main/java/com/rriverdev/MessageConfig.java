package com.rriverdev;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class MessageConfig {
	
	//cargar los properties de lenguage
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource =  new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	// Establece por dedafult un local (localizacion de idioma)
	@Bean
	public LocaleResolver localeResolver () {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.ROOT);
//		slr.setDefaultLocale(Locale.FRANCE); //tomara el properties messages_fr.properties
//		slr.setDefaultLocale(Locale.ENGLISH); //tomara el properties messages_en.properties
		return slr;
	}
	
	
	//resuelve las variables en messages
	@Bean
	public LocalValidatorFactoryBean getValidator() {
		LocalValidatorFactoryBean lvfb = new LocalValidatorFactoryBean();
		lvfb.setValidationMessageSource(messageSource());
		return lvfb;
	}
	
	
}
