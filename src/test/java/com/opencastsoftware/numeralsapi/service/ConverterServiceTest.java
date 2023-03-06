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
    void shouldGetBasicNumeralForNumber() {
        assertEquals("I", converter.convertNumberToNumberal(1));
    }

}