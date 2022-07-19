package com.rm.romannumbers.controller;

import com.rm.romannumbers.model.RomanNumbers;
import com.rm.romannumbers.serivce.RomanNumbersService;
import com.rm.romannumbers.utils.TestGenerator;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
@Log4j2
class RomanNumbersControllerTest {


    @InjectMocks
    private RomanNumbersController romanNumbersController;

    @Mock
    RomanNumbersService romanNumbersService;


    @BeforeEach
    void setup() {
        BDDMockito.when(romanNumbersService.getAllRomanNumbers())
                .thenReturn(TestGenerator.getRomanNumberByDecimal());


    }

    @Test
    void getAllRomanNumbers() {

    }

    @Test
    void getRomanNumberByDecimalNumber() {
        List<RomanNumbers> romanNumbersList= TestGenerator.getRomanNumberByDecimal();
        ResponseEntity response = romanNumbersController
                .getRomanNumberByDecimalNumber(
                        romanNumbersList.get(0).getDecimalNumber());

        log.info(response);

    }
}