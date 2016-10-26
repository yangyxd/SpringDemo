package com.yxd.example.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	
	@RequestMapping("/mvc")
	public String helloMvc() {
		Hello bean = ContextHelper.getInstance().getBean("helloBean", Hello.class);
		bean.sayEasy();
		return "home";
	}
}
