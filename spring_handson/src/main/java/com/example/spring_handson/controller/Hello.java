package com.example.spring_handson.controller;

import com.example.spring_handson.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta classe é um controller Rest
@RequestMapping("/user") // indica que "/user" é usado para acionar este controller
public class Hello {


    @GetMapping("/ola/{name}/{id}") // Este método é acionado por uma requisição Get
    public String sayHello(@PathVariable String name, @PathVariable int id) {
        return "Hello!" + name + ": " + id + "!";
    }

    @GetMapping("/ola") // Este método é acionado por uma requisição Get
    public String sayHello2(@RequestParam String name, @RequestParam int id) {
        return "Hello!" + name + ": " + id + "!";
    }

//    @PostMapping
//    public String getUser(@RequestBody User user) {
//        // GET user
//        return "Usuário recebido: " + user.toString();
//    }

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody User user) {
        // GET user
        if (user.getId() == 123) {
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

}
