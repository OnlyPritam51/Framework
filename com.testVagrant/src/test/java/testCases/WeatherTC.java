package testCases;


import org.testng.annotations.Test;

import pages.HomePage;
import utilities.BaseClass;

public class WeatherTC extends BaseClass {
	
	
	@Test
	public void getWeatherDeatils(){
	HomePage home= new HomePage(driver);	
	home.topnavigation.click();
	home.weatherButton.click();
		
		
	}
	

}
