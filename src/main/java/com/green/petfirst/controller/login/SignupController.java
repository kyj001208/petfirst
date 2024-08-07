package com.green.petfirst.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.green.petfirst.domain.dto.SignupDTO;
import com.green.petfirst.service.SignupService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class SignupController {
	
	private final SignupService service;
	
	@GetMapping("/public/signup")
	public String signup() {
		return "/views/login/signup";
	}
	
	@PostMapping("/public/signup")
	public String signupsave(SignupDTO dto) {
		
		service.saveProcess(dto);
		
		return "";
	}
	

}
