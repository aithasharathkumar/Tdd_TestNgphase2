package com.simplilearn.testpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearn.base.BaseTest;
import com.simplilearn.tddtest.SimplilearnInformation;

public class HomePageTest extends BaseTest {

	SimplilearnInformation simplilearnInfo = new SimplilearnInformation();

	@Test(priority = '2')
	public void isAllCoursesTest() throws InterruptedException {
		Thread.sleep(2000);
		boolean isdisplay = driver.findElement(By.xpath("//div[@id='menu-button']")).isDisplayed();
		Assert.assertTrue(simplilearnInfo.isTitleDisplay(isdisplay));

	}

	@Test(priority = '3')
	public void getAllCourses() throws InterruptedException {
		WebElement allcourses = driver.findElement(By.xpath("//div[@id='menu-button']"));
		Actions a = new Actions(driver);
		a.moveToElement(allcourses).build().perform();
		Thread.sleep(2000);
		List<WebElement> listOfAllCourses = driver.findElements(By.xpath("//ul[@class='menu']"));
		

		try {
			Assert.assertTrue(simplilearnInfo.checkListOfAllCourses(listOfAllCourses));
			for (WebElement webElement : listOfAllCourses) {
				System.out.println(webElement.getText());
			}
		}
		 catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
		
	
	@Test(priority = '1')
	public void titleTest() throws InterruptedException {

		String title = driver.getTitle();
		
		try {
			Assert.assertTrue(simplilearnInfo.isTitleEmpty(title));
			System.out.println("Home Page : " + title);
		}

		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
}