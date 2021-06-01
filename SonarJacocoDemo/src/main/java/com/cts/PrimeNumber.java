package com.cts;

public class PrimeNumber {

	public boolean findPrime(int n) {

		var flag = false;

		if (n == 0 || n == 1) {
			flag = false;
		} else {

			var counter = 0;
			for (var i = 2; i < n; i++) {

				if (n % 2 == 0) {
					counter++;
				}

			}

			if (counter == 0) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

}
