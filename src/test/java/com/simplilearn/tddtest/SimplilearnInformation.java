package com.simplilearn.tddtest;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SimplilearnInformation{


	public boolean isTitleEmpty(String title) {
		if(title.isEmpty()) {
			throw new NullPointerException("Title can not be empty");
		}
		else {
			return true;
		}
	}

	public boolean isTitleDisplay(boolean isdisplay) {
		if(isdisplay==false) {
			System.out.println("All courses  not displayed.");
			return isdisplay;
		}
		else {
			return isdisplay;
		}
			
	}

	public boolean checkListOfAllCourses(List<WebElement> listOfAllCourses) {
		if(listOfAllCourses==null) {
			throw new NullPointerException("Course Details cannot be empty");
		}
		else {
			return true;
		}
	}
}