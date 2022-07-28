package com.dh.meli.qa_bugs.repository;

import com.dh.meli.qa_bugs.model.TestCase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TestCaseRepo extends CrudRepository<TestCase, Long> {
    @Query("select test from TestCase test where test.last_update= :lastUpdate")
    TestCase findByLastUpdate(Date lastUpdate);

}
