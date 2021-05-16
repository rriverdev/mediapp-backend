package com.rriverdev.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;

@RestController
@RequestMapping("/utils")
public class UtilController {
	
	@Autowired
	private LocaleResolver localResolver;
	
	@Autowired
	private HttpServletRequest httpServletRequest;

	@Autowired
	private HttpServletResponse httpServletResponse;
	
	/*ejemplo Cmabio de Idioma*/
	@GetMapping("/local/{loc}")
	public ResponseEntity<Void> changeLocal(@PathVariable("loc")String loc){
		Locale userLocal =  null;
		
		switch (loc) {
		case "en":
			userLocal = Locale.ENGLISH;
			break;
		case "fr":
			userLocal = Locale.FRENCH;
			break;

		default:
			userLocal = Locale.ROOT;
			break;
		}
		
		localResolver.setLocale(httpServletRequest, httpServletResponse, userLocal);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}




}
