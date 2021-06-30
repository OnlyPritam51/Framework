package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='h_sub_menu']")
	public WebElement topnavigation;
	
	@FindBy(xpath="//*[@id='subnav']/div/div/div/div/div/a[5]")
	public WebElement weatherButton;
	

}
