package com.rm.romannumbers.serivce;

import com.rm.romannumbers.repository.RomanNumbersInterface;
import com.rm.romannumbers.utils.TestGenerator;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@ExtendWith(MockitoExtension.class)
class RomanNumbersServiceImplTest {

    @InjectMocks
    private RomanNumbersServiceImpl service;

    @Mock
    RomanNumbersInterface romanNumbersRepo;

    @BeforeEach
    public void setup() {
        BDDMockito.when(romanNumbersRepo.getAllRomanNumbers())
                .thenReturn(TestGenerator.getRomanNumberByDecimal());
    }


    @ParameterizedTest(name = "[{index}] ==> the decimal number: ''{0}'' is equals to roman number: ''{1}''")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
            "7, VII",
            "10, X",
            "50, L"

    })
    void getRomanNumberByDecimalNumber(int inputDecimal, String expectedResult) {

        String romanNumbers = service.getRomanNumberByDecimalNumber(inputDecimal);

        assertThat(romanNumbers).isEqualTo(expectedResult);
    }

}