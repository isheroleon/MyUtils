package com.zpkj.ly.test;

import com.zpkj.ly.utils.MD5Utils;

public class Test {
	public static void main(String[] args) {
		String password = "11111";
		String md5 = MD5Utils.md5(password);
		System.out.println(md5);
	}

}
