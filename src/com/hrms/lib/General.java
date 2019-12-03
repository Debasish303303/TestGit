package com.hrms.lib;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {
	public void openapplication() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		System.out.println("Application Opened");

	}

	public void waitStm() throws Exception {
		Thread.sleep(3000);
		System.out.println("Wait statement done");
	}

	public void closebrowser() {
		driver.quit();
		System.out.println("Application Closed");
	}

	public void login() throws Exception {

		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login Successful");
	}

	public void welcometext() {
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText().matches("Welcome admin"));
		System.out.println("Welcome admin");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Successful");
	}

	public void addemp() throws Exception {
		driver.switchTo().frame(frame_id);
		driver.findElement(By.xpath(btn_addemp)).click();
		driver.findElement(By.xpath(txt_firstname)).sendKeys(fn);
		driver.findElement(By.xpath(txt_lastname)).sendKeys(ln);
		driver.findElement(By.xpath(btn_save)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(btn_back)).click();
		driver.switchTo().defaultContent();
		System.out.println("New Emp Added");
	}

	public void delemp() throws Exception {
		//driver.switchTo().frame(frame_id);
		driver.findElement(By.xpath(chk_delemp)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_delete)).click();
		//driver.switchTo().defaultContent();
		System.out.println("Emp Deleted");
	}

	public void indextitle() {
		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Index Title Matched");
		} else {
			System.out.println("Index Title not Matched");
		}
	}

	public void logintitle() {
		if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Login Title Matched");
		} else {
			System.out.println("Login Title not Matched");

		}
	}

	public void mouseover() throws Exception {
		Actions ac = new Actions(driver);
		WebElement pim = driver.findElement(By.linkText(txt_pim));
		ac.moveToElement(pim).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(txt_addemp)).click();
		{
			System.out.println("Mouse Over Done");
		}
	}

	public void enterFrame() throws Exception {
		driver.switchTo().frame(frame_id);
		Thread.sleep(3000);
		System.out.println("Frame Entered");
	}

	public void exitFrame() throws Exception {
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		System.out.println("Frame Exit");
	}

	public void employeelist() throws Exception {
		Actions ac = new Actions(driver);
		WebElement pim = driver.findElement(By.linkText(txt_pim));
		ac.moveToElement(pim).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(txt_emplist)).click();
		{
			System.out.println("Employee List Diplayed");
		}
	}

	public void employeeSearch() throws Exception {
		Select sc = new Select(driver.findElement(By.name(drp_searchby)));
		sc.selectByVisibleText(searchby);
		Thread.sleep(3000);
		driver.findElement(By.name(txt_searchfor)).sendKeys(searchtext);
		Thread.sleep(4000);
		driver.findElement(By.xpath(btn_search)).click();
		Thread.sleep(3000);
		System.out.println("Search Button Clicked");
	}

}
