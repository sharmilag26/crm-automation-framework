package com.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	/**
	 * To read the Test Data from the Resource File
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String readDataFromPropertiesFile(String key) throws IOException
	{
        
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
}
