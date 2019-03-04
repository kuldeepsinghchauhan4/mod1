package com.cg.sp.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/homePage")
public String displayHomePage() {
	return "Home";
}
}
