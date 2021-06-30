package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.WeatherPage;
import utilities.BaseClass;
import utilities.ReadConfigFile;

public class WeatherTC extends BaseClass {
	ReadConfigFile configuration = new ReadConfigFile();

	@Test
	public void getWeatherDeatils() throws Exception {
		HomePage home = new HomePage(driver);
		WeatherPage weather = new WeatherPage(driver);
		String cityName=configuration.readCity();
		
		home.topnavigation.click();
		home.weatherButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(weather.search));
		
		weather.search.sendKeys(cityName);
		wait.until(ExpectedConditions.visibilityOf(weather.checkBox));
		weather.checkBox.click();
		wait.until(ExpectedConditions.visibilityOf(weather.city));
		String cityDetails=weather.city.getText();
		Assert.assertEquals(cityDetails, cityName);
		weather.city.click();
		String weatherDetails=weather.details.getText();
		System.out.println("Weather Details for: "+cityDetails+" is :"+weatherDetails);

	}

}
