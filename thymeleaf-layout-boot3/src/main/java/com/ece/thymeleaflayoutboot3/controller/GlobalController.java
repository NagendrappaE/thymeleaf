/**
 * 
 */
package com.ece.thymeleaflayoutboot3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ece.thymeleaflayoutboot3.bean.MenuGroup;
import com.ece.thymeleaflayoutboot3.bean.MenuItem;

/**
 * @author nagendrappae
 *
 */
@ControllerAdvice
public class GlobalController {

	@Value("${public.api.base.url}")
	private String publicurl;

	@ModelAttribute(name = "menuGroupList")
	public List<MenuGroup> group(Model model) {

		List<MenuGroup> groupList = new ArrayList<>();
		MenuGroup group1 = new MenuGroup();

		group1.setGroupName("mandate");

		groupList.add(group1);

		MenuGroup group2 = new MenuGroup();

		group2.setGroupName("payment");

		groupList.add(group2);

		return groupList;

	}

	@ModelAttribute(name = "menuitemList")
	public List<MenuItem> menuitem(Model model) {

		List<MenuItem> menuList = new ArrayList<>();
		MenuItem menu1 = new MenuItem();

		menu1.setMenuName("viewMandate");
		menu1.setType("INLINE");
		menu1.setLink("/spomandate/viewmandate");
		menuList.add(menu1);

		MenuItem menu2 = new MenuItem();

		menu2.setMenuName("editMandate");
		menu2.setType("INLINE");
		menu2.setLink("/spomandate/editmandate");

		menuList.add(menu2);

		MenuItem menu3 = new MenuItem();

		menu3.setMenuName("ACK");
		menu3.setType("QUEUE");
		menu3.setLink("/spomandate/queueList");
		menuList.add(menu3);

		MenuItem menu4 = new MenuItem();

		menu4.setMenuName("Pending Send");
		menu4.setType("QUEUE");
		menu4.setLink("/spomandate/queueList");
		menuList.add(menu4);

		return menuList;

	}

	@ModelAttribute(name = "publicapiurl")
	public String publicurl() {

		return publicurl;
	}

}
