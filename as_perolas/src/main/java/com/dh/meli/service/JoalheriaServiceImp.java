package com.dh.meli.service;

import com.dh.meli.exception.JoiaNotFoundException;
import com.dh.meli.model.Joalheria;
import com.dh.meli.repository.IJoiaDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoalheriaServiceImp implements IJoalheriaService {

    @Autowired
    private IJoiaDbRepo repo;

    @Override
    public Joalheria insertJoia(Joalheria newJoia) {
        if (newJoia.getId() > 0 ){
            throw new JoiaNotFoundException("A joia não pode ter ID para ser inserido");
        }
        return repo.save(newJoia);
    }

    @Override
    public List<Joalheria> listAll() {
        return (List<Joalheria>) repo.findAll();
    }
}
