package com.fntv.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fntv.commons.bean.JsonResult;
import com.fntv.commons.utils.JsonResultUtil;

@RestController
@RequestMapping("/")
public class AuthController {

	@PostMapping("/login")
	public JsonResult login(String account, String password) {
		JSONObject data = new JSONObject();
		data.put("account", account);
		data.put("password", password);

		return JsonResultUtil.success("登录成功");
	}

}
