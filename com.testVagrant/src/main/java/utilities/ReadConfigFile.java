package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfigFile {
	
	public String readConfig() throws Exception
	{
		File source= new File(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		FileInputStream input= new FileInputStream(source);
		Properties pro= new Properties();
		pro.load(input);
		String baseURL=pro.getProperty("qaURL");
		return baseURL;
		
		
	}

}
