package com.opencastsoftware.numeralsapi.controller;

import com.opencastsoftware.numeralsapi.NumeralsApiApplication;
import com.opencastsoftware.numeralsapi.service.ConverterService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class NumeralsControllerTest {

    @Mock
    ConverterService service;

    @InjectMocks
    NumeralsController controller;

    @Test
    void shouldReturnValuefromConverter(){
        String SUCCESS_RESPONSE = "TestSuccess";
        doReturn(SUCCESS_RESPONSE).when(service).convertNumberToNumberal(anyInt());
        assertEquals(SUCCESS_RESPONSE, controller.getRomanNumeralFromNumber(70));
    }

}