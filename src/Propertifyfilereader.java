import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertifyfilereader {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\syedk\\Music\\Beforyourself\\objectre\\sameer.properties");
		Properties properties=new Properties();
		properties.load(fis);
		String browserName = properties.getProperty("browser");
		
		System.out.println(browserName);
	}

}