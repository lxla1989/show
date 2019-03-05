package org.lxl.show.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexControl {
	@RequestMapping("/")
	public String index() {
		/**
		 * 此处的"static/"
		 * 结合application.properties配置文件里spring.mvc.static-path-pattern这个配置项来加
		 */
		return "static/index.html";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
