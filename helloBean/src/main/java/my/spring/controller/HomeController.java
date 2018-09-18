package my.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	@Autowired
	private Hello helloBean;
	
	@RequestMapping("/hello.do")
	public String hello(model model) {
		String msg = helloBean.sayHello();
		model.addAttribute("greet",msg);
		return "hello.jsp";
	}
}
