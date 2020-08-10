package com.amit.utils;

public enum EndpointURL {
	TODOS("/todos"),//API for get and post todos
	TODOS_BY_ID("/todos/"),//Declaring endpoint URL for todo by ID
	ADD_USERS("/users/"),//Post API call for creating new user
	CREATE_POSTS("/posts/");
	
	String resourcePath;
	EndpointURL(String resourcePath){
		this.resourcePath = resourcePath;
	}
	
	public String getResourcePath(){//This method will return the initialized resource path variable
		return this.resourcePath;
	}
	
	public String getResourcePath(String data){//This method will return the initialized resource path variable combined with data passed to it.
		return this.resourcePath+data;
	}
	
	public static void main(String[] args) {
		System.out.println(EndpointURL.TODOS_BY_ID.getResourcePath(String.valueOf(1)));
		String url = URL.fixURL+EndpointURL.TODOS_BY_ID.getResourcePath(String.valueOf(1));
		System.out.println(url);
	}

}
