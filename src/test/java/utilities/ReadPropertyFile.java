package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\eclipse-java-workspace\\VenusAutomation\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		p.load(fr);
		
		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
	}

}
