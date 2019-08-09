package com.basic.Interview;
// n3=n1+n2
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 0, t2=1, sum;
		for (int i = 0; i <= 10; i++) {
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
