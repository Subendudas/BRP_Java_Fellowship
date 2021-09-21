package com.bridgelabz.day5;

public class PowerOf2 {
	int n;

	PowerOf2(int n) {
		this.n = n;
	}

	void function() {
		for (int i = 1; i <= n; i++) 
		{
			int value = (int) Math.pow(2, i);
			System.out.println("2^" + i + "=" + value);
		}

	}

	public static void main(String[] args) {
		int num = 0;
		num = Integer.parseInt(args[0]);
		PowerOf2 obj1 = new PowerOf2(num);
		obj1.function();
	}
}
