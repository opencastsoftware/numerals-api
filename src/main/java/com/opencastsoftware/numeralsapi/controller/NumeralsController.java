package com.opencastsoftware.numeralsapi.controller;

import com.opencastsoftware.numeralsapi.service.ConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeralsController {

    private final ConverterService converter;

    public NumeralsController(ConverterService converter) {
        this.converter = converter;
    }

    @GetMapping("/convert/{numberToConvert}")
    public String getRomanNumeralFromNumber(@PathVariable int numberToConvert){
        return converter.convertNumberToNumberal(numberToConvert);
    }
}
