package test;

import java.io.IOException;

import org.testng.annotations.Test;


import base.NOPBaseclass;
import extentReportDemo.NOP.NOPExtentRegistration;
import extentReportDemo.NOP.NOPExtentreportLogin;

public class NOPTest extends NOPBaseclass {
	NOPExtentRegistration Reg;
	NOPExtentreportLogin login;
	
	@Test(priority=1)
	public void Registration() {
		extest= reports.createTest("Registration");
		Reg = new NOPExtentRegistration(driver);
		Reg.Registration();
		

	}

	@Test(priority=4)
	public void LoginTest1() throws InterruptedException, IOException {
		extest= reports.createTest("login1_valid");
		login = new NOPExtentreportLogin(driver);
		login.login1_valid();
	}


	@Test(priority=2)
	public void LoginTest2() throws IOException {
		extest= reports.createTest("login2_invalid");
		login = new NOPExtentreportLogin(driver);
		login.login2_invalid();
		}

	@Test (priority=3) 
	public void LoginTest3() throws IOException {
		extest= reports.createTest("login3_Null");
		login = new NOPExtentreportLogin(driver);
		login.login3_null();
		
	}
	
	
}
