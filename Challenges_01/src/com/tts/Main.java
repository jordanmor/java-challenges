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
		
		// Barking Dog Tests
		System.out.println("Barking Dog Tests: ");
		System.out.println(BarkingDog.shouldWakeUp(true, 1)); // true
		System.out.println(BarkingDog.shouldWakeUp (false, 2)); //false
		System.out.println(BarkingDog.shouldWakeUp (true, 8)); //false
		System.out.println(BarkingDog.shouldWakeUp (true, -1)); //false
		
		// Leap Year Calculator
		System.out.println("Leap Year Calculator Tests: ");
		System.out.println(LeapYear.isLeapYear(-1600)); // false
		System.out.println(LeapYear.isLeapYear(1600)); // true
		System.out.println(LeapYear.isLeapYear(2017)); // false
		System.out.println(LeapYear.isLeapYear(2000)); // true
		System.out.println(LeapYear.isLeapYear(1924)); // true
		
		// Decimal Comparator
		System.out.println("Decimal Comparator Tests: ");
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
		
		// Equal Sum Checker
		System.out.println("Equal Sum Checker Tests: ");
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1)); // false
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2)); // true
		System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0)); // true
		
		// Teen Number Checker
		System.out.println("Teen Number Checker Tests: ");
		System.out.println(TeenNumberChecker.hasTeen(9, 99, 19)); // true
		System.out.println(TeenNumberChecker.hasTeen(23, 15, 42)); // false
		System.out.println(TeenNumberChecker.hasTeen(22, 23, 34)); // false
	}

}
