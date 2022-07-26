package com.dh.meli.qa_bugs.repository;

import com.dh.meli.qa_bugs.model.TestCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRepo extends CrudRepository<TestCase, Long> {

}
