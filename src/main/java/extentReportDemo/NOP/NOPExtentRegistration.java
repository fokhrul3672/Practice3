package extentReportDemo.NOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOPExtentRegistration {
	
WebDriver driver;

	
	@FindBy(xpath = "//a[normalize-space()='Register']")WebElement RegisterButton;
	@FindBy(id = "gender-male")WebElement GenderButton;
	@FindBy(id = "FirstName")WebElement firstname;
	@FindBy(id = "LastName")WebElement lastname;
	@FindBy(xpath = "//select[@name='DateOfBirthDay']")WebElement DayButton;
	@FindBy(xpath = "//option[@value='15']")WebElement Date;
	@FindBy(name = "DateOfBirthMonth")WebElement MonthButton;
	@FindBy(xpath = "//option[normalize-space()='November']")WebElement Birthmonth;
	@FindBy(name = "DateOfBirthYear")WebElement YearButton;
	@FindBy(xpath = "//option[@value='1975']")WebElement BirthYear;
	@FindBy(xpath = "//input[@id='Email']")WebElement email;
	@FindBy(xpath = "//input[@id='Company']")WebElement company;
	@FindBy(xpath = "//input[@type='checkbox' and @ id='Newsletter']")WebElement CheckboxNewsletter;
	@FindBy(xpath = "//input[@id='Password']")WebElement Password;
	@FindBy(xpath = "//input[@id='ConfirmPassword']")WebElement confirmPassword;
	@FindBy(name = "register-button")WebElement registerButton2;
	
	public NOPExtentRegistration(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
		}
	public void Registration() {
		
				
		RegisterButton.click();	
		GenderButton.click();	
		firstname.sendKeys("Salim");	
		lastname.sendKeys("Reza");	
		DayButton.click();	
		Date.click();	
		MonthButton.click();	
		Birthmonth.click();	
		YearButton.click();	
		BirthYear.click();	
		email.sendKeys("sreza30th@gmail.com");	
		company.sendKeys("SS-Reza LLC");	
		CheckboxNewsletter.click();	
		Password.sendKeys("Nexvalli12345");	
		confirmPassword.sendKeys("Nexvalli12345");	
		registerButton2.click();
	}
}
