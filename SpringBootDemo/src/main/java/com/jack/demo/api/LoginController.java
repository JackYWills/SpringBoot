package com.jack.demo.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/sso/login")
	@ResponseBody
	public Map<String, Object> login(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("悟空","是只猴子");
		return map;
	}
	
}
