package com.zpkj.ly.test;

import com.zpkj.ly.utils.JsonUtil;

public class JsonTest {
	public static void main(String[] args) {
	String[] info = {"leon","12","java","成都","嘿"};
	String json = JsonUtil.toJson(info);
	System.out.println(json);
	}

}
