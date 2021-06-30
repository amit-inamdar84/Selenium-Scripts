package com.amit.web.helper.logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amit.web.helper.resource.ResourceHelper;

public class LoggerHelper {
	private static boolean root = false;

	public static Logger getLogger(Class cls) {
		if (root) {
			return LogManager.getLogger(cls);
		}
		//PropertyConfigurator.configure(ResourceHelper.getResourcePath("/src/main/resources/configFile/log4j.properties"));
		root = true;
		return LogManager.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("Log 4j is configured");
		log.info("Log 4j is ready");
	}

}
