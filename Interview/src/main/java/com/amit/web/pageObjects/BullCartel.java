package com.amit.web.pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.helper.assertion.AssertionHelper;
import com.amit.web.helper.assertion.VerificationHelper;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.testBase.TestBase;

public class BullCartel extends TestBase {
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(BullCartel.class);

	@FindBy(linkText = "The Bull Cartel")
	WebElement bullCartelLink;

	public void clickBullCartelLink() {
		bullCartelLink.click();
	}

	@FindBy(xpath = "//*[@id='screen-info']/div/h1")
	public WebElement bullCartelText;

	public boolean getBullCartelText() {
		return new VerificationHelper(driver).isDisplayed(bullCartelText);
	}

	@FindBy(xpath = "//*[@id='industry-filter-results']/div[2]/table/tbody/tr[1]/th[3]/a")
	WebElement sortcmpRs;

	public void clickCMPRs() {
		sortcmpRs.click();
		log.info("Clicked on sort header");
	}

	@FindBy(xpath = "//table[@class='data-table text-nowrap striped']/tbody/child::*/td[3]")
	List<WebElement> cmpList;

	public ArrayList<Double> readUnSortedCMPList() {
		ArrayList<Double> db = new ArrayList<Double>();
		if (cmpList.size() == 0) {
			log.info("No elements present in the list...");
		} else {
			for (int i = 0;; i++) {
				for (WebElement priceList : cmpList) {
					String s = (priceList.getText());
					db.add(Double.parseDouble(s));
				}
				log.info("Navigating to next page: ");
				try {
					if (nextPageButton.isDisplayed()) {
						navigateToNextPage();
						i++;
					} 
				} catch (NoSuchElementException e) {
					log.info("No more records to navigate...");
					break;
				} 
			}
		}
		return db;

	}

	@FindBy(xpath = "//a[contains(text(),'Next Page')]")
	WebElement nextPageButton;

	public boolean navigateToNextPage() {
		if (new VerificationHelper(driver).isDisplayed(nextPageButton) == true) {
			nextPageButton.click();
			return true;
		} else {
			log.info("No more page to navigate...");
			return false;
		}
	}

	public ArrayList<Double> sortDescCMPList(ArrayList<Double> cList) {
		Collections.sort(cList, Collections.reverseOrder());
		log.info("List after sorting in descending order using sort() method: " + cList);
		return cList;
	}
	
	public ArrayList<Double> sortAscCMPList(ArrayList<Double> cList) {
		Collections.sort(cList);
		log.info("List after sorting in ascending order using sort() method: " + cList);
		return cList;
	}

	public void compareCMPList(ArrayList<Double> arr1, ArrayList<Double> arr2) {
		if (arr1.equals(arr2)) {
			AssertionHelper.updateTestStatus(true);
		} else {
			AssertionHelper.updateTestStatus(false);
		}
	}

	public BullCartel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
