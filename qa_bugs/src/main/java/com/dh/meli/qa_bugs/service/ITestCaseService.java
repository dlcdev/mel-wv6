package com.dh.meli.qa_bugs.service;

import com.dh.meli.qa_bugs.model.TestCase;

public interface ITestCaseService {
    TestCase saveTestCase(TestCase newTestCase);
}
