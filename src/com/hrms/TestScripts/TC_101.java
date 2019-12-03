package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_101 extends General {
	//public static void main(String[] args) throws Exception {
	
	@Test
	public void TC101() throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.waitStm();
		obj.logintitle();
		obj.login();
		obj.indextitle();
		obj.welcometext();
		obj.logout();
		obj.closebrowser();

	}
}
