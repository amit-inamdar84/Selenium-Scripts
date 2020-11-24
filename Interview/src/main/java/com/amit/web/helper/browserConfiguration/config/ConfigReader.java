package com.amit.web.helper.browserConfiguration.config;

import com.amit.web.helper.browserConfiguration.BrowserType;
//Framework required few methods to be implemented mandatorily. Such methods can be listed here.

public interface ConfigReader {
	public int getImplicitWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUrl1();
	public String getUserName();
	public String getPassword();
}
