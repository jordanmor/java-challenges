package com.tts;

/*
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 * The method should return boolean and it needs to return true if two double numbers 
 * are the same up to three decimal places. Otherwise, return false.
*/

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
		return (int) (numOne * 1000) == (int) (numTwo * 1000);
	}
}
