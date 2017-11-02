package com.base.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Util.GlobalUtil;

import com.base.data.CustomerContextHolder;
import com.base.user.service.UserService;

/**
 * Home Controller
 * 
 * @author LLS
 * 
 * @Time 2017-11-1
 */
@Controller
public class HomeController {

	@Autowired
	private UserService serice;

	@RequestMapping("/")
	public String index(Model model) {
		return "/index";
	}

	/**
	 * 从默认数据库中获取User列表
	 * 
	 * @return
	 */
	@RequestMapping("/userFormD1")
	@ResponseBody
	public String getUserFormD1() {
		return GlobalUtil.toGson(serice.findList());
	}

	/**
	 * 从目标数据库中获取User列表
	 * 
	 * @return
	 */
	@RequestMapping("/userFormD2")
	@ResponseBody
	public String getUserFormD2() {
		CustomerContextHolder
				.setCustomerType(CustomerContextHolder.targetDataSource);
		return GlobalUtil.toGson(serice.findList());
	}
}
