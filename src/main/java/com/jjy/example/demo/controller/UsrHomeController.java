package com.jjy.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	private int count;
	
	public UsrHomeController() {
		count = -1;
	}
	
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	
	public int getCount() {
		return count;
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	
	public String setCount(int count) {
	this.count = count;
		count = 0;
		return "count의 값이" + this.count + "으로 초기화되었습니다.";
	}
	
	
	

}
