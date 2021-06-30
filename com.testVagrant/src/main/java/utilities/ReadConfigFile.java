package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {

	Properties pro = new Properties();

	public ReadConfigFile() {

		try {
			File source = new File(System.getProperty("user.dir") + "\\Configuration\\config.properties");
			FileInputStream input = new FileInputStream(source);
			pro.load(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String readConfig() throws Exception {

		String baseURL = pro.getProperty("qaURL");
		return baseURL;
	}

	public String readCity() throws Exception {

		String city = pro.getProperty("city");
		return city;
	}

}
