package com.amit.web.helper.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.amit.web.helper.logger.LoggerHelper;

public class WindowHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WindowHelper.class);

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method will switch to parent window
	 */
	public void switchToParentWindow() {
		log.info("switching to parent window...");
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will switch to child window based on index
	 * 
	 * @param index
	 */
	public String switchToWindow(int index) {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();
		int i = 0;
		for (String window : windows) {
			if (i == index) {
				log.info("switched to : " + index + " window");
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
		return mainwindow;
	}

	/**
	 * This method will close all tabbed window and switched to main window
	 * @throws InterruptedException 
	 */
	public void closeAllTabsAndSwitchToMainWindow(String mainWindow) throws InterruptedException {
		Set<String> windows = driver.getWindowHandles();
		//String mainWindow = driver.getWindowHandle();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainWindow)) {
				driver.close();
			}
		}
		log.info("switched to main window");
		Thread.sleep(3000);
		driver.switchTo().window(mainWindow);
	}

	/**
	 * This method will do browser back navigation
	 */
	public void navigateBack() {
		log.info("navigating back");
		driver.navigate().back();
	}

	/**
	 * This method will do browser forward navigation
	 */
	public void navigateForward() {
		log.info("navigating forward");
		driver.navigate().forward();
	}

}
