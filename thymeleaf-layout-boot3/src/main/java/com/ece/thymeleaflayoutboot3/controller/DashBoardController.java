package com.ece.thymeleaflayoutboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DashBoardController {

	@GetMapping
	public String welcome() {
		
		return "layout-flux";
	}
}
