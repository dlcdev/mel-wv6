package com.rm.romannumbers.repository;

import com.rm.romannumbers.model.RomanNumbers;
import com.rm.romannumbers.utils.TestGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersRepoTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0, I",
            "1, II",
            "2, III",
            "3, V",
            "4, VII",
            "5, X",
            "6, L"
    })
    void getAllRomanNumbers(int index, String expectedRoman) {

        List<RomanNumbers> romanNumbersList = TestGenerator.getRomanNumberByDecimal();
        assertThat(romanNumbersList).isNotNull();
        assertThat(romanNumbersList.get(index).getRomanNumber()).isEqualTo(expectedRoman);

    }
}