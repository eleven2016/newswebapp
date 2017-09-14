package com.news.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/toutiao")
public class TouTiaoController {
	private static Logger logger = Logger.getLogger(TouTiaoController.class);

	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		logger.info("测试日志");
		return "ok";
	}
	
	

}
