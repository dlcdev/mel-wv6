package com.dh.meli.controller;

import com.dh.meli.model.Joalheria;
import com.dh.meli.service.JoalheriaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping
@ControllerAdvice
public class JoalheriaController {

    @Autowired
    private JoalheriaServiceImp service;

    @PostMapping("/joia/inserir")
    public ResponseEntity<Joalheria> insertNewJoia(@RequestBody Joalheria joia) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.insertJoia(joia));
    }

    @GetMapping("/joias")
    public ResponseEntity<List<Joalheria>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("joia/{id}")
    public ResponseEntity<Joalheria> getById(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @DeleteMapping("/joia/excluir/{id}")
    public ResponseEntity<Joalheria> deleJoia(@PathVariable long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/joia/atualizar/{id}")
    public ResponseEntity<Joalheria> updateJoiaById(@PathVariable long id, @RequestBody Joalheria joia){
        return ResponseEntity.ok(service.updateJoiaById(id, joia));
    }

    @PatchMapping("/joia/parcial/atualizar/{id}")
    public ResponseEntity<Joalheria> updateParcialJoiaById(
            @PathVariable long id, @RequestBody Map<String, String> changes) {
        return ResponseEntity.ok(service.updateParcialById(id, changes));
    }


}
