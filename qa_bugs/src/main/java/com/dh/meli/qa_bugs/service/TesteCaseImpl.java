package com.dh.meli.qa_bugs.service;

import com.dh.meli.qa_bugs.model.TestCase;
import com.dh.meli.qa_bugs.repository.TestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteCaseImpl implements ITestCaseService {

    @Autowired
    private TestCaseRepo repo;

    @Override
    public TestCase saveTestCase(TestCase newTestCase) {
        if (newTestCase.getId_case() > 0) {
            throw new RuntimeException("Este ID ja existe.");
        }
        return repo.save(newTestCase);
    }

    @Override
    public TestCase getFindById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<TestCase> getAllTestCases() {
        return (List<TestCase>) repo.findAll();
    }
}
