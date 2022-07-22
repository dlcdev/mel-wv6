package br.dh.meli.controller;

import br.dh.meli.model.UserDB;
import br.dh.meli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserBdController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDB> buscaPorId(@PathVariable long id) {
        Optional<UserDB> userFound = service.getUserById(id);

        if (!userFound.isEmpty() ){
            return ResponseEntity.ok(userFound.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<UserDB> insertNewUser(@RequestBody UserDB user) {
        // TODO: validar se o user tem ID: disparar exception

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.insertUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable long id){
        Optional<UserDB> userFound = service.getUserById(id);

        if(userFound.isPresent()){
            service.deleteUser(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<UserDB>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }



}
