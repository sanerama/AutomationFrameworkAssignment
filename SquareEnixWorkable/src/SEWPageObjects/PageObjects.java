package SEWPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SEWPageObjects.PageObjects;

public class PageObjects {
static WebDriver driver;
	
	@FindBy(id = "")
	WebElement idField;
	
	@FindBy(id = "")
	WebElement nameField;
	
	@FindBy(xpath = "")
	WebElement avtar;
	
	@FindBy(id = "")
	WebElement userNameField;
	
	@FindBy(xpath = "")
	WebElement usersId;
	
	@FindBy(id = "")
	WebElement pswField;
	
	@FindBy(id = "")
	WebElement enterLogin;
	
	@FindBy(xpath = "")
	WebElement submt;
	
	@FindBy(id = "")
	WebElement sessionId;
	
	@FindBy(id = "")
	WebElement email;
	
	@FindBy(id = "")
	WebElement address;
	
	@FindBy(id = "")
	WebElement bio;
	
	@FindBy(id = "")
	WebElement gender;
	
	@FindBy(id = "")
	WebElement synopsys;
	
	public PageObjects(WebDriver driver) {
		PageObjects.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	public void checkValidElement() {
		
		
		if( idField.isDisplayed()) {
			System.out.println("element displayed");
			
		}
		else
		{
			System.out.println("element is not displayed");
			
		}
		if(nameField.isDisplayed()){
			System.out.println("element displayed");
			
		}
		else 
		{
			System.out.println("element is not displayed");
			
		}
		if(avtar.isDisplayed()){
			System.out.println("element displayed");
			
		}
		else
		{
			System.out.println("element displayed");
			
		}
		
		
	}
	
	public void checkInvalidElements() {
		
		if(!email.isDisplayed()) {
			
			System.out.println("error found");
		}
		if(!address.isDisplayed()) {
			
			System.out.println("error found");
		}
		
		
		
	}
	
	public void enterLogIn() {
		
		enterLogin.click();
	}
	
	public void enterValidUsername() {
		
		userNameField.clear();
		userNameField.sendKeys("Johnny5");
		
	}
	
	public void enterValidPassword() {
		
		pswField.clear();
		pswField.sendKeys("qwerty");
	}
public void enterNoUsername() {
		
		userNameField.clear();
		userNameField.sendKeys(" ");
		
	}
	
	public void enterNoPassword() {
		
		pswField.clear();
		pswField.sendKeys(" ");
	}
	
	public void submitDetails() {
		
		submt.click();
		
	}
	
	public void errorMsg() {
		System.out.println("Eneter Valid deails");
	}
	
	public void InvalidPassword() {
		
		pswField.sendKeys();
	}
	
	public void InvalidUsername() {
		
		userNameField.clear();
		userNameField.sendKeys("aaaaa");
	}
	
	public void checkArray() {
		List<WebElement> elements = driver.findElements(By.xpath(" "));	
		int a;
		a = elements.size();
		for(int i=0; i<=a; i++) {
			
			usersId.click();
			driver.navigate().back();
			
		}
	
	}
	
	public void getdefaultSize() {
		
		List<WebElement> elements = driver.findElements(By.xpath(" "));	
		int a;
		a = elements.size();
		count(a);
		
	}
	
	private void count(int a) {
		// TODO Auto-generated method stub20
		System.out.print(20);
		
	}

	public void validateNoOfEntries() {
		
		List<WebElement> elements = driver.findElements(By.xpath(" "));	
		int a;
		a = elements.size();
		if(a == 10);
		System.out.println("Correct No of entries displayed");
		
			
	}

	public void showUserInfo() {
		
		if( address.isDisplayed()) {
			System.out.println("element displayed");
			
		}
		else
		{
			System.out.println("element is not displayed");
			
		}
		if(email.isDisplayed()){
			System.out.println("element displayed");
			
		}
		else 
		{
			System.out.println("element is not displayed");
			
		}
	}
		
		public void tddBioField() {
			
			if(bio.isDisplayed()) {
				System.out.println("element displayed");
			}
		}
		
	

}
