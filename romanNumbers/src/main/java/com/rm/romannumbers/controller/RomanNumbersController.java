package com.rm.romannumbers.controller;

import com.rm.romannumbers.model.RomanNumbers;
import com.rm.romannumbers.serivce.RomanNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RomanNumbersController {

    @Autowired
    private RomanNumbersService service;

    @GetMapping("/roman")
    public ResponseEntity<java.util.List<RomanNumbers>> getAllRomanNumbers() {
        List<RomanNumbers> listRomanNumbers = service.getAllRomanNumbers();
        return ResponseEntity.ok(listRomanNumbers);
    }

    @GetMapping("/roman/{decimalNumber}")
    public ResponseEntity getRomanNumberByDecimalNumber(@PathVariable int decimalNumber) {
        return ResponseEntity.ok().body(service.getRomanNumberByDecimalNumber(decimalNumber));
    }

}
