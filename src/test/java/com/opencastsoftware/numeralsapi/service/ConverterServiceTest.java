package com.opencastsoftware.numeralsapi.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {

    @InjectMocks
    ConverterService converter;

    @Test
    void shouldGetBasicNumeralForNumber(){
        assertEquals("I", converter.convertNumberToNumberal(1));
        assertEquals("V", converter.convertNumberToNumberal(5));
        assertEquals("X", converter.convertNumberToNumberal(10));
        assertEquals("L", converter.convertNumberToNumberal(50));
        assertEquals("C", converter.convertNumberToNumberal(100));
        assertEquals("D", converter.convertNumberToNumberal(500));
        assertEquals("M", converter.convertNumberToNumberal(1000));
    }

    @Test
    void shouldGetSpecialCaseNumeralForNumber(){
        assertEquals("IV", converter.convertNumberToNumberal(4));
        assertEquals("IX", converter.convertNumberToNumberal(9));
        assertEquals("XL", converter.convertNumberToNumberal(40));
        assertEquals("XC", converter.convertNumberToNumberal(90));
        assertEquals("CD", converter.convertNumberToNumberal(400));
        assertEquals("CM", converter.convertNumberToNumberal(900));
    }

    @Test
    void shouldGetCombinationNumeralForNumber(){
        assertEquals("II", converter.convertNumberToNumberal(2));
        assertEquals("III", converter.convertNumberToNumberal(3));

        assertEquals("VI", converter.convertNumberToNumberal(6));
        assertEquals("VII", converter.convertNumberToNumberal(7));
        assertEquals("VIII", converter.convertNumberToNumberal(8));

    }

}