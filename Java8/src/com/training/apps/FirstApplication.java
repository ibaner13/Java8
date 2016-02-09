package com.training.apps;

import java.util.*;

import com.training.ifaces.Greeting;
import com.training.ifaces.Greeting1;

public class FirstApplication {

	public static void main(String[] args) {

		Greeting grt = () -> {System.out.println("Trying Java8");};
		grt.show();
		
		Greeting1 grt1 = (msg) -> {System.out.println(msg);};
		grt1.show("Trying Java8 with Parameters");
		
		ArrayList<String> namesList = new ArrayList<String>();
		
		namesList.add("Ishika");
		namesList.add("Dhawal");
		namesList.add("Gaurav");
		namesList.add("Anurag");
		namesList.add("Parshant");
		
		namesList.forEach(System.out::println);
		
	}

}
