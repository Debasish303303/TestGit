package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103 extends General {
	// public static void main(String[] args) throws Exception {
	@Test
	public void TC103() throws Exception {
		General obj = new General();
		obj.openapplication();
		obj.waitStm();
		obj.logintitle();
		obj.login();
		obj.employeelist();
		obj.enterFrame();
		obj.employeeSearch();
		obj.delemp();
		obj.logout();
		obj.closebrowser();
	}

}
