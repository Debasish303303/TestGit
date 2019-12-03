package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_102 extends General {
	//public static void main(String[] args) throws Exception {
	@Test
	public void TC102() throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.waitStm();
		obj.logintitle();
		obj.login();
		obj.indextitle();
		obj.welcometext();
		obj.mouseover();
		obj.addemp();
		obj.waitStm();
		obj.logout();
		obj.closebrowser();

	}

}
