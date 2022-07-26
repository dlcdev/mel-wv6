package com.dh.meli.qa_bugs.controller;

import com.dh.meli.qa_bugs.model.TestCase;
import com.dh.meli.qa_bugs.service.TesteCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private TesteCaseImpl service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> newTestCase(@RequestBody TestCase newTestCase) {
        return ResponseEntity.ok(service.saveTestCase(newTestCase));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> getTestCaseById(@PathVariable long id) {
        return ResponseEntity.ok(service.getFindById(id));
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> getAllTestCases(){
        return ResponseEntity.ok(service.getAllTestCases());
    }

}
