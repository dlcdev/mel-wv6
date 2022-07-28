package com.dh.meli.qa_bugs.service;

import com.dh.meli.qa_bugs.model.TestCase;
import com.dh.meli.qa_bugs.repository.TestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public TestCase updateTestCase(long id, TestCase updateTestCase) {
        TestCase foundTestCase = getFindById(id);

        foundTestCase = updateTestCase;
        foundTestCase.setId_case(id);

        return repo.save(foundTestCase);
    }

    @Override
    public TestCase getFindById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<TestCase> getAllTestCases() {
        return (List<TestCase>) repo.findAll();
    }

    @Override
    public String deleteTestCase(long id) {
        repo.deleteById(id);
        return String.format("Test Case id: %s removed with Success!", id);
    }

    @Override
    public TestCase findByLastUpdate(Date last_update) {
        TestCase result = repo.findByLastUpdate(last_update);
        System.out.println(result);
        return result;
    }
}
