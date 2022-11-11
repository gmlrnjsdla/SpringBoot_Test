package com.heekwoncompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="test")
	public String test(Model model) {
		
		MemberDto dto = new MemberDto();
		dto.setMid("tiger");
		dto.setMname("홍길동");
		dto.setMpw("12345");
		
		model.addAttribute("dto", dto);
		
		
		return "test";
	}
}
