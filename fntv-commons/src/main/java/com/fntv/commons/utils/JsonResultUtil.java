package com.fntv.commons.utils;

import java.util.Date;

import com.fntv.commons.bean.JsonResult;

public class JsonResultUtil {
	
	public static JsonResult success(String msg) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setCode(0);
		jsonResult.setMsg(msg);
		jsonResult.setData(null);
		jsonResult.setTimestamp(new Date().getTime());

		return jsonResult;
	}
	
	public static JsonResult success(Object data) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setCode(0);
		jsonResult.setMsg("");
		jsonResult.setData(data);
		jsonResult.setTimestamp(new Date().getTime());

		return jsonResult;
	}

	public static JsonResult success(String msg, Object data) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setCode(0);
		jsonResult.setMsg(StringUtil.isEmpty(msg) == true ? "" : msg);
		jsonResult.setData(data);
		jsonResult.setTimestamp(new Date().getTime());

		return jsonResult;
	}
	
	public static JsonResult failure(int code, String msg) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setCode(code);
		jsonResult.setMsg(StringUtil.isEmpty(msg) == true ? "" : msg);
		jsonResult.setData(null);
		jsonResult.setTimestamp(new Date().getTime());

		return jsonResult;
	}

}
