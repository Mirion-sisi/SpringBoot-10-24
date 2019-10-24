package com.niit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	public String show(@RequestParam("id") int id,Map<String,String> datas) {
		datas.put("msg", "This is User"+id);
		return "/user/show";
	}
}
