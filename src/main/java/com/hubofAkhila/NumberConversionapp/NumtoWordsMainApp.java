package com.hubofAkhila.NumberConversionapp;

/**
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hubofAkhila.NumberConversionapp.controller.NumberToWordsController;

/**
 * @author V000478
 *
 */
@SpringBootApplication
public class NumtoWordsMainApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NumtoWordsMainApp.class, args);
	}

	@Autowired
	NumberToWordsController numtoWordscontroller;

	@Override
	public void run(String... args) throws Exception {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter +Ve number to be converted to words between 0 to 999,999,999");
		try {
			int num;
			while ((num = scnr.nextInt()) >= 0) {
				System.out.println(numtoWordscontroller.convertnumberToWords(num));
				System.out.println("Please enter next number to convert");
			}
			System.err.println("Invalid Input.Shut Down");

		} catch (InputMismatchException E) {
			System.err.println("Invalid Input.Shut Down");
		} catch (Exception E) {
			System.err.println("Invalid Input.Shut Down");
		} finally {
			System.exit(1);
		}
	}

}
