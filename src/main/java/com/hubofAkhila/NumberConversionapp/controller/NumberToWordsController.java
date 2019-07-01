package com.hubofAkhila.NumberConversionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hubofAkhila.NumberConversionapp.service.NumberToWordsService;


@Controller
public class NumberToWordsController {

@Autowired
NumberToWordsService serviceObj;

public String convertnumberToWords(int n) {

return serviceObj.numberToStringConversion(n);
}

}

