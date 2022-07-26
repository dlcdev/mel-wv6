package com.dh.meli.qa_bugs.service;

import com.dh.meli.qa_bugs.model.TestCase;

import java.util.List;

public interface ITestCaseService {
    TestCase saveTestCase(TestCase newTestCase);

    TestCase getFindById(long id);
    List<TestCase> getAllTestCases();
}
