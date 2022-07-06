package com.rm.romannumbers.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rm.romannumbers.model.RomanNumbers;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class RomanNumbersRepo {

    private final String linkFile = "src/main/resources/data_roman.json";
    private static List<RomanNumbers> listNumbers = null;
    private static ObjectMapper mapper = new ObjectMapper();


    public List<RomanNumbers> getAllRomanNumbers() {

        try {
            listNumbers = Arrays.asList(mapper.readValue(new File(linkFile), RomanNumbers[].class));
        } catch (Exception ex) {
        }
        return listNumbers;
    }

    public List<RomanNumbers> getRomanNumberByDecimalNumber() {
        try {
            listNumbers = Arrays.asList(mapper.readValue(new File(linkFile), RomanNumbers[].class));
        } catch (Exception ex) {

        }
        return listNumbers;
    }
}
