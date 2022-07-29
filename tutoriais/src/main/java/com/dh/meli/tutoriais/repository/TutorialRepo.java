package com.dh.meli.tutoriais.repository;

import com.dh.meli.tutoriais.model.Tutorial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepo extends CrudRepository<Tutorial, Long> {
    List<Tutorial> findTutorialByPublished(boolean published);

    @Query("select t from Tutorial t where t.title like %:title%")
    List<Tutorial> findTutorialByTitle(String title);

}
