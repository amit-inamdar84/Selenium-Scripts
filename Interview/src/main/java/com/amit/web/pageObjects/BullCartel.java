package com.amit.web.pageObjects;

import java.util.ArrayList;
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
		if (cmpList.size() == 0) {//If data is not present.
			log.info("No elements present in the list...");
		} else {
			for (int i = 0;; i++) {//Start from i=0.i.e. first page.
				for (WebElement priceList : cmpList) {
					String s = (priceList.getText());
					db.add(Double.parseDouble(s));//Getting text from web element and adding to array list
				}
				log.info("Navigating to next page: ");
				try {
					if (nextPageButton.isDisplayed()) {//If next page button is displayed
						navigateToNextPage();//Click on it
						i++;//Increment i to repeat the loop. Loops exist when i is not incremented.i.e. if navigateToNextPage() is false.
					}
				} catch (NoSuchElementException e) {//At last page when next page button is not displayed catch the exception.
					log.info("No more records to navigate...");
					break;//Discontinue the looping when there are no more pages to navigate.
				}
			}
		}
		return db;

	}

	@FindBy(xpath = "//a[contains(text(),'Next Page')]")
	WebElement nextPageButton;

	public void navigateToNextPage() {
		nextPageButton.click();
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
	
	public boolean traverseSortedArrayList(ArrayList<Double> arr){
		for(int i=0;i<arr.size()-1;i++){
			if(arr.get(i)<=arr.get(i+1)){
				log.info(arr.get(i));
				log.info(arr.get(i+1));
			}
			else{
				log.info("Elements are not properly sorted");
				return false;
			}
		}
		return true;
	}

	public BullCartel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
