package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherPage {

	public WeatherPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchBox")
	public WebElement search;

	@FindBy(id = "Bhubaneswar")
	public WebElement checkBox;

	@FindBy(xpath = "//*[@id='map_canvas']/div[1]/div[4]/div[12]/div/div[2]")
	public WebElement city;

	@FindBy(xpath = "//*[@id='map_canvas']/div[1]/div[6]/div/div[1]")
	public WebElement details;

}
