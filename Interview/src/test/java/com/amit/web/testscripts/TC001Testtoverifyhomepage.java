package com.amit.web.testscripts;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.testBase.TestBase;

public class TC001Testtoverifyhomepage extends TestBase{
	private final Logger log = LoggerHelper.getLogger(TC001Testtoverifyhomepage.class);
	
	@Test
	public void automationPracticeHomePageAccess(){
		getApplicationUrl(ObjectReader.reader.getUrl1());
	}

}
