package com.hubofAkhila.NumberConversionapp;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hubofAkhila.NumberConversionapp.service.NumberToWordsService;

@SpringBootTest
 public class NumtoWordsMainAppTest {
	


	@Test
	void testNumberConversion() {
		NumberToWordsService numtoWordsservice=new NumberToWordsService();
		 assertEquals("FiftySixmillion Ninehundred FortyFivethousand Sevenhundred EightyOne"
		 , numtoWordsservice.numberToStringConversion(56945781));
		 
	}

}
