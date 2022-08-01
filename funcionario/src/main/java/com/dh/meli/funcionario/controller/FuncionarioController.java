package com.dh.meli.funcionario.controller;

import com.dh.meli.funcionario.model.Funcionario;
import com.dh.meli.funcionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;


    @GetMapping
    public ResponseEntity<List<Funcionario>> getAllEmployee() {
        return ResponseEntity.ok(service.getAllEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getEmployeeById(@PathVariable int id) {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @PostMapping("/new")
    public ResponseEntity<Funcionario> saveNewEmployee(@RequestBody Funcionario newEmployee) {
        return ResponseEntity.ok(service.saveNewEmployee(newEmployee));
    }

    @PutMapping
    public ResponseEntity<Funcionario> updateEmployee(@RequestBody Funcionario funcionario) {
        return ResponseEntity.ok(service.updateEmployee(funcionario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable int id) {
        return ResponseEntity.ok(service.deleteEmployeeById(id));
    }


}
