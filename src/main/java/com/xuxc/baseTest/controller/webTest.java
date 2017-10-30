package com.xuxc.baseTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webTest {
	
	@GetMapping("/showLog")
	public String showLog() {
		/**
		 * 使用http://127.0.0.1:10010/base/showLog
		 * 顺利访问并返回值
		 */
		return "base";
	}
}
