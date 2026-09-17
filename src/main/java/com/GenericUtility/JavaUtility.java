package com.GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {

	/**
	 * To capture the current date and time
	 * @return String
	 * @author Sharmila G
	 */
	public String timeStamp() {
		
		String time = LocalDateTime.now().toString().replace(":", "_");
		return time;
		
	}
		                    
	public int generateRandomNumber() {
		
		Random random= new Random();
		int randomvalue = random.nextInt(1000000);
		
		return randomvalue;
	}
	
	/**
	 * To generate Random Data
	 * @return
	 */
	public String generateRandomData() {
		
		String data = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]","");
		
		return data;
		
	}
}
