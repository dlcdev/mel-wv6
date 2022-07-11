package com.rm.romannumbers.serivce;

import com.rm.romannumbers.model.RomanNumbers;
import com.rm.romannumbers.repository.RomanNumbersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RomanNumbersServiceImpl implements RomanNumbersService {
    @Autowired
    private RomanNumbersRepo repo;
    @Override
    public List<RomanNumbers> getAllRomanNumbers() {

        List<RomanNumbers> listNumbers = repo.getAllRomanNumbers();
        return listNumbers;
    }

    @Override
    public List<String> getRomanNumberByDecimalNumber(int decimalNumber) {
        List<RomanNumbers> romanNumbersList = repo.getRomanNumberByDecimalNumber();
        return romanNumbersList.stream()
                .filter(d -> d.getDecimalNumber() == decimalNumber)
                .map(r -> r.getRomanNumber())
                .collect(Collectors.toList());
    }
}