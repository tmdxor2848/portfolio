package com.example.solo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.solo.user.FamilyService;

@Controller
public class SoloController {
	
	@Autowired
	private FamilyService familyService;
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "sign_in";
	}
	
	@RequestMapping("/sign_up")
	public String signUpPage() {
		return "sign_up";
	}
	
	@PostMapping("/signup")
    public ModelAndView createFamily(String userID, String password, String name, String gender, String birthdate, String phonenum) {
       // familyService.createFamily();
        return new ModelAndView("welcom"); // 회원가입 성공 후 리디렉션 할 페이지
    }
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/welcom")
	public String welcom() {
		return "welcom";
	}
}
