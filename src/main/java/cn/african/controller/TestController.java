package cn.african.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("test")
	public @ResponseBody String home() {
		logger.info("-----------------> 进入控制层");
		return "welcome to home";
	}

}
