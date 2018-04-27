package com.amit.web.testscripts;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;

public class DownloadFileInSelenium {
	
	@BeforeTest
	public void StartBrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
		// For Window OS
		// System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
		// about:config
		// Create object of FirefoxProfile in built class to access Its
		// properties.
		FirefoxProfile fprofile = new FirefoxProfile();
		/**
		 * How to Use browser.download.folderList The value of
		 * browser.download.folderList can be set to either 0, 1, or 2. 
		 * When set to 0, Firefox will save all files downloaded via the browser on the
		 * user's desktop. 
		 * When set to 1, these downloads are stored in the
		 * Downloads folder. 
		 * When set to 2, the location specified for the most
		 * recent download is utilized again.
		 */
		// Set Location to store files after downloading.
		fprofile.setPreference("browser.download.dir", "/Users/bsingh5/Downloads");
		fprofile.setPreference("browser.download.folderList", 2);
		// Set Preference to not show file download confirmation dialogue using
		// MIME types Of different file extension types.
		fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" // MIME Type of Excel
						+ "application/pdf;" // MIME types Of PDF File.
						+ "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" // MIME types Of MS doc File.
						+ "text/plain;" // MIME types Of text File.
						+ "text/csv;"
						+ "application/zip;" 
						+ "application/x-gzip;"); // MIME Type of Tar file

		/**
		 * A boolean value that indicates whether or not to show the Downloads
		 * window when a download begins. The default value is true.
		 */
		fprofile.setPreference("browser.download.manager.showWhenStarting", false);
		/**
		 * You can set the pdfjs.disabled pref to true on the about:config page
		 * to disable the build-in PDF viewer and use the Adobe Reader instead.
		 */
		fprofile.setPreference("pdfjs.disabled", true);
		// Pass fprofile parameter In webdriver to use preferences to download
		// file.
	}

}
