package br.dh.meli.controller;

import br.dh.meli.model.UserDB;
import br.dh.meli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
@ControllerAdvice
public class UserBdController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDB> buscaPorId(@PathVariable long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserDB> buscaPorEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }


    @PostMapping
    public ResponseEntity<UserDB> insertNewUser(@RequestBody UserDB user) {
        // TODO: validar se o user tem ID: disparar exception

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.insertUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable long id) {

        service.deleteUser(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<UserDB>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @PutMapping
    public ResponseEntity<UserDB> updateUser(@RequestBody UserDB userDB) {
        return ResponseEntity.ok(service.update(userDB));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserDB> updatePartial(@PathVariable long id, @RequestBody Map<String, String> changes) {
        return ResponseEntity.ok(service.updatePartial(id, changes));
    }

}
