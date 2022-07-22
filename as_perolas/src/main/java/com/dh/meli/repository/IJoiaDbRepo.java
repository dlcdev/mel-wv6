package com.dh.meli.repository;

import com.dh.meli.model.Joalheria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiaDbRepo extends CrudRepository<Joalheria, Long> {

}
