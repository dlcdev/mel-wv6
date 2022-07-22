package com.dh.meli.service;

import com.dh.meli.model.Joalheria;

import java.util.List;

public interface IJoalheriaService {
    Joalheria insertJoia(Joalheria joalheria);
    List<Joalheria> listAll();
}
