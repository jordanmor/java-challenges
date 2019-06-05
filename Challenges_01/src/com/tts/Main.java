package com.tts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Speed Converter Tests
		System.out.println("Speed Converter Tests: ");
		SpeedConverter.printConversion(2); // 2.0 km/h = 1 mi/h
		SpeedConverter.printConversion(10.25); // 10.25 km/h = 6 mi/h
		SpeedConverter.printConversion(-5.6); // Invalid Value
		SpeedConverter.printConversion(75.114); // 75.114 km/h = 47 mi/h
		
		// MegaBytes Converter Tests
		System.out.println("MegaBytes Converter Tests: ");
		MegaBytesConverter.printMegaBytesAndKiloBytes(2500); // 2500 KB = 2 MB and 452 KB
		MegaBytesConverter.printMegaBytesAndKiloBytes(-1024); // Invalid Value
		MegaBytesConverter.printMegaBytesAndKiloBytes(5000); // 5000 KB = 4 MB and 904 KB
	}

}