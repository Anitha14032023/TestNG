package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	
	private static FileInputStream fileInputStream;
	
	private static Properties properties;
	
	private static void Propertysetting() throws IOException   {
		
		File  file  =  new File("C:\\Users\\selfl\\eclipse-workspace_Ipt\\MavenProject\\src\\main\\resources\\TestData.Properties");
		
		try {
			fileInputStream  =  new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);
			
		} catch (FileNotFoundException e) {
			
			Assert.fail("ERROR: OCCUR DURING LOADING");
		} 
		catch (Exception e) {
			
			Assert.fail("ERROR: OCCUR DURING READING");
		}
		
	}
	
public static String getDataProperty(String key) throws IOException {
	Propertysetting();
	String value = properties.getProperty(key);
	return value;

	
}
	

}
