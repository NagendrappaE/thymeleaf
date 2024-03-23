/**
 * 
 */
package com.ece.thymeleaflayoutboot3.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ece.thymeleaflayoutboot3.bean.MenuGroup;

/**
 * @author nagendrappae
 *
 */
@ControllerAdvice
public class GlobalController {

	@ModelAttribute(name = "group1")
	public MenuGroup dashBoard(Model model) {

		MenuGroup group1 = new MenuGroup();

		group1.setGroupName("InwardMandate");

		//MenuGroup group2 = new MenuGroup();

		//model.addAttribute("group1", group1);
		//model.addAttribute("group2", group2);

		return group1;

	}

}
