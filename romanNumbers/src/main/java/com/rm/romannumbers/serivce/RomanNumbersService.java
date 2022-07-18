package com.rm.romannumbers.serivce;

import com.rm.romannumbers.model.RomanNumbers;

import java.util.List;

public interface RomanNumbersService {
    List<RomanNumbers> getAllRomanNumbers();

    String getRomanNumberByDecimalNumber(int decimalNumber);
}
