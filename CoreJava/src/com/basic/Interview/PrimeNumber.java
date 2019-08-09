package com.basic.Interview;
//a number divided by 1 and it self
public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 14;
		Boolean amstrong = true;
		for (int i = 2; i <= number / 2; i++) {
			if ((number % i) == 0) {
				amstrong = false;
				break;
			}
		}
		if (amstrong) {
			System.out.println(number + " is Amstrong Number.");
		} else {
			System.out.println(number + " is not Amstrong Number.");
		}
	}

}
