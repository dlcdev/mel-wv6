package com.dh.meli.qa_bugs.service;

import com.dh.meli.qa_bugs.model.TestCase;

import java.util.Date;
import java.util.List;

public interface ITestCaseService {
    TestCase saveTestCase(TestCase newTestCase);
    TestCase updateTestCase(long id, TestCase updateTestCase);

    TestCase getFindById(long id);
    List<TestCase> getAllTestCases();

    String deleteTestCase(long id);

    TestCase findByLastUpdate(Date last_update);
}
