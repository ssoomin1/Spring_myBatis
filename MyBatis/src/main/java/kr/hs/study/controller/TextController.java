package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.dto.LoginDTO;

@Controller
public class TextController {
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}
	
	@PostMapping("/login_re")
	public String re(@ModelAttribute LoginDTO dto,Model model) {
		model.addAttribute("login",dto);
		return "result";
	}
	
}
