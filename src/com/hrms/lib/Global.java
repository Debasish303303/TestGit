package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	// Variable Info
	public WebDriver driver;
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw = "admin";
	public String fn = "Selenium";
	public String ln = "Suresh";
	public String indextitle = "OrangeHRM";
	public String logintitle = "OrangeHRM - New Level of HR Management";
	public String welcometext = "Welcome admin";
	public String searchby = "Emp. ID";
	public String searchtext = "0028";

	// Object Info
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String welcome_text = "Welcome admin";
	public String frame_id = "rightMenu";
	public String btn_addemp = "//input[@value='Add']";
	public String btn_back = "//input[@value='Back']";
	public String txt_firstname = "//input[@name='txtEmpFirstName']";
	public String txt_lastname = "//input[@name='txtEmpLastName']";
	public String btn_save = "//input[@value='Save']";
	public String chk_delemp = "//input[@value='0028']";
	public String btn_delete = "//input[@value='Delete']";
	public String txt_pim = "PIM";
	public String txt_addemp = "Add Employee";
	public String txt_emplist = "Employee List";
	public String drp_searchby = "loc_code";
	public String txt_searchfor = "loc_name";
	public String btn_search = "//input[@value='Search']";
}
