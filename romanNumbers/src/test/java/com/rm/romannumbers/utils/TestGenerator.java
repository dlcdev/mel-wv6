package com.rm.romannumbers.utils;

import com.rm.romannumbers.model.RomanNumbers;

import java.util.Arrays;
import java.util.List;

public class TestGenerator {
    public static List<RomanNumbers> getRomanNumberByDecimal() {
        return Arrays.asList(
                new RomanNumbers(1, "I"),
                new RomanNumbers(2, "II"),
                new RomanNumbers(3, "III"),
                new RomanNumbers(5, "V"),
                new RomanNumbers(7, "VII"),
                new RomanNumbers(10, "X"),
                new RomanNumbers(50, "L")
        );

    }
}
