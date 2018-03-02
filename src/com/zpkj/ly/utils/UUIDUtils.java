package com.zpkj.ly.utils;

import java.util.UUID;


/**
* @ClassName: UUIDUtils
* @Description: TODO(获取UUID)
* @author liyang
* @date 2018年3月2日 上午11:50:21
* 
*/
public class UUIDUtils {
	
	public static String getUUID32(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static String getUUID36(){
		return UUID.randomUUID().toString();
	}

}
