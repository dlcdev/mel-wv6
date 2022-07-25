package com.dh.meli.service;

import com.dh.meli.model.Joalheria;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IJoalheriaService {
    Joalheria insertJoia(Joalheria joalheria);

    Joalheria getById(long id);
    List<Joalheria> listAll();

    Joalheria updateParcialById(long id, Map<String, String> changes);
    Joalheria updateJoiaById(long id, Joalheria joia);

    public void deleteById( long id);

}
