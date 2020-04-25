package edu.usal.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static Properties config;
	/*
	public static String getDatabaseName() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("databaseName");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}*/
	public static String getDatabaseName() throws IOException{
		config = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
		config.load(propertiesStream);
		return config.getProperty("databaseName");
}
	/*
	public static String getUserName() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("user");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	*/
	public static String getUserName() throws IOException{
		config = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
		config.load(propertiesStream);
		return config.getProperty("userName");
}
	/*
	public static String getPassword() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("password");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	*/
	public static String getPassword() throws IOException{
		config = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
		config.load(propertiesStream);
		return config.getProperty("password");
}
	/*
	public static String getUrl() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("url");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}*/
	public static String getUrl() throws IOException{
		config = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
		config.load(propertiesStream);
		return config.getProperty("url");
}

	/*
	public static String getDriver() {
		try{
			config = new Properties();
			config.load(ClassLoader.getSystemResourceAsStream("config.properties"));
			return config.getProperty("driver");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}*/
	public static String getDriver() throws IOException{
		config = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream propertiesStream = classLoader.getResourceAsStream("config.properties");
		config.load(propertiesStream);
		return config.getProperty("driver");
}
	
}
