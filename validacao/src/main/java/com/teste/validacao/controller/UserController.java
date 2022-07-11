package com.teste.validacao.controller;

import com.teste.validacao.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping
    public ResponseEntity<UserDto> saverUser(@RequestBody @Valid UserDto userDto){
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

}
