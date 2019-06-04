package com.tts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Speed Converter Tests
		SpeedConverter.printConversion(2); // 2.0 km/h = 1 mi/h
		SpeedConverter.printConversion(10.25); // 10.25 km/h = 6 mi/h
		SpeedConverter.printConversion(-5.6); // Invalid Value
		SpeedConverter.printConversion(75.114); // 75.114 km/h = 47 mi/h
	}

}
