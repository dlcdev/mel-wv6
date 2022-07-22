package com.dh.meli.controller;

import com.dh.meli.model.Joalheria;
import com.dh.meli.repository.IJoiaDbRepo;
import com.dh.meli.service.JoalheriaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/joalheria")
@ControllerAdvice
public class JoalheriaController {

    @Autowired
    private JoalheriaServiceImp service;

    @PostMapping
    public ResponseEntity<Joalheria> insertNewJoia(@RequestBody Joalheria joia) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.insertJoia(joia));
    }

    @GetMapping
    public ResponseEntity<List<Joalheria>> listAll(){
        return ResponseEntity.ok(service.listAll());
    }

}
