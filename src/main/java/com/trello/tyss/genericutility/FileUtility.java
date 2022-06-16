package com.trello.tyss.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * to read the data from the properties file
 * @author Danish
 *
 */

public class FileUtility {
	/**
	 * this method will give you the value from its key
	 * @param Key
	 * @return
	 * @throws IOException
	 */
public String propertyFile(String Key) throws IOException {
	FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(Key);
	return value;
}
}
