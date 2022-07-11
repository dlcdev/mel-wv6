package com.meli.morsecode.controller;

import com.meli.morsecode.services.MorseCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class MorseCodeController {

    @Autowired
    private MorseCodeService service;

    @GetMapping("/morse-code")
    public ResponseEntity<Object> getAllMorseCode(
            @RequestParam(required = false) String morseCode
    ) throws IOException {
        return ResponseEntity.ok(service.getAllMorseCode(morseCode));
    }

}
