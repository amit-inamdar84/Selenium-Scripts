package com.amit.web.helper.resource;

public class ResourceHelper {
	public static String getResourcePath(String path){
		String basePath = System.getProperty("user.dir") + path;
		return basePath;
	}
	
	public static void main(String[] args) {
		String path = ResourceHelper.getResourcePath("/src/main/resources/configFile/log4j.properties");
		System.out.println(path);
	}

}
