package com.opencastsoftware.numeralsapi.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.TreeMap;

@Service
public class ConverterService {

    public String convertNumberToNumberal(int numberToConvert) {
        TreeMap<Integer, String> numeralMap = new TreeMap<>();
        numeralMap.put(1, "I");
        numeralMap.put(5, "V");
        numeralMap.put(10, "X");
        numeralMap.put(50, "L");
        numeralMap.put(100, "C");
        numeralMap.put(500, "D");
        numeralMap.put(1000, "M");

        numeralMap.put(4, "IV");
        numeralMap.put(9, "IX");
        numeralMap.put(40, "XL");
        numeralMap.put(90, "XC");
        numeralMap.put(400, "CD");
        numeralMap.put(900, "CM");

        int flooredKey = numeralMap.floorKey(numberToConvert);
        if (flooredKey == numberToConvert){
            return numeralMap.get(numberToConvert);
        } else {
            
        }



    }

}
