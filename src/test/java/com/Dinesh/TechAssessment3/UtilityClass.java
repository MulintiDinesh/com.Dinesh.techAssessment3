package com.Dinesh.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String url;
	String email;
	String password;
	public UtilityClass(){
		data();
	}
	
	public void data() {
		File file = new File("C:\\Users\\dmulinti\\techAssessment_ES6105\\com.Dinesh.TechAssessment3\\src\\test\\resources\\data.properties");
		
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		email = prop.getProperty("email");
	    password = prop.getProperty("password");
	}
}
