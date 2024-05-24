package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements FrameWorkConstant {
	public String ToreadDataFromPropertyFile (String key) throws IOException {
      FileInputStream fis = new FileInputStream(property);
	  Properties prop = new Properties();
	  prop.load(fis);
	  String value = prop.getProperty(key);
	  return key;
	  

}
}