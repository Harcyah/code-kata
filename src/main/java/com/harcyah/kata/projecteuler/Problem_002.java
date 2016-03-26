package com.harcyah.kata.projecteuler;

public class Problem_002 {

	public int sumEvenFibonacci(int limit) {
		int a = 1;
		int fibo = 2;
		int sum = 2;
		while (fibo <= limit) {
			int temp = a;
			a = fibo;
			fibo = temp + fibo;
			if (fibo % 2 == 0)
				sum += fibo;
		}
		return sum;
	}

}
