package com.jjy.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjy.example.demo.service.memberService;

@Controller
public class UsrMemberController {
	

	private memberService memberService;
	
	public UsrMemberController(memberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	
	public String doJoin(String loginId, String loginPW, String name, String nickname, String cellphoneNo, String eamil)  {
		

		memberService.join(loginId, loginPW, name, nickname, cellphoneNo, eamil);
		return "성공";
	}

}

