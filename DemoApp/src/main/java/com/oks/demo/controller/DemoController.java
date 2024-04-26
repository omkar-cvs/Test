package com.oks.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/getData")
	public String getData() {
		return "welcome jenkins project deployments success now";
	}

}
