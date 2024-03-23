/**
 * 
 */
package com.ece.thymeleaflayoutboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nagendrappae
 *
 */
@Controller
@RequestMapping("spomandate")
public class SponserMandateController {

	@GetMapping("viewmandate")
	public String viewMandate() {

		return "mandate/viewmandate";
	}

}
