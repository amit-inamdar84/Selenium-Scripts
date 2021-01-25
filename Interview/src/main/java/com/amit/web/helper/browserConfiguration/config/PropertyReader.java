package com.amit.web.helper.browserConfiguration.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.amit.web.helper.browserConfiguration.BrowserType;
import com.amit.web.helper.resource.ResourceHelper;

public class PropertyReader implements ConfigReader {
	private static FileInputStream file;
	public static Properties OR;
	public static Properties OR1;

	public PropertyReader() {
		try {
			String filePath = ResourceHelper.getResourcePath("/src/main/resources/configfile/config.properties");
			file = new FileInputStream(new File(filePath));
			OR = new Properties();
			OR.load(file);

			// In future if another config file is required to be added to
			// framework we can use below code
			String filePath1 = ResourceHelper.getResourcePath("/src/main/resources/configfile/config1.properties");
			file = new FileInputStream(new File(filePath1));
			OR1 = new Properties();
			OR1.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getImplicitWait() {
		return Integer.parseInt(OR.getProperty("implicitWait"));
	}

	@Override
	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("explicitWait"));
	}

	@Override
	public int getPageLoadTime() {
		return Integer.parseInt(OR.getProperty("pageLoadTime"));
	}

	@Override
	public BrowserType getBrowserType() {
		return BrowserType.valueOf(OR.getProperty("browserType"));
	}

	@Override
	public String getUrl() {
		if (System.getProperty("url") != null) {
			return System.getProperty("url");
		}
		return OR.getProperty("applicationUrl");
	}
	
	@Override
	public String getUrl1() {
		if (System.getProperty("url") != null) {
			return System.getProperty("url");
		}
		return OR1.getProperty("applicationUrl1");
	}

	@Override
	public String getUserName() {
		return OR.getProperty("username");
	}

	@Override
	public String getPassword() {
		return OR.getProperty("password");
	}



}
