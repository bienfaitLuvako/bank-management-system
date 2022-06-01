package rawbank.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration{
	private Properties prop = new Properties();
	
	public Properties get() {
		try {
			File file = new File("config.properties");
			FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
			prop.load(fis);
			fis.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return this.prop;
	}	
}
