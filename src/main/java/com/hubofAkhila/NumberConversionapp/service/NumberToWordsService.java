package com.hubofAkhila.NumberConversionapp.service;

import java.util.function.BiFunction;

import org.springframework.stereotype.Service;

@Service
public class NumberToWordsService {

	public String numberToStringConversion(int n) {

		String convertedNumber = "";
		if (n == 0) {
			convertedNumber = "Zero";
		} else {
			BiFunction<Integer, String, String> numberFunction = (Integer numval, String result) -> {

				String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
						"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
						"Nineteen" };
				String[] ten = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
				String retVal = "";
				try {

					int number = numval.intValue();
					if (number > 19) {
						retVal = ten[number / 10] + one[number % 10];

					} else {
						retVal = one[number];
					}

					if (number > 0) {
						retVal = retVal + result;
					}

				} catch (IndexOutOfBoundsException e) {
					System.err.print("Exception Occured" + e);
				}
				return retVal;
			};

			convertedNumber = numberFunction.apply((n / 100000000) % 100, "Billion ")
					+ numberFunction.apply((n / 1000000) % 100, "million ")
					+ numberFunction.apply(((n / 100000) % 10), "hundred ")
					+ numberFunction.apply(((n / 1000) % 100), "thousand ")
					+ numberFunction.apply((n / 100) % 10, "hundred ") + numberFunction.apply(n % 100, "");
		}
		return convertedNumber;
	}

}
