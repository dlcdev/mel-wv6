package com.rm.romannumbers.serivce;

import com.rm.romannumbers.model.RomanNumbers;

import java.util.List;

public interface RomanNumbersService {
    List<RomanNumbers> getAllRomanNumbers();

    List<String> getRomanNumberByDecimalNumber(int decimalNumber);
}
